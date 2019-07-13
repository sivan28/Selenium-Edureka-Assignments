package assignment4_facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PageContent {
	public static WebDriver driver;

	@BeforeTest
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siva\\eclipse-workspace\\Selenium Edureka\\src\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public static void validateKeyboardActions() {
		String url = "https://www.toolsqa.com/automation-practice-form/";
		driver.get(url);
	//	driver.manage().window().maximize();
		String text = driver.findElement(By.xpath("//body")).getText();
		Assert.assertEquals(text.contains("Automation"), true);
		System.out.println("Here is the text..." + text);
		driver.close();
	}
}
