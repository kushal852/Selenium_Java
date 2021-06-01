package Demo;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class webtable_Filter_JavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#search-field")).sendKeys("Rice");
		
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> filtered_strings = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		Assert.assertTrue(filtered_strings.contains("Rice"));
		
		
		

	}

}
