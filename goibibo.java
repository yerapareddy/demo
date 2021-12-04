package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class goibibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		startbrowser startbrowser = new startbrowser();
		WebDriver driver=startbrowser.launchbrowser("edge");
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.className("inputSrch")).sendKeys("mumbai");
	}
}
