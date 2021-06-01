package Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		//System.out.println(driver.findElements(By.tagName("frameset")).size());
		//driver.switchTo().frame(0);
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(driver.findElement(By.name("frame-top")));
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
		
		//driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
		System.out.println(driver.findElement(By.id("content")).getText());

	}

}
