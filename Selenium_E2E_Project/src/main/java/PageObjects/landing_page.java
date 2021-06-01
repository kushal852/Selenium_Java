package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landing_page {
	
	public WebDriver driver;
	
	public landing_page(WebDriver driver){
		
		this.driver = driver;
	}
	
	private By login_button = By.cssSelector("a[href*=sign_in]");
	private By contact_link_validation = By.xpath("//a[contains(text(),'Contact')]");
	private By title = By.cssSelector("div.text-center h2");
	private By popup = By.xpath("//button[contains(text(),'NO THANKS')]");
	private By header = By.xpath("//div[contains(@class,'video-banner')]/h3");
	
	public login_page login() {
		
		driver.findElement(login_button).click();
		login_page lop= new login_page(driver);
		return lop;
	}
	
	public WebElement contact_link_valid() {
		
		return driver.findElement(contact_link_validation);
	}
	
    public WebElement title_validation() {
		
		return driver.findElement(title);
	}
    
    public WebElement pop_click() {
		
  		return driver.findElement(popup);
  		
  		
  	}
    
   public WebElement header_validation() {
		
  		return driver.findElement(header);
  		
  		
  	}
    
    


}
