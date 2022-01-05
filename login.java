package framework.hybrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void username(String xpath,String text){
		WebDriver driver= new ChromeDriver();
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}
	public static void password(){
		System.out.println("sending password");
	}
	public static void clicklogin(){
		System.out.println("clicked on login button");
	}
}
