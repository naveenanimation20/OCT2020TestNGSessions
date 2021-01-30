package TestNGSessions;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCaseDesign {

	// Global Pre Conditions
	// Precondition
	// Test Steps (Test Case) + Exp vs Actual Result
	// post steps
	// status -- PASS/FAIL/SKIP
	// Report
	
	/*
	BS -- Connect with DB
	BT -- Create a sample User in DB
	BC -- Launch the browser and APP
	
		BM -- Login to app
			user info test -- t1
		AM -- logout
		
		BM -- Login to app
			home page search test -- t2
		AM -- logout
	
		BM -- Login to app
			home page title test --t3
		AM -- logout
	
	AC -- close the browser
	AT -- Delete the user in DB
	AS -- disconnect from DB
	*/

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BS -- Connect with DB");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("BT -- Create a sample User in DB");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("BC -- Launch the browser and APP");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BM -- Login to app");
	}

	@Test
	public void homePageTitleTest() {
		System.out.println("home page title test....");
		Assert.assertEquals("Google", "Google");
	}

	@Test
	public void checkUserInfoTest() {
		System.out.println("user info test");
		Assert.assertEquals("admin", "admin");
	}

	@Test
	public void homePageSearchTest() {
		System.out.println("home page search test");
		Assert.assertTrue(true);
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AM -- logout");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("AC -- close the browser");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("AT -- Delete the user in DB");
	}

	@AfterSuite()
	public void afterSuite() {
		System.out.println("AS -- disconnect from DB");
	}

}
