package testngtraining;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class enterurl {
	@BeforeTest(groups={"smoke","regression","sanity"})
	@Parameters({"env","url"})
	public static void url(String env, String url){
		System.out.println("entered in : "+env+" url is : "+url);
	}
}
