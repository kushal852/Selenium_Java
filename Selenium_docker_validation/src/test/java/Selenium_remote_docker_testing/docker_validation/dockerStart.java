package Selenium_remote_docker_testing.docker_validation;


import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dockerStart  extends docker_start_stop_manuplation {
	

	public void startDocker() throws IOException, InterruptedException  {
		
		File F = new File("output.txt");
		//System.out.println(F.delete());
		if(F.delete()==true) {
			System.out.println("Successfully deleted old output.txt file");
			//Assert.assertTrue("The file is not deleted successfully",F.delete());
			
		}
		
		dockerStart ds = new dockerStart();
		
		ds.docker_start_stop("cmd /c start dockerUp.bat", "registered to the hub and ready to use");
		Runtime runtime = Runtime.getRuntime();
		
		runtime.exec("cmd /c start scaleup.bat");
		Thread.sleep(5000);
		
		
	}

}
