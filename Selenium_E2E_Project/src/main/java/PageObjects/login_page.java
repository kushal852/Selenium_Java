package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	
	public WebDriver driver;
	
	public login_page(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this.driver);
	}
	
	//encapuslation - private variables, public methods
	private By login_email = By.id("user_email");
	private By log_password = By.id("user_password");
	private By login_button = By.cssSelector(".login-button");
	private By forgotpassword = By.cssSelector("a[href*=password]");
	
	
	
	public WebElement username() {
		
		return driver.findElement(login_email);
	}
	
   public WebElement password() {
		
		return driver.findElement(log_password);
	}
   
   public WebElement login_click() {
		
		return driver.findElement(login_button);	
		
	}
   
   public forgot_passwordpage forgot_password_click() {
		
		driver.findElement(forgotpassword).click();
		forgot_passwordpage fpg = new forgot_passwordpage(driver);
		return fpg;
	}
  
   
   
	
   
	

}
