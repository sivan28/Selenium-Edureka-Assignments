package assignment9_pageobjects;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookTests extends Base {
	
	@Test
	public static void invalidUsernameTest() {
		
		driver.get("https://facebook.com");
		FacebookPage.login("gutav@emailapps1.in", "testing123$");
		Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
	}
	
	@Test
	public static void invalidPasswordTest() {
		
		driver.get("https://facebook.com");
		FacebookPage.login("gutav@emailapps.in", "testing123");
		Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
	}
	
	@Test
	public static void blankCredentialsTest() {

		driver.get("https://facebook.com");
		FacebookPage.login("", "");
		Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
	}

}
