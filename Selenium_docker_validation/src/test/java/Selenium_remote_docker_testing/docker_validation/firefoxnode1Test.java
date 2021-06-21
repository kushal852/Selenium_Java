package Selenium_remote_docker_testing.docker_validation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class firefoxnode1Test {

	@Test
	public void firefoxTest() throws MalformedURLException {	
		DesiredCapabilities capf = DesiredCapabilities.firefox();
		URL firefox_container_url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver firefox_driver = new RemoteWebDriver(firefox_container_url,capf);
		firefox_driver.get("http://gmail.com");
		System.out.println(firefox_driver.getTitle());

	}
	

}
