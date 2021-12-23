package seleniumtraining;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class authenticationrunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//older version of chrom webdriver
	/*	DesiredCapabilities ssl = DesiredCapabilities.chrome();
		ssl.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);*/
		ChromeOptions options = new ChromeOptions();
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		options.setAcceptInsecureCerts(true);
		String download = System.getProperty("user.dir");
		Map<String,Object> pref = new HashMap<>();
		pref.put("download.default_directory", download);
		options.setExperimentalOption("prefs", pref);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\chromedriver_win32_1\\chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		System.out.println(download);
		filedownload(driver);
		//handlesslerror(driver);
		// https://username:password@url
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//driver.manage().window().maximize();
		//driver.findElement(By.linkText("Basic Auth")).click();
	}
	
	public static void handlesslerror(WebDriver driver){
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();		
	}
	
	public static void filedownload(WebDriver driver){
		driver.get("https://the-internet.herokuapp.com/download");
		driver.findElement(By.linkText("download.jpg")).click();
	}

}
