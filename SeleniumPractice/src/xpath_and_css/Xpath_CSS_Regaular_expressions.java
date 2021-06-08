package xpath_and_css;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_CSS_Regaular_expressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".signin")).click();
		driver.findElement(By.xpath("//input[contains(@id,'login')]")).sendKeys("kushal");
		driver.findElement(By.cssSelector("input#password")).sendKeys("kushal");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		System.out.println(driver.findElement(By.cssSelector("div[id*='error']")).getText());
		

	}

}
