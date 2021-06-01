package Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_DropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// If values inside the dropdown doesn't changes then it is called as static dropdown.
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement s_dropdown_webelement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select static_dropdown = new Select(s_dropdown_webelement);
		static_dropdown.selectByIndex(2);
		System.out.println(static_dropdown.getFirstSelectedOption().getText());
		static_dropdown.selectByVisibleText("INR");
		System.out.println(static_dropdown.getFirstSelectedOption().getText());
		static_dropdown.selectByValue("USD");
		System.out.println(static_dropdown.getFirstSelectedOption().getText());
		

	}

}
