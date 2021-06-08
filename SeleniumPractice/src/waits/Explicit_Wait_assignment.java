package waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Explicit_Wait_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Click to load get data via Ajax!")).click();
		WebDriverWait e_wait = new WebDriverWait(driver,5);
		e_wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results")));
		System.out.println(driver.findElement(By.cssSelector("#results")).getText());
		Assert.assertTrue(driver.findElement(By.cssSelector("#results")).getText().contains("Process completed!"));

	}

}
