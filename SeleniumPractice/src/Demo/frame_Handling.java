package Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frame_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		// finding number of frames in a web page and if the no. of frames is 1 then we can navigate it through index and if we have multiple indexes then use object property.
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//driver.switchTo().frame(0); - switching to frame using frame index 
		// switching to frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		Actions action_class = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		action_class.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();// switching back from frame to normal web page
		

	}

}
