package seleniumtraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitrunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		startbrowser startbrowser = new startbrowser();
		WebDriver driver=startbrowser.launchbrowser("chrome");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.yoox.com/in");
		driver.manage().window().maximize();		
		//driver.findElement(By.xpath("//a[contains(@href,'/men')]")).click();
		//driver.findElement(By.id("customercareToolbar")).click();
		driver.findElement(By.id("customercareToolbar")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go to the CUSTOMER CARE')]")).click();
		//syntax of explicit wait
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ycc-search__value")));
		driver.findElement(By.id("ycc-search__value")).sendKeys("shirts");
	}

}
