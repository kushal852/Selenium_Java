package Demo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class broken_Link_Validation {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		/*
		 *  getting links in a particular webpage
		 *  getting links in the footer(bottom) section of web page
		 *  getting links in  column one of the footer section of web page
		 *  clicking on the links of column one of the footer section of web page and getting the titles of newly opened web pages
		 * */
		
		// getting links in a particular webpage
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// getting links in the footer(bottom) section of web page
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		int links = footerdriver.findElements(By.tagName("a")).size();
		
		SoftAssert a = new SoftAssert();
		
       for (int i=1; i<links;i++) {
			
			
			// getting all the urls using href atrribute inside 'a' tag from the footer section by limiting web driver scope
			String url = footerdriver.findElements(By.tagName("a")).get(i).getAttribute("href");
			
			// establishing the HTTP connection and opening the url and getting response code because a broken will have response greater than 400.
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responsecode = conn.getResponseCode();
			System.out.println(url);
			a.assertTrue(responsecode<400, "The broken link is " + footerdriver.findElements(By.tagName("a")).get(i).getAttribute("href") +" response as: "+responsecode);
			/*
			 * hard assertion where script stop execution and we cannot detect the issues after this failure
			Assert.assertTrue(responsecode>400, "The broken link is " + footerdriver.findElements(By.tagName("a")).get(i).getAttribute("href") +" response as: "+responsecode);
			*/
			/*if(responsecode>400) {
				System.out.println("The broken link is " + footerdriver.findElements(By.tagName("a")).get(i).getAttribute("href") +" response as: "+responsecode);
				
				;
				
			}*/
			
			
		}
       
       a.assertAll();
	    
		

	}

}
