package framework.hybrid;

import org.testng.annotations.Test;

public class socialmediaTest {
	@Test
	public static void facebook(){
		login.username("","sreekanth");
		login.password();
		login.clicklogin();		
	}
	@Test
	public static void gmail(){
		login.username("","yerapa");
		login.password();
		login.clicklogin();	
	}
}
