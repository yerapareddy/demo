package framework.hybrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ninjademo {
	
	public static void clickonMyAccount(WebDriver driver){
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
	}
	
	public static void clickonRegister(WebDriver driver){
		driver.findElement(By.linkText("Register")).click();
	}
	
	public static void registerdetails(WebDriver driver,String firstname,String lastname,String email,int phone,String password){
		driver.findElement(By.id("input-firstname")).sendKeys(firstname);
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-telephone")).sendKeys(String.valueOf(phone));
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(password);
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}
	
	public static void register(WebDriver driver, String xpath, String value){
		driver.findElement(By.id(xpath)).sendKeys(value);
	}
	
	public static void agreeandcontinue(WebDriver driver){
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}
	
	public static String verify(WebDriver driver){
		String textdisplayed = driver.findElement(By.xpath("//div[@class='text-danger']")).getText();
		return textdisplayed;
	}
}
