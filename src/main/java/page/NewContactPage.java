package page;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class NewContactPage {
	
	WebDriver driver;

	// Every Page must have a constructor to invite the driver
	public NewContactPage(WebDriver driver) {
		this.driver = driver;
	}
	


	// Element Library
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement NameField;
	@FindBy(how = How.XPATH, using = "//input[@id='company']")
	WebElement CompanyField;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement EmailField;
	@FindBy(how = How.ID, using = "submit")
	WebElement SubmitButton;
	By NEW_USER_VALIDATION_LOCATOR = By.xpath("//h5[contains(text(),'Tony')]");
	
	Random rnd = new Random();
	int num1 = rnd.nextInt(999);
	String expectedName = String.valueOf(num1) + "Tony";

	public void fillOutAccount() {
		
		NameField.sendKeys(expectedName);
		CompanyField.sendKeys("Teamworks");
		EmailField.sendKeys(num1 + "random@gmail.com");
		SubmitButton.click();
		return;
	}
	
	public void checkToSeeIfNewUserWasCreated() {
		String actualUser = driver.findElement(NEW_USER_VALIDATION_LOCATOR).getText();
		Assert.assertEquals("New User Was Successfull", expectedName, actualUser);
	}

	public void fillInNameField(String name) {
		NameField.sendKeys(expectedName);
	}

	public void fillInCompanyName(String companyName) {
		CompanyField.sendKeys(companyName);
	}

	public void fillInEmailField(String email) {
		EmailField.sendKeys(num1 + email);
	}

	public void clickOnSubmit() {
		SubmitButton.click();
	}

	public String getExpectedName() {
		return expectedName;
	}

	public List<String> getListOfContacts() {
		int index = getHeaderIndex("Name");
		List<WebElement> elements = driver.findElements(By.xpath("//table//tbody//td["+index+"]"));
		List<String> columndata = new ArrayList<>();
		for (WebElement e: elements) {
			columndata.add(e.getText());
		}
		return columndata;
	}

	private int getHeaderIndex(String columnName) {
		List<WebElement> elements = driver.findElements(By.xpath("//table//thead//th"));
		for(int i=0; i<elements.size();i++) {
			if(elements.get(i).getText().equalsIgnoreCase(columnName)) {
				return i+1;
			}
		}
		return 0;
	}

	public void clickOnListOfAccounts() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='List Contacts']")).click();
	}
	
}












