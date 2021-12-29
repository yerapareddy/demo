package testngtraining;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class logout {
	@AfterTest
	public static void logoff(){
		System.out.println("logged out successfully");
	}
	@Test(priority=3)
	public static void clickonlogin(){
		System.out.println("clicked on login");
	}
}
