package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

// Baseclass consists of methods which are  common across all the test cases like browser invocation, browser maximize

public class Baseclass {
	
	/* Properties class is used to directly drive the data from the properties file which contains the information of which browser needs to be used
	  and which browser needs to be launched
	 */
	public WebDriver driver;// this is declared publicly because we need to create webdriver instance in all if conditions
	
	public Properties prop;
	public WebDriver intializeDriver() throws IOException {
		
		 prop = new Properties();
		String current_path = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(current_path+"\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		String browser_type = prop.getProperty("browser"); // retrieving browser parameter from properties file
		//String browser_type = System.getProperty("browser"); // retrieving browser parameter from maven command
		System.out.println(browser_type);
		
		 if (browser_type.contains("chrome") ) {
			System.out.println(browser_type);
			System.setProperty("webdriver.chrome.driver",current_path+"\\src\\main\\java\\resources\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			if (browser_type.contains("headless")){
				
				options.addArguments("headless");// to run the test without opening browser.
				
				
			}
			driver = new ChromeDriver(options);
			
			
		}
		else if(browser_type.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver",current_path+"\\src\\main\\java\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			
		}
		else if(browser_type.equalsIgnoreCase("IE")){
			
		}
		
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	public String get_screenshot(String testcasename, WebDriver driver) throws IOException {
		
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File source_file = screenshot.getScreenshotAs(OutputType.FILE);
		String destination_path = System.getProperty("user.dir")+"\\reports\\"+ testcasename+".png";
		FileUtils.copyFile(source_file,new File(destination_path));
		return destination_path;
		
		/*
		 * 
		 * 
		 * String screenName= System.currentTimeMillis()+ ".png";

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		try

		{

		FileHandler.copy(src, new File(System.getProperty("user.dir")+"/target/Screenshots/"+screenName+""));

		}

		catch(IOException e)

		{

		System.out.println(e.getMessage());

		}
		 * 
		 * */
		
	}

}
