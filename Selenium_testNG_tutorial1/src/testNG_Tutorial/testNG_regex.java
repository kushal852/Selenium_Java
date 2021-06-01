package testNG_Tutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG_regex {
	
	@BeforeClass// this will before all the methods in this class file is executed
	public void suspend_sim_prerequsite() {
		
		System.out.println("suspend_sim_prerequsite");
		
	}
	
	@BeforeMethod // this will execute before each and every time a method in this class file is executed
   public void Before_Method() {
		
		System.out.println("\n");
		System.out.println("this will execute each and every time a method in this class file is executed");
		
	}
	
	@AfterMethod // this will execute after each and every time a method in this class file is executed
	   public void After_Method() {
			
		
		System.out.println("this will execute each and every time a method in this class file is executed");
		System.out.println("\n");
		
		}
	@Test(groups= {"regression"})
	public void suspend_Sim() {
		
		
		
		System.out.println("suspend_Sim");
			
	}
	
	@Test(dependsOnMethods= {"suspend_Sim"})
	
	public void Order_Replacment_Sim() {
		
		
		
		System.out.println("Order_Replacment_Sim");
	
	}
	
	@Test(dependsOnMethods= {"suspend_Sim","Order_Replacment_Sim"})
	public void Reactivate_Sim() {
		
		
		
		System.out.println("Reactivate_Sim");
		
	}
	
	@Test(dependsOnMethods= {"suspend_Sim","Order_Replacment_Sim","Reactivate_Sim"})
	public void unuspend_sim() {
		
		
	
		System.out.println("unuspend_sim");
		
	}
	
	@AfterClass// this will after all the methods in this class file is executed
	
	@Test
	public void unuspend_sim_success() {
		
	
		System.out.println("unuspend_sim_success");
		
	}
	


}
