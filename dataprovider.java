package testngtraining;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	@Test(dataProvider="userdetails")
	public static void getusernameandpassword(String username, String password){
		System.out.println("username is: "+username);
		System.out.println("password is: "+password);
	}
	@DataProvider(name="userdetails")
	public Object[][] usernameandpassword(){
		Object[][]details = new Object[2][2];
		details[0][0]="sreekanth";
		details[0][1]="123";
		details[1][0]="yerapa";
		details[1][1]="reddy";
		return details;
	}
}
