package Action_class;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","D:\\study\\Selenium Java\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions action_class = new Actions(driver);
		// Build is method used to build the action which we want perform and perform method will execute the action which is builded.
		//action_class.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		// composite action where we are clicking on search bar, entering string in the search bar in capital letter by making the shift key down
		action_class.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("alexa").doubleClick().perform();
		//action_class.moveToElement(driver.findElement(By.cssSelector("#nav-search-submit-button"))).click().build().perform();
		//right click a particular element
		action_class.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).contextClick().build().perform();
		
	}

}
