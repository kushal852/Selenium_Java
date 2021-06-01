package Object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rediff_home_page_withPF {
	
	
WebDriver driver;
	
	//constructor is executed automatically when an object is created for the class(If constructor is not defined then default constructor will be called)
	// constructor
	public rediff_home_page_withPF(WebDriver driver) {
		
		/*
		 * this.driver represents the local driver object
		 * driver object represents the driver object which comes from the test case
		 */
		this.driver = driver;
		PageFactory.initElements(driver, this.driver);
		
	}
	
	
	@FindBy(xpath = "//input[@id='query']")
	WebElement search;
	
	@FindBy(css =".getqbtn")
	WebElement submit;
	
	
	
	public WebElement company_search() {
		
		return search;
	}
	
	
	public WebElement company_search_submit() {
		
		return submit;
	}
	
    
    

}
