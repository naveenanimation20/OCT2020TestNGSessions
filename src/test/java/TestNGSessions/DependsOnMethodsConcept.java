package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {
	
	@Test()
	public void loginTest() {
		System.out.println("Login to app");
		//int i = 9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void homePageHeaderTest() {
		System.out.println("Home Page Header Test");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void homePageSearchTest() {
		System.out.println("Home Page Search Test");
	}
	
	

}
