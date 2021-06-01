package test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Object_repository.rediff_home_page_withPF;
import Object_repository.rediff_login_page_withoutPF;

public class rediff_test {

	
	@Test
	public void login() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		/*
		rediff_login_page_withoutPF rl = new rediff_login_page_withoutPF(driver);
		rl.email().sendKeys("kushalgupta852@gmail.com");
		rl.password().sendKeys("Akhil@852");
		rl.keep_me_signed_in().click();
		rl.home_page_navigate().click();
		*/
		rediff_home_page_withPF rh = new rediff_home_page_withPF(driver);
		rh.company_search().sendKeys("spacex");
		rh.company_search_submit().click();
		
	}
}
