package Selenium_remote_docker_testing.docker_validation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Calendar;


import java.io.IOException;


import org.junit.Assert;



public class docker_start_stop_manuplation{
	
	
	public void docker_start_stop(String start_or_stop_bat_file_path,String Validation_text) throws IOException, InterruptedException{
	
	
	boolean flag = false;
	Runtime runtime = Runtime.getRuntime();
	runtime.exec(start_or_stop_bat_file_path);
	
	String file_name = "output.txt";
	Calendar cal = Calendar.getInstance();
	cal.add(Calendar.SECOND, 45);
	long stopnow = cal.getTimeInMillis();
	Thread.sleep(3000);
	while(System.currentTimeMillis()<stopnow) {
		
		if(flag) {
			break;
		}
	
	BufferedReader br = new BufferedReader(new FileReader(file_name));
	String current_line = br.readLine();
	while(current_line!=null && !flag) {
		
		if (current_line.contains(Validation_text)) {
			flag = true;
			break;
		}
		current_line = br.readLine();
		
	}
	br.close();
	}
	Assert.assertTrue(flag);

}
}
