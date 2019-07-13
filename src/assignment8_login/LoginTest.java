package assignment8_login;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Base{
	
	@Test
	public static void loginTest() {
		Page.login();
		Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
		System.out.println("Login successful !");
	}
}
