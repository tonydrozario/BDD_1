package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "\\Users\\spdro\\eclipse-workspace\\techfios_bdd\\src\\test\\java\\features\\add_new_contact.feature", glue = {
		"steps" }, dryRun = false, monochrome = true, plugin = { "pretty", "html:test-output" })
public class AddNewContactRunner {

}
