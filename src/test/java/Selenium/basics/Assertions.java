package Selenium.basics;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Assertions {

	public static void main(String[] args) {

		// we have 2 types of assertions hard assertions and soft assertions

		// Hard Assertion - it is kind a blocker immediately fail the program when there
		// is a error
		// Soft Assertions - collecting all errors then fail the prgram at the end

		// Hard Assertion are static methods classname.methodname()

		Assert.assertEquals("Selenium", "Selenium");
		Assert.assertNotEquals("Selenium", "Google");
		Assert.assertTrue(2 < 3);
		Assert.assertFalse(2 > 3);
		Assert.assertNull(null);
		Assert.assertNotNull(1234);
		//Assert.fail("Fail the program");

		// Soft Assertions are non static we need to create object

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals("Selenium", "Google");
		softAssert.assertNotEquals("Selenium", "Selenium");
		softAssert.assertTrue(2>3);
		softAssert.assertFalse(2>3);
		softAssert.assertNull(1234);
		softAssert.assertNotNull(null);
		softAssert.assertAll();
		

	}
}