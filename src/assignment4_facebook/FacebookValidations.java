package assignment4_facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookValidations {
	
	public static WebDriver driver;
	
	@Test
	public static void facebookValidations() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siva\\eclipse-workspace\\Selenium Edureka\\src\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://facebook.com");
		String text = driver.findElement(By.xpath("//body")).getText();
		System.out.println(text);
		Assert.assertEquals(text.contains("Facebook"), true);
		Assert.assertEquals(text.contains("Connect with friends"), true);
		Assert.assertEquals(text.contains("Share what's new"), true);
		driver.close();
	}

}