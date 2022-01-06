package framework.hybrid;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demoTest {
	@Test
	public static void turtorialsdemo(){
		WebDriver driver = launchbrowser.browser();
		launchbrowser.geturl(driver, "http://www.tutorialsninja.com/demo/");
		ninjademo.clickonMyAccount(driver);
		ninjademo.clickonRegister(driver);
		//ninjademo.registerdetails(driver, "sreekanth", "k", "ksreekanth@gmail.com", 2103456789, "ksreekanth");
		ninjademo.register(driver, "input-firstname", "yyyyyyyytebdssabdbsanmdnalkjdhsadiuabdgyew bhgdsvagcvdsbcbjsabhjcbsaj c dsjbhbsbdbs");		
		ninjademo.register(driver, "input-lastname", "ks");
		ninjademo.register(driver, "input-email", "ksreekath@gmail.com");
		ninjademo.register(driver, "input-telephone", "2108765433");
		ninjademo.register(driver, "input-password", "ksssrenath");
		ninjademo.register(driver, "input-confirm", "ksssrenath");
		ninjademo.agreeandcontinue(driver);
		String actualtext=ninjademo.verify(driver);
		System.out.println(actualtext);
		if(actualtext.contains("must be between 1 and 32 characters")){
			Assert.assertTrue(true);
		} else Assert.assertTrue(false);
	}
}
