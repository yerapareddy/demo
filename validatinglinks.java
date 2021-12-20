package seleniumtraining;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class validatinglinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		startbrowser startbrowser = new startbrowser();
		WebDriver driver=startbrowser.launchbrowser("chrome");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Smart phones");		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		System.out.println(driver.findElements(By.xpath("//*[contains(text(),'Samsung')]")).size());
		
		HttpURLConnection hc = null;
		
		for(WebElement link:links){
			String url = link.getAttribute("href");
			if(url!=null){
				hc = (HttpURLConnection) new URL(url).openConnection();
				hc.setRequestMethod("HEAD");
				hc.connect();
				System.out.println(hc.getResponseCode());
				if(!(hc.getResponseCode()>400 || hc.getResponseCode()>500)){
					System.out.println("link is valid");
				}
			}
		}
	}

}
