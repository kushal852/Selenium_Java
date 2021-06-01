package Demo;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_commerce_trainer_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] products = { "Cucumber", "Mushroom", "Beans", "Water Melon" };

		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		E_commerce_trainer_code gk = new E_commerce_trainer_code();

		gk.addCart(driver, products);

		}

		public void addCart(WebDriver driver, String[] products)

		{

		int count = 0;

		List<WebElement> productNameList = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < productNameList.size(); i++) {

		for (int j = 0; j < products.length; j++)

		if (productNameList.get(i).getText().contains(products[j].toString())) {

		count++;

		driver.findElements(By.cssSelector("div.product-action")).get(i).click();

		if (count == products.length)

		break;

		}

		   }

	}

}
