package testngtraining;

import org.testng.annotations.Test;

public class loans {
	@Test
	public static void carloan(){
		System.out.println("navigated to car loan page");
	}
	@Test(groups={"smoke","regression","sanity"})
	public static void homeloan(){
		System.out.println("navigated to home loan page");
	}
	@Test(groups={"regression"})
	public static void personalloan(){
		System.out.println("navigated to personal loan page");
	}
	@Test(groups={"sanity"})
	public static void educationloan(){
		System.out.println("navigated to education loan page");
	}
}
