package TestNGSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@Test(priority = 1)
	public void addTest() {
		int a = 100;
		int b = 200;
		int c = a + b;
		System.out.println(c);
		Assert.assertEquals(c, 300);
	}

	@Test(priority = 2)
	public void subTest() {
		int a = 100;
		int b = 200;
		int c = b - a;
		System.out.println(c);
		Assert.assertEquals(c, 100);
	}

	@Test(priority = 3)
	public void mulTest() {
		int a = 10;
		int b = 20;
		int c = a * b;
		System.out.println(c);
		Assert.assertEquals(c, 200);
	}

}
