package seleniumtraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		startbrowser startbrowser = new startbrowser();
		WebDriver driver=startbrowser.launchbrowser("chrome");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Smart phones");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[contains(text(),'OPPO A31')]")).click();
		clickonredmi(driver,"//a[@class='a-link-normal a-text-normal']/span");
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
	
	public static void clickonredmi(WebDriver driver,String xpath) throws InterruptedException{
		boolean found=false;
		List<WebElement> links=driver.findElements(By.xpath(xpath));
		for(WebElement link:links){			
			if(link.getText().contains("Redmi")){				
				link.click();
				found=true;
				break;
			}
		}
		if(!found){
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
			clickonredmi(driver,xpath);
		}		
	}
}
