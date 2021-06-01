package testNG_Tutorial;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testNG_3 {
	
	
	@Test(dependsOnMethods= {"Balancecheck"},groups= {"regression"})
	
	public void top_up() {
		
		
		
		System.out.println("Topup");
		
		
	}
	
	@Test(dependsOnMethods= {"Balancecheck"})
	public void auto_topup() {
		
		
		
		System.out.println("auto_topup");
		
		
	}
	
	
	@Test(enabled=false)
	public void bundle() {
		
		
		
		System.out.println("Bundle");
		
		
	}
	
	//@BeforeMethod // before method will execute before executing all the methods in this class file
	@Test
	
    public void Balancecheck() {
		
		
		
		System.out.println("checking balance before topup");
		
		
	}
	

}
