package Demo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Flight_website_E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		// Auto suggestive drop downs
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option : options) {
			
			if (option.getText().equalsIgnoreCase("India")) {
				
				//Assert.assertTrue(option.isDisplayed());
				option.click();
				break;
			}
		}
		
		// Dynamic Dropdowns
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(1000L);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		
		// Checkbox handling
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//Static Dropdowns
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000L);
		for (int i=0; i<4; i++) {
			
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		/*
		int j = 1;
		while(j<4) {
			
			driver.findElement(By.id("hrefIncChd")).click();
			j = j + 1;
		}
		*/
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		
		driver.findElement(By.cssSelector("input[id*='FindFlights']")).click();
		driver.quit();
	}

}

