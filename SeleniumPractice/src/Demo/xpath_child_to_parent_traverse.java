package Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_child_to_parent_traverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/#/index");
		driver.manage().window().maximize();
		/*
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("kushal");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']/center/input[1]/following-sibling::input")).click();
		*/
		/*
		int a = driver.findElements(By.xpath("//ul[@class='navigation clearfix']/li")).size();
		System.out.println(a);
		for(int i = 0; i<a;i++) {
			
			if (i == 1){
				
				driver.findElement(By.xpath("//ul[@class='navigation clearfix']/li[i]")).click();	
				System.out.println(driver.getCurrentUrl());
			}
			else {
				
				driver.findElement(By.xpath("//ul[@class='navigation clearfix']/li[1]/following-sibling::li[i]")).click();
				System.out.println(driver.getCurrentUrl());
			}
			
			
		}
		*/
		
		//driver.findElement(By.xpath("//ul[@class='navigation clearfix']/li[@class='current']")).click();
		driver.findElement(By.xpath("//a[text()='Courses']")).click();
		driver.findElement(By.xpath("//ul[@class='navigation clearfix']/li[1]/following-sibling::li[2]")).click();
		driver.findElement(By.xpath("//ul[@class='navigation clearfix']/li[1]/following-sibling::li[3]")).click();
		driver.findElement(By.xpath("//ul[@class='navigation clearfix']/li[1]/following-sibling::li[4]")).click();
		driver.findElement(By.xpath("//ul[@class='navigation clearfix']/li[1]/following-sibling::li[5]")).click();
		driver.findElement(By.xpath("//ul[@class='navigation clearfix']/li[1]/following-sibling::li[6]")).click();
		driver.findElement(By.xpath("//ul[@class='navigation clearfix']/li[1]/following-sibling::li[7]")).click();
		
	}
	
		

}
