package Selenium_remote_docker_testing.docker_validation;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class dockerStop extends docker_start_stop_manuplation{


	public void stopDocker() throws IOException, InterruptedException  {
		
		
		dockerStop ds = new dockerStop();
		
		ds.docker_start_stop("cmd /c start dockerDown.bat", "selenium-hub exited");
		
		
		
		
		
	}
}
