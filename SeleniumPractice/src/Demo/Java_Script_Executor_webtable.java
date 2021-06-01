package Demo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Java_Script_Executor_webtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// that 0,500 co ordinates should be acheived with trail and error method
		js.executeScript("window.scroll(0,500)");
		Thread.sleep(2000L);
		// finding the webtable through dom element and scrolling inside the webtable.
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum = 0;
		
		for(int i=0;i<values.size();i++) {
			
			sum = sum + Integer.parseInt(values.get(i).getText());
			
		}
		
		int total_amount = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		System.out.println(total_amount);
		Assert.assertEquals(sum, total_amount);
		
		
		
		
		

	}

}
