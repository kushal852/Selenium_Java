package waits;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecommerce_add_to_Cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);// this will be applied globally
		String[] itemsneeded = {"Cucumber","Beans","Potato","Musk Melon"}; // array accepts strings or any other data types as input
		addItems(driver,itemsneeded);   // since this method is static we need to create object for this
		//Ecommerce_add_to_Cart cart = new Ecommerce_add_to_Cart();
		//cart.addItems(driver,itemsneeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'CHECKOUT')]")).click();
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		WebDriverWait E_wait = new WebDriverWait(driver,5);
		E_wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
			
			}
		
	// Method declartion outside main and inside the class to create a instance of the object and use the method from the object created
	
	 public static void addItems(WebDriver driver,String[] itemsneeded ){
		 
		 List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));// list accepts objects 
			int count = 0;
			for (int i=0;i<products.size();i++) {
			    
				String[] productName = products.get(i).getText().split("-");
				List neededItemsList = Arrays.asList(itemsneeded);
				
				
				if (neededItemsList.contains(productName[0].trim())) {
					System.out.println(productName[0].trim());
					count++;
					driver.findElements(By.cssSelector("div.product-action")).get(i).click();
					  //driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
					if (count == itemsneeded.length) {
						break;
					}
				    
				
			}
						
						
						
					
					
				}
		 
		 
	 }
		

	}


