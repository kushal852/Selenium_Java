package Demo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Misc_excercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		/*List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement checkbox:checkboxes) {
			
			if(checkbox.getAttribute("id").equals("checkBoxOption2")) {
				checkbox.click();
				System.out.println(checkbox.getText());
			}
		}*/
		
		driver.findElement(By.id("checkBoxOption2")).click();
		String Selected_option = driver.findElement(By.xpath("//input[@id='checkBoxOption2']/parent::label")).getText();
		System.out.println(Selected_option);
		Select drop_down = new Select(driver.findElement(By.cssSelector("#dropdown-class-example")));
		drop_down.selectByVisibleText(Selected_option);
		
		driver.findElement(By.cssSelector("#name")).sendKeys(Selected_option);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		String alert_msg = driver.switchTo().alert().getText();
		if (alert_msg.contains(Selected_option)) {
			System.out.println(alert_msg);
			Assert.assertTrue(true, alert_msg);
		}

	}

}
