package Demo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto_Suggestive_Dropdowns_Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Countries')]")).sendKeys("ind");
		
		
		
		Thread.sleep(1000);
		List<WebElement> options = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div"));
		
		for(WebElement option:options) {
			
			if(option.getText().equalsIgnoreCase("india")) {
				option.click();
				break;
			}
		}

	}

}
