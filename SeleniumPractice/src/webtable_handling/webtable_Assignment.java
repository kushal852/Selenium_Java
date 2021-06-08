package webtable_handling;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//print number of rows
		int rows = driver.findElements(By.cssSelector("table[name='courses'] tr")).size();
		System.out.println(driver.findElements(By.cssSelector("table[name='courses'] tr")).size());
		//int columns = driver.findElements(By.cssSelector("table[name='courses'] tr th")).size();
		System.out.println(driver.findElements(By.cssSelector("table[name='courses'] th")).size());
		
		for (int i=0;i<rows;i++) {	
				if(i==2) {
					
					System.out.println(driver.findElements(By.cssSelector("table[name='courses'] tr")).get(i).getText());
					break;
			}
		}
		
		// getting the sum of all courses
		List<WebElement> values = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/td[3]"));
		int sum = 0;
		for(WebElement value:values) {
			
			sum = sum + Integer.parseInt(value.getText());
		}
		
		System.out.println(sum);
		
		driver.quit();

	}

}
