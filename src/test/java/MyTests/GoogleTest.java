package MyTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
	
	@BeforeMethod
	public void launchApp() {
		driver.get("https://www.google.in/");
	}

	@Test(priority = 2)
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		Assert.assertEquals(title, "Google");

	}

	@Test(priority = 1)
	public void googleLogoTest() {
		Assert.assertTrue(driver.findElement(By.id("hplogo")).isDisplayed());
	}

}
