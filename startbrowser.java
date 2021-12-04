package seleniumtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class startbrowser {

	public static WebDriver launchbrowser(String browser){
		WebDriver driver = null;
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\chromedriver_win32_1\\chromeDriver.exe");
			driver = new ChromeDriver();			
		}
		else if(browser.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\edgedriver_win64\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\geckodriver\\geckoDriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}

}
