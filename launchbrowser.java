package framework.hybrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchbrowser {
	public static WebDriver browser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\chromedriver_win32_1\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static void geturl(WebDriver driver, String url){
		driver.get(url);
	}
	
	public static void searchmobile(WebDriver driver){
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Smart phones");
	}
}
