package seleniumtraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class actionrunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		startbrowser startbrowser = new startbrowser();
		WebDriver driver=startbrowser.launchbrowser("chrome");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("smart watch");
		action.keyDown(Keys.SHIFT).build().perform();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		action.doubleClick(driver.findElement(By.id("twotabsearchtextbox"))).build().perform();
		action.clickAndHold(driver.findElement(By.linkText("Mobiles"))).build().perform();
		action.release().build().perform();
		action.keyDown(Keys.SHIFT).build().perform();
		driver.findElement(By.linkText("Customer Service")).click();
		//action.contextClick(driver.findElement(By.linkText("Customer Service"))).build().perform();
		//action.moveByOffset(0, 400).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Cameras')]"))).build().perform();
		draganddrop(driver, action);
	}
	
	public static void draganddrop(WebDriver driver, Actions action){
		driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		WebElement source = driver.findElement(By.xpath("(//ul[@id='gallery']/li)[1]"));
		WebElement target = driver.findElement(By.id("trash"));
		action.dragAndDrop(source, target).build().perform();
	}

}
