package selenium_Latest;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newwindow_Opening {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		// switching to new tab
		driver.switchTo().newWindow(WindowType.TAB);// New tab opening
		//New Window Opening
		//driver.switchTo().newWindow(WindowType.WINDOW);
        Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> iterate = windows.iterator();
		String Parent_window = iterate.next();
		String Child_window = iterate.next();
		
		driver.switchTo().window(Child_window);
		
		driver.get("https://rahulshettyacademy.com/");

		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))

		.get(1).getText();

		driver.switchTo().window(Parent_window);
         
		// Taking a particular webelement screenshot.
		WebElement name=driver.findElement(By.cssSelector("[name='name']"));

		name.sendKeys(courseName);
		
		File sc = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sc, new File ("partial_screenshot.png"));
		
		// getting height and width of particular webelement
		
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		
		driver.quit();
		
		

	}

}
