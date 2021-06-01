package Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; // 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("guptakushal1039@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("Akhil@123");
		driver.findElement(By.xpath("//button[normalize-space()='Log In']")).click();
		
		
		
		
		
		
		


	}

}
