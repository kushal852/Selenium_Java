package checkbox_and_child_window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox_assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       // https://rahulshettyacademy.com/AutomationPractice/
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//question 1
		
		/*
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		*/
		
		List <WebElement> checkboxes = driver.findElements(By.xpath("//div[@id='checkbox-example']/fieldset/label"));
		
		for (WebElement checkbox: checkboxes) {
			System.out.println(checkbox.getText());
			if (checkbox.getText().equalsIgnoreCase("Option1")) {
				
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();
				Assert.assertTrue(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();
				Assert.assertFalse(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
				break;
			}
		}
		
		//question2
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		driver.quit();
	}

}
