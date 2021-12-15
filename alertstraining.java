package seleniumtraining;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class alertstraining {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		startbrowser startbrowser = new startbrowser();
		WebDriver driver=startbrowser.launchbrowser("chrome");
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		driver.findElement(By.name("alertbox")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("alertbox---"+alert.getText());
		alert.accept();
		driver.findElement(By.name("confirmalertbox")).click();
		System.out.println("confirmalertbox---"+driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.name("confirmalertbox")).click();
		System.out.println("confirmalertbox---"+driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		driver.findElement(By.name("promptalertbox1234")).click();
		//Alert alerts = driver.switchTo().alert();
		System.out.println("promptalertbox1234---"+alert.getText());
		alert.sendKeys("yes");
		Thread.sleep(2000);
		alert.accept();
	}

}
