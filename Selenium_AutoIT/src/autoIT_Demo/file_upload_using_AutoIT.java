package autoIT_Demo;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class file_upload_using_AutoIT {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String downloadPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://smallpdf.com/word-to-pdf");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\study\\Selenium Java\\Section 38 -AutoIT\\FileUpload.exe");
		Thread.sleep(20000);
		/*WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Download']")));*/
		driver.findElement(By.xpath("//span[text()='Download']")).click();
		Thread.sleep(2000);
		File download_file = new File(downloadPath+"/framework info-converted.pdf");
		if(download_file.exists()) {
			System.out.println("File is present");
			Assert.assertTrue(download_file.exists());

			if(download_file.delete())

			System.out.println("file deleted");
		}
	}

}
