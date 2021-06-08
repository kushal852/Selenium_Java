package Dropdowns;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Dynamic drop downs are drop downs which are loaded depending upon user actions. 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000L);
		// selecting the second object using index in the 2 matching objects found.
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//parent-child locator is more efficient and good way of writing xpath instead of indexing
		// //div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] - parent and //a[@value='MAA'] - child
		// if there are multiple matching nodes for //a[@value='MAA'] then searching the same xpath in parent is a good way of making the object unique
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
        /*
         Parent child traverse locator is different from parent child relationship locator. 
         Parent child traverse is traverse or travelling from parent to child whereas, parent child relationship is searching the child xpath in parent xpath 
         */
	}

}
