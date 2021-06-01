package Framework.E2E_Project;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import PageObjects.forgot_passwordpage;
import PageObjects.landing_page;
import PageObjects.login_page;
import resources.Baseclass;

// using extends keyword  we can inherit all the methods from baseclass to homepage class

public class HomePageTest extends Baseclass{
	public static Logger log =LogManager.getLogger(HomePageTest.class.getName());
	public WebDriver driver;
	@BeforeTest
	public void browser_setup() throws IOException {
		
		driver = intializeDriver();
		log.info("Intialization of driver is successful");
		
		//driver.get(System.getProperty("url"));
		
	}
	
	@Test(dataProvider = "get_data")
	public void home_page_nav(String username, String password) throws IOException, InterruptedException  {
		
		// since the intializedriver return webdriver we are using driver variable andcatching the returned websriver
		
		driver.get(prop.getProperty("url"));
		landing_page lp = new landing_page(driver);
		
		try  {
			lp.pop_click().click();
			log.info("No Thanks option inside popup is clicked successfully");
		}
		catch(Exception e) {
			
			log.debug("No Thanks option inside popup is not clicked");
		}
		
		SoftAssert a = new SoftAssert();
		a.assertEquals(lp.title_validation().getText(), "FEATURED COURSES");
		log.info(lp.title_validation().getText()+" text is visible inside the web page");
		Assert.assertTrue(lp.contact_link_valid().isDisplayed());
		login_page lop = lp.login();
		log.info("login button is clicked successfully");
		
		
		lop.username().sendKeys(username);
		log.info("username entered successfully");
		lop.password().sendKeys(password);
		log.info("password entered successfully");
		lop.login_click().click();
		
		forgot_passwordpage fp = lop.forgot_password_click();
		fp.email().sendKeys("xxx");
		fp.instructions().click();
		
		
		
	}
	
	@AfterTest
	public void teardown() throws IOException {
		
		driver.close();
	}
	
	
	
	
	@DataProvider
	public Object[][] get_data() {
		
		Object[][] o = new Object[2][2];
		
		o[0][0] = "Banned_user@gmail.com";
		o[0][1] = "12345";
		
		o[1][0] = "unbanned_user@gmail.com";
		o[1][1] = "12345";
		
		return o;
		
	}

}
