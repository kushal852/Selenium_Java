package Object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rediff_login_page_withoutPF {
	
	// PF IN THE CLASS NAME REPRESENTS PAGE FACTORY
	
	WebDriver driver;
	
	//constructor is executed automatically when an object is created for the class(If constructor is not defined then default constructor will be called)
	// constructor
	public rediff_login_page_withoutPF(WebDriver driver) {
		
		/*
		 * this.driver represents the local driver object
		 * driver object represents the driver object which comes from the test case
		 */
		this.driver = driver;
		
	}
	
	
	By username = By.id("login1");
	By password = By.id("password");
	By signed_in_checkbox = By.id("remember");
	By home_page_link = By.linkText("rediff.com");
	
	
	
	public WebElement email() {
		
		return driver.findElement(username);
	}
	
    public WebElement password() {
		
		return driver.findElement(password);
	}
    
    public WebElement keep_me_signed_in() {
		
		return driver.findElement(signed_in_checkbox);
	}
    
    public WebElement home_page_navigate() {
		
		return driver.findElement(home_page_link);
	}
    
    

}
