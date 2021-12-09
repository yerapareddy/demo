package seleniumtraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		startbrowser startbrowser = new startbrowser();
		WebDriver driver=startbrowser.launchbrowser("chrome");
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//div[@class='_2hriZF _2rbIyg']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("tv");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		clickontv(driver);
		
	}
	
	public static void clickontv(WebDriver driver) throws InterruptedException{
		boolean found=false;
		List<WebElement> links=driver.findElements(By.xpath("//div[contains(@class,'_1AtVbE')]/div/div/div/a"));
		for(WebElement link:links){			
			if(link.getAttribute("href").contains("dyanora-80-cm-32-inch")){				
				link.click();
				found=true;
				break;
			}
		}
		if(!found){
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a/span[text()='Next']")).click();  
			Thread.sleep(3000);
			clickontv(driver);
		}		
	}

}
