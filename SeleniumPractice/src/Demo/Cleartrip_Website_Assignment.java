package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Cleartrip_Website_Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\geckodriver.exe"
		 * ); WebDriver driver = new FirefoxDriver();
		 */
		driver.manage().deleteAllCookies();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='origin']")).sendKeys("vis");
		Thread.sleep(2000L);
		List<WebElement> from_cities = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
		for (WebElement from_city : from_cities) {

			System.out.println(from_city.getText());
			if (from_city.getText().contains("VTZ")) {

				from_city.click();
				System.out.println(driver.findElement(By.xpath("//input[@name='origin']")).getText());
				break;
			}
		}

		driver.findElement(By.cssSelector("#ToTag")).sendKeys("chen");
		Thread.sleep(2000L);
		List<WebElement> to_cities = driver.findElements(By.xpath("//ul[@id='ui-id-2']/li/a"));

		for (WebElement to_city : to_cities) {

			System.out.println(to_city.getText());

			if (to_city.getText().contains("MAA")) {

				to_city.click();
				System.out.println(driver.findElement(By.cssSelector("#ToTag")).getText());
				break;
			}

			/* driver.findElement(By.xpath("//input[@id='DepartDate']")).click(); */
			Thread.sleep(1000L);
			driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

			WebElement adults = driver.findElement(By.xpath("//select[@name='adults']"));
			Select no_of_adults = new Select(adults);
			no_of_adults.selectByValue("3");

			WebElement child = driver.findElement(By.cssSelector("#Childrens"));
			Select no_of_childs = new Select(child);
			no_of_childs.deselectByVisibleText("2");

			// driver.findElement(By.xpath("//input[contains(@value,'flights')]")).click();

		}

	}

}
