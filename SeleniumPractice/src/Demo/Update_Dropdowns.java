package Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Update_Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//the value inside the dropdowns can be updated.
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		for (int i=0; i<4; i++) {
			
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		
		int j = 1;
		while(j<4) {
			
			driver.findElement(By.id("hrefIncChd")).click();
			j = j + 1;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult, 3 Child");
		driver.quit();
		

	}

}
