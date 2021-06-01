package Demo;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class webtablehandling_With_JavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * click on column
		 * capture all webelements into list
		 * capture text of all webelements into new(original) list
		 *  sort on the original list of step 3 -> sorted list
		 *  compare original list vs sorted list
		 * */
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		// clicking on sort button
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		
		
		// capture all webelements into list
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		
		//capture text of all webelements into new(original) list
		List<String> original_List =elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort on the original list of step 3 -> sorted list
		 List<String> sorted_List = original_List.stream().sorted().collect(Collectors.toList());
				
		Assert.assertTrue(original_List.equals(sorted_List));
		
		List<String> price = Collections.emptyList();;

		// scan the name column with getText ->Beans->print the price of the Rice

		while(price.size()<1){
			
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			
			price = rows.stream().filter(s->s.getText().contains("Rice"))
					.map(s->getPriceVeggie(s)).collect(Collectors.toList());
			price.forEach(a->System.out.println(a));
			if(price.size()<1) {
				
				 driver.findElement(By.cssSelector("[aria-label='Next']")).click();
				
			}
		};

		
		}



		private static String getPriceVeggie(WebElement s) {

		// TODO Auto-generated method stub

		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();



		return pricevalue;

		

	}

}
