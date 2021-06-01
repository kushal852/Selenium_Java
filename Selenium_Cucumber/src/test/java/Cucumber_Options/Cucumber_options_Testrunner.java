package Cucumber_Options;

import org.junit.runner.RunWith;

//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features",
		glue = "Step_Definitions"
		//stepNotifications=true -  this should be writtern when we are executing with junit
		)
// by inheriting AbstractTestNGCucumberTests we are converting junit test to testng test and prerequisite for this add cucumber testng jar in pom.xml
public class Cucumber_options_Testrunner extends AbstractTestNGCucumberTests {

}
