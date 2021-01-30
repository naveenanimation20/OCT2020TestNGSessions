package MyTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest {
	
//	@BeforeClass
//	public void launchApp() {
//		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
//	}
	
	public void launchUrl() {
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	}

	@Test(priority = 2)
	public void orangeHRMTitleTest() {
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		Assert.assertEquals(title, "Free Human Resource Management Software | 30 Day Trial Creation");

	}

	@Test(priority = 1)
	public void orangeHRMLogoTest() {
		launchUrl();
		Assert.assertTrue(driver.findElement(By.className("nav-logo")).isDisplayed());
	}

	@Test(priority = 3)
	public void orangeHRMContactsLinkTest() {
		Assert.assertTrue(driver.findElement(By.linkText("Contact Sales")).isDisplayed());
	}

}
