package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\edgedriver_win64\\MicrosoftWebDriver.exe");
		WebDriver driver = new EdgeDriver();
		amazon(driver);
		/*driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.spicejet.com/");
		driver.navigate().back();
		driver.navigate().forward();*/
		driver.navigate().refresh();
		driver.close();
	}
	
	public static void amazon(WebDriver driver) throws InterruptedException{
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("smart phones");
		driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).clear();
		driver.findElement(By.name("field-keywords")).sendKeys("washingmachine");
		//for css selector it will be dot(.) when using class name and it will be # when using id
		//input#twotabsearchtextbox --- using id
		//input.nav-input.nav-progressive-attribute -- using classname
		driver.findElement(By.cssSelector("input.nav-input.nav-progressive-attribute")).clear();
		
		//linktext
		driver.findElement(By.linkText("Mobiles")).click();
		
		//partial linktext
		driver.findElement(By.partialLinkText("Customer")).click();
		
		System.out.println(driver.findElement(By.xpath("//a[contains(@href,'order-history')]")).getText());
		Thread.sleep(10000);
	}
}
