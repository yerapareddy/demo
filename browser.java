package testngtraining;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class browser {
	@BeforeClass
	public static void whichbrowsertoopen(){
		System.out.println("sending chrome");
	}
	@Test
	public static void setproperty(){
		System.out.println("setting user property");
	}
	@BeforeSuite
	public static void openbrowser(){
		System.out.println("opened chrome");
	}
	@AfterSuite
	public static void closebrowser(){
		System.out.println("closed chrome");
	}
	@AfterClass
	public static void clearcache(){
		System.out.println("clearing cache");
	}
}
