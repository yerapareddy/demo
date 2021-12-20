package seleniumtraining;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class windowhandlesrunner {

	public static void main(String[] args) throws IOException {
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
		Set<String> winhandles = driver.getWindowHandles();
		Iterator<String> it = winhandles.iterator();
		String parentwindow =driver.getWindowHandle();
		while(it.hasNext()){
			String winhandleid = it.next();
			if(!winhandleid.equals(driver.getWindowHandle())){
				driver.switchTo().window(winhandleid);		//switched to child window		
			}			
		}
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("washing machine");
		//taking screenshot in child window
		TakesScreenshot snip = ((TakesScreenshot)driver);
		File filename = snip.getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\Yerapa.Reddy\\Desktop\\washing_machine.jpg");
		FileUtils.copyFile(filename, destfile);
		driver.switchTo().window(parentwindow);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("air cooler");
		filename = snip.getScreenshotAs(OutputType.FILE);
		destfile = new File("C:\\Users\\Yerapa.Reddy\\Desktop\\air_cooler.jpg");
		FileUtils.copyFile(filename, destfile);
	}

}
