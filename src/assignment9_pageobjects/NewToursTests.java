package assignment9_pageobjects;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewToursTests extends NewToursPage {

	@Test
	public static void invalidUsernameTest() {
		driver.get("http://newtours.demoaut.com/");
		NewToursPage.login("merc", "testing");
		Assert.assertEquals(driver.getTitle(), "Sign-on: Mercury Tours");
	}
	
	@Test
	public static void invalidPasswordTest() {
		driver.get("http://newtours.demoaut.com/");
		NewToursPage.login("mercury", "testing");
		Assert.assertEquals(driver.getTitle(), "Sign-on: Mercury Tours");
	}

	@Test
	public static void blankCredentialsTest() {
		driver.get("http://newtours.demoaut.com/");
		NewToursPage.login("", "");
		Assert.assertEquals(driver.getTitle(), "Sign-on: Mercury Tours");
	}
}
