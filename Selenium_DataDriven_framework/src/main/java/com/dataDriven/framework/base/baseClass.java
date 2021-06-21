package com.dataDriven.framework.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class baseClass {
	public Properties prop;
	public WebDriver driver;
	public void invokebrowser(String browsertypekey) throws IOException {
		String current_path = System.getProperty("user.dir");
		
        if(prop == null) {
			
        	prop = new Properties();
			FileInputStream file = new FileInputStream(current_path+"\\src\\test\\resources\\objectRepository\\projectConfig.properties");
			prop.load(file);
			
        }
        
		
		
		if(prop.getProperty(browsertypekey).equalsIgnoreCase("chrome")) {
			System.out.println(prop.getProperty(browsertypekey));
			System.setProperty("webdriver.chrome.driver", 
					current_path+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		
			driver = new ChromeDriver();
		}
		else if(prop.getProperty(browsertypekey).equalsIgnoreCase("mozilla")) {
			
			System.setProperty("webdriver.gecko.driver", 
					current_path+"\\src\\test\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		
		}
	
	
	public void openWebsite(String websiteURLkey) {
		System.out.println(prop.getProperty(websiteURLkey));
		driver.get(prop.getProperty(websiteURLkey));
	}
	
	public void tearDown() {
		driver.close();
		
	}
	
	public void quitBrowser() {
		driver.quit();
		
	}
	
	public void enterText(String locator,String data) {
		WebElement element = null;
		element = getElement(locator);
		element.sendKeys(data);
		//driver.findElement(By.xpath(prop.getProperty(xpathkey))).sendKeys(data);
	}
	
    public void elementclick(String xpathkey) {
		
		driver.findElement(By.xpath(prop.getProperty(xpathkey))).click();
	}
    
    public WebElement getElement(String locatorkey) {
    	
    	WebElement element = null;
    	
    	try {
    	if(locatorkey.endsWith("_class")) {
    		
    		element = driver.findElement(By.className(prop.getProperty(locatorkey)));
    	}
    	else if(locatorkey.endsWith("_id")) {
    		
    		element = driver.findElement(By.id(prop.getProperty(locatorkey)));
    	}
    	else if(locatorkey.endsWith("_linktext")) {
   		
   		element = driver.findElement(By.linkText(prop.getProperty(locatorkey)));
   	    }
    	else if(locatorkey.endsWith("_name")) {
   		
   		element = driver.findElement(By.name(prop.getProperty(locatorkey)));
   	    }
    	else  if(locatorkey.endsWith("_css")) {
   		
   		element = driver.findElement(By.cssSelector(prop.getProperty(locatorkey)));
   	    }
    	else if(locatorkey.endsWith("_xpath")) {
      		
      		element = driver.findElement(By.xpath(prop.getProperty(locatorkey)));
      	}
       else {
      		
      		reportFail("Failing the testcase, Invalid locator "+  locatorkey);
      		Assert.fail("Failing the testcase, Invalid locator "+ locatorkey);
      	    }
       
    	
    	}
    	
    	catch (Exception e) {
      		
      		reportFail(e.getMessage());
      		e.printStackTrace();
      		Assert.fail("Failing the test case: "+e.getMessage());
      	}
      		
      	
    	
    	 return element;
    }
    
    /****************Reporting Functions ************************/
    
    public void reportFail(String reportString) {
    	
    }
    
    public void reportPass(String reportString) {
    	
    }
    
    public void screenshot_on_Failure(String reportString) {
    	
    }
	
   
	

}
