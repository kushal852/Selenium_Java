package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class forgot_passwordpage {
	
public WebDriver driver;
	
	public forgot_passwordpage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this.driver);
	}
	
	private By email_id = By.id("user_email");
	private By send_ins = By.cssSelector("input[type=submit]");
	
public WebElement email() {
		
		return driver.findElement(email_id);
	}

public WebElement instructions() {
	
	return driver.findElement(send_ins);
}
}
