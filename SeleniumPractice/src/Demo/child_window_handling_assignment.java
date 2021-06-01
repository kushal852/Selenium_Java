package Demo;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_window_handling_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterate = windows.iterator();
		/*String Parent_window = iterate.next();
		String Child_window = iterate.next();*/
		
		String Parent_window = "";
		String Child_window = "";
		int count = 0;
		while (iterate.hasNext()) {
			if (count == 0) {
				Parent_window = iterate.next();
			}
			else {
				Child_window = iterate.next();
			}
			count = count + 1;
			
		}
		
		driver.switchTo().window(Child_window);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		driver.switchTo().window(Parent_window);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());

	}

}
