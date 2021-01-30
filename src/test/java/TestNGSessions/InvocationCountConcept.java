package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	
	
	@Test(invocationCount = 10, priority = 1, expectedExceptions = ArithmeticException.class)
	public void homePageSearchTest() {
		System.out.println("Home Page Search Test");
	}
	
	
	
	

}
