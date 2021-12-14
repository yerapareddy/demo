package seleniumtraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		startbrowser startbrowser = new startbrowser();
		WebDriver driver=startbrowser.launchbrowser("chrome");		
		dropdowns dropdowns = new dropdowns();
		//dropdowns.staticdropdown(driver);
		dropdowns.staticdropdowninmmt(driver);
		//dropdowns.autosuggestdropdown(driver);
		dropdowns.selectdateincalendar(driver,"August","1");
	}
	
	public static void staticdropdown(WebDriver driver) throws InterruptedException{
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Select select = new Select(driver.findElement(By.xpath("//select[@class='bc-neutral-100 bg-transparent']")));
		select.selectByIndex(3);
		Thread.sleep(2000);
		select.selectByValue("3");
		Thread.sleep(2000);
		select.selectByVisibleText("7");
	}
	
	public static void staticdropdowninmmt(WebDriver driver) throws InterruptedException{
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@data-cy='outsideModal']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'langSlct')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'selectConWrap')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='USA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'langSlct')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'selectConWrap')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='India']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
	}
	
	public static void autosuggestdropdown(WebDriver driver) throws InterruptedException{
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("del");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li/div/div/p[contains(text(),'New Delhi')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("chennai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li/div/div/p[contains(text(),'Chennai')]")).click();
		driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--today']")).click();
		driver.findElement(By.xpath("//input[@id='travellers']/preceding-sibling::span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-cy='adults-2']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'APPLY')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
	}
	
	public static void selectdateincalendar(WebDriver driver,String monthtoselect,String datetoselect) throws InterruptedException{
		
		Thread.sleep(2000);
		List<WebElement> months = driver.findElements(By.xpath("//div[@class='DayPicker-Month']/div[@class='DayPicker-Caption']/div"));
		boolean dateselected = false;
		for(WebElement month :months){
			month.getText();
			if(month.getText().contains(monthtoselect)){
				String xpath = "//div[contains(text(),'"+monthtoselect+"')]/../following-sibling::div[@class='DayPicker-Body']//div[contains(@class,'DayPicker-Day')][@aria-disabled='false']/div/p[1]";
				List<WebElement> dates = driver.findElements(By.xpath(xpath));
				for(WebElement date: dates){
					if(date.getText().equals(datetoselect)){
						date.click();
						dateselected=true;
						break;
					}
				}
			}			
		}
		if(!dateselected){
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			selectdateincalendar(driver,monthtoselect,datetoselect);
		}
	}
}
