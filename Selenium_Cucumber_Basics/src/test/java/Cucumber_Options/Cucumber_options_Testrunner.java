package Cucumber_Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features",
		glue = "Step_Definitions",
		stepNotifications=true
		)
public class Cucumber_options_Testrunner {

}
