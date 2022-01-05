package framework.hybrid;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AmazonTest {
	@Test
	public static void Amazon(){
		launchbrowser amazon =  new launchbrowser();		
		WebDriver driver = amazon.browser();
		amazon.geturl(driver,"https://www.amazon.in/");
	}
}
