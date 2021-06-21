package Selenium_remote_docker_testing.docker_validation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class chromenode2Test {
	
	@Test
	public void chromeTest2() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		URL container_url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(container_url,cap);
		driver.get("http://rediff.com");
		System.out.println(driver.getTitle());
		
	/*	DesiredCapabilities capf = DesiredCapabilities.firefox();
		URL firefox_container_url = new URL("http://localhost:4444/5555/wd/hub");
		RemoteWebDriver firefox_driver = new RemoteWebDriver(firefox_container_url,cap);
		firefox_driver.get("http://yahoo.com");
		System.out.println(firefox_driver.getTitle());*/


	}

}
