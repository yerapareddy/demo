package seleniumtraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class assertionrunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		startbrowser startbrowser = new startbrowser();
		WebDriver driver=startbrowser.launchbrowser("chrome");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		softassertion(driver);
		/*String title = driver.getTitle();
		String expectedtitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(title, expectedtitle);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("smart watch");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String actualText = driver.findElement(By.xpath("//*[@id='n/5605728031']/span/a/span")).getText();
		String expectedText = "Smart Watches & Accessories";
		Assert.assertEquals(actualText, expectedText);*/
	}
	
	public static void softassertion(WebDriver driver){
		SoftAssert sa = new SoftAssert();
		String title = driver.getTitle();
		String expectedtitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon";
		sa.assertEquals(title, expectedtitle);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("smart watch");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String actualText = driver.findElement(By.xpath("//*[@id='n/5605728031']/span/a/span")).getText();
		String expectedText = "Smart phones & Accessories";
		sa.assertEquals(actualText, expectedText);
		sa.assertAll();
	}

}
