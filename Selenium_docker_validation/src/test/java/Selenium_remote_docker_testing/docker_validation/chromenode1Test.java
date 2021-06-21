package Selenium_remote_docker_testing.docker_validation;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class chromenode1Test {
	
	@BeforeTest
	public void StartdockerFile() throws IOException, InterruptedException {
		
		dockerStart ds = new dockerStart();
		ds.startDocker();
		
	}
	
	@AfterTest
	public void Stopdockerfile() throws IOException, InterruptedException {
		
		dockerStop ds = new dockerStop();
		ds.stopDocker();
		
	}
	
	@Test
	public void chromeTest1() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		URL container_url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(container_url,cap);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
	/*	DesiredCapabilities capf = DesiredCapabilities.firefox();
		URL firefox_container_url = new URL("http://localhost:4444/5555/wd/hub");
		RemoteWebDriver firefox_driver = new RemoteWebDriver(firefox_container_url,cap);
		firefox_driver.get("http://yahoo.com");
		System.out.println(firefox_driver.getTitle());*/


	}

}
