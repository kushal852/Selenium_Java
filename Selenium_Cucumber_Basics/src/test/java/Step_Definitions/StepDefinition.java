package Step_Definitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition {

	@Given("^User is on landing page$")
	public void user_is_on_landing_page() {
		System.out.println("Navigated to landing page");
		
	}
	
	
	@When("User login into application with username {string} and password {string}")
	public void user_login_into_application_with_username_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("enter username and password");
		System.out.println(string);
		System.out.println(string2);
	}
	
	@Then("^Home page is populated$")
	public void home_page_is_populated() {
		System.out.println("home page");
	}
	
	@Then("cards displayed is {string}")
	public void cards_displayed_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string);
		
	}

}