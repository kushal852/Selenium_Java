package Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UIObjects_enable_and_disable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		if (driver.findElement(By.id("Div1")).getAttribute("Style").contains("1")) {
			System.out.println("True");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertFalse(false);
		}
		
		

	}

}
