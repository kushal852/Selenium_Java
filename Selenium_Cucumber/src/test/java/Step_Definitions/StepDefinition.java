package Step_Definitions;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


import PageObjects.landing_page;
import PageObjects.login_page;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;

import io.cucumber.junit.Cucumber;
import resources.Baseclass;

@RunWith(Cucumber.class)
public class StepDefinition extends Baseclass{
	
	public static Logger log =LogManager.getLogger(StepDefinition.class.getName());
	public WebDriver driver;
	 landing_page lp;
	 login_page lop;
	

	@Given("Initialize the browser with chrome")
	public void initialize_the_browser_with_chrome() throws IOException {
		driver = intializeDriver();
		log.info("Intialization of driver is successful");;
	}

	@Given("navigate to {string} site")
	public void navigate_to_site(String url) {
	    // Write code here that turns the phrase above into concrete actions
		// driver.get(prop.getProperty("url")); -- this used to get url from mvn commands or properties file
		driver.get(url);// here we can send the url from feature file.
	}
	
	 @When("^click on popup if available$")
	    public void click_on_popup_if_available() throws Throwable {
		 lp = new landing_page(driver);
		 System.out.println(lp.getPopUpSize());
		 if(lp.getPopUpSize()>0) {
				lp.pop_click().click();
			}
	    }
	
	@Given("validate the featured courses with {string} value")
	public void validate_the_featured_courses_with_value(String string) {
		
		SoftAssert a = new SoftAssert();
		a.assertEquals(lp.title_validation().getText(), string);
		log.info(lp.title_validation().getText()+" text is visible inside the web page");
	}

	@When("Validate the {string} link is displayed in the home page")
	public void validate_the_link_is_displayed_in_the_home_page(String string) {
		;
		Assert.assertTrue(lp.contact_link_valid().isDisplayed());
	  
	}

	@Given("Click on link on home page to land on secure sign page")
	public void click_on_link_on_home_page_to_land_on_secure_sign_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		lop = lp.login();
		
	}
	
	@When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		lop.username().sendKeys(username);
		lop.password().sendKeys(password);
		lop.login_click().click();
		   
    }

	/*@When("User enters {string} and {string} and logs in")
	public void user_enters_and_and_logs_in(String string, String string2) {
	   lop.username().sendKeys(string);
	   lop.password().sendKeys(string2);
	   lop.login_click().click();
	   
	}*/

	@Then("Verify that user successfully logged in")
	public void verify_that_user_successfully_logged_in() {
	    
	}
	
	@And("^close all browsers$")
    public void close_all_browsers() throws Throwable {
        driver.quit();
    }
}