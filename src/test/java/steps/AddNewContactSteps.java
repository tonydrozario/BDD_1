package steps;

import java.io.File;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.LoginPage;
import page.NewContactPage;
import page.SideNavigation;
import util.BrowserFactory;
import util.Databases;

public class AddNewContactSteps extends StepsBase{

	WebDriver driver;
	LoginPage loginPage;
	SideNavigation sideNav;
	NewContactPage newcontactpage;
	// Databases databases;

	@Before
	public void startFirst() {
		driver = BrowserFactory.startBrowser();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		sideNav = PageFactory.initElements(driver, SideNavigation.class);
		newcontactpage = PageFactory.initElements(driver, NewContactPage.class);
	}

	@Given("^a valid user with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void a_valid_user_with_username_and_password(String username, String password) {
		loginPage.login(username, password);
	}

	@Given("^a valid user with username$")
	public void a_valid_user_with_username_and_password() throws ClassNotFoundException, SQLException {
		loginPage.login(Databases.get("username"), Databases.get("password"));
	}

	@When("^user naviagtes to CRM --> Add Account$")
	public void user_naviagtes_to_CRM_Add_Account() throws InterruptedException {
		sideNav.goToNewAccountPage();
		Thread.sleep(2000);
	}

	@Then("^Add contact page should display$")
	public void add_contact_page_should_display() throws Exception {
		String expectedTitle = "Add Contact";
		screenShot(driver, "C://ScreenShots//newaccount.jpg");
		String actualTitle = driver.findElement(By.xpath("//h5[text()='Add Contact']")).getText();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@When("^user adds new contact with name \"([^\"]*)\" companyName \"([^\"]*)\" and email \"([^\"]*)\"$")
	public void user_adds_new_contact_with_name_companyName_and_email(String name, String companyName, String email) throws InterruptedException {
	 Thread.sleep(1000);
	 newcontactpage.fillInNameField(name);
	 newcontactpage.fillInCompanyName(companyName);
	 newcontactpage.fillInEmailField(email);
	 newcontactpage.clickOnSubmit();
	}

	@When("^user adds new contact$")
	public void user_adds_new_contact() throws InterruptedException {
		Thread.sleep(1000);
		newcontactpage.fillOutAccount();
	}

	@Then("^success message should appear$")
	public void success_message_should_appear() throws InterruptedException {
		Thread.sleep(3000);
		newcontactpage.checkToSeeIfNewUserWasCreated();
	}

	@Then("^contact should be displayed on the list contact page$")
	public void new_contact_should_display() throws InterruptedException {
		String expectedName = newcontactpage.getExpectedName();
		newcontactpage.clickOnListOfAccounts();
		Assert.assertTrue("Contact was not found", isContactMatching(expectedName, newcontactpage.getListOfContacts()));
	}

	private boolean isContactMatching(String expectedName, List<String> listOfContacts) {
		return listOfContacts.contains(expectedName);
	}

	@After
	public void close() {
		driver.close();
		driver.quit();
	}
}
