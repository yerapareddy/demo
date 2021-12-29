package testngtraining;

import org.testng.annotations.Test;

public class login {
	@Test(priority=1,groups={"smoke","regression","sanity"})
	
	public static void enterusername(){
		System.out.println("entered username");
	}
	@Test(priority=2,groups={"smoke","regression","sanity"})
	public static void enterpassword(){
		System.out.println("entered password");
	}
}
