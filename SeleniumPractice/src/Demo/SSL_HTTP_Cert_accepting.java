package Demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSL_HTTP_Cert_accepting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// first getting the properties of general chrome  profile (desire capabilities) and giving it to a object.
		DesiredCapabilities chrome_general_profile = new DesiredCapabilities();
		//chrome_general_profile.acceptInsecureCerts();
		chrome_general_profile.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		chrome_general_profile.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		
		//Then giving the general chrome profile object which is having desired capabilities to local browser in our machine.
		ChromeOptions chrome_local_profile = new ChromeOptions();
		chrome_local_profile.merge(chrome_general_profile);
		
		//Then passing the local browser object with general chrome profile with desired capabilities to the web driver object.
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91999\\OneDrive\\Study\\Selenium_python\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(chrome_local_profile);

	}

}
