package com.dataDriven.framework.test.LoginTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.dataDriven.framework.base.baseClass;

public class loginTest extends baseClass{
	
	@Test
	public void testOne() throws IOException {
		
		invokebrowser("browsertype");
		openWebsite("websiteURL");
		elementclick("signin_btn_xpath");
		enterText("username_id","kushal");
		enterText("password_id","kushal");
		tearDown();
		
		
	}
	
	//@Test(dependsOnMethods = "testOne")
	public void testTwo() throws IOException {
		
		invokebrowser("browsertype");
		openWebsite("websiteURL");
		elementclick("signin_btn_xpath");
		enterText("username_id", "akhil");
		enterText("password_id", "akhil");
		tearDown();
	}
	
	//@Test(dependsOnMethods = "testOne")
	public void testThree() throws IOException {
		
		invokebrowser("browsertype");
		openWebsite("websiteURL");
		elementclick("signin_btn_xpath");
		enterText("username_xpath", "mach");
		enterText("password_xpath", "macha");
		tearDown();
	}

}
