package checkbox_and_child_window;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_window_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> iterate = windows.iterator();
		String Parent_window = iterate.next();
		String Child_window = iterate.next();
		
		driver.switchTo().window(Child_window);
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		String email_id = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(email_id);
		driver.switchTo().window(Parent_window);
		driver.findElement(By.id("username")).sendKeys(email_id);

	}

}
