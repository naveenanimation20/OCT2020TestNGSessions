package MyTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTestBM {
	
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
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

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
