package Framework.E2E_Project;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjects.landing_page;

import resources.Baseclass;

public class ValidateTitle extends Baseclass{
	
	public static Logger log =LogManager.getLogger(ValidateTitle.class.getName());
	public WebDriver driver;
	public landing_page lp;
	@BeforeTest
	public void browser_setup() throws IOException {
		
		driver = intializeDriver();
		log.info("Intialization of driver is successful");
		driver.get(prop.getProperty("url"));
		//driver.get(System.getProperty("url"));
		
	}

	@Test
public void home_page_nav() throws IOException, InterruptedException  {
		
		// since the intializedriver return webdriver we are using driver variable andcatching the returned websriver
		
		 lp = new landing_page(driver);
		
		try  {
			lp.pop_click().click();
			log.info("No Thanks option inside popup is clicked successfully");
		}
		catch(Exception e) {
			
			log.debug("No Thanks option inside popup is not clicked");
		}
		
		
		//SoftAssert a = new SoftAssert();	
		Assert.assertEquals(lp.title_validation().getText(), "FEATURED COURSES");
		log.info(lp.title_validation().getText()+" text is visible inside the web page");
		Assert.assertTrue(lp.contact_link_valid().isDisplayed());
		//lp.login();
	
}
	// another test is created in the same class file since the validation is in the same page.
	@Test
	public void header_validation() {
		 lp = new landing_page(driver);
		System.out.println(lp.header_validation().getText());
		Assert.assertNotEquals(lp.header_validation().getText(), "An Academy to learn Everything about Testing");
	}
	
	
	@AfterTest
	public void teardown() throws IOException {
		
		driver.close();
	}
}
