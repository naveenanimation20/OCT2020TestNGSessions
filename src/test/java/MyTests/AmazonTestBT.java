package MyTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonTestBT extends BaseTest{

	
	@BeforeClass
	public void launchApp() {
		driver.get("https://www.amazon.in/");
	}

	@Test(priority = 2)
	public void amazonTitleTest() {
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		Assert.assertEquals(title,
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");

	}

	@Test(priority = 1)
	public void amazonLogoTest() {
		Assert.assertTrue(driver.findElement(By.id("nav-logo-sprites")).isDisplayed());
	}

	@Test(priority = 3)
	public void amaonFooterLinksCountTest() {
		int count = driver.findElements(By.cssSelector("div.navFooterLinkCol.navAccessibility li")).size();
		Assert.assertEquals(count, 21);
	}
	
	@Test(enabled = false)
	public void amazonTest4() {
		System.out.println("amazonTest4");
	}
	
	@Test(enabled = false)
	public void amazonTest5() {
		System.out.println("amazonTest5");

	}
	
	@Test(enabled = false)
	public void amazonTest6() {
		System.out.println("amazonTest6");

	}

	
}
