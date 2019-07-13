package assignment4_facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidateElement {
	
	public static WebDriver driver;

	@BeforeTest
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siva\\eclipse-workspace\\Selenium Edureka\\src\\chromedriver.exe");
		driver = new ChromeDriver();
		
		String url = "https://www.toolsqa.com/automation-practice-form/";
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public static void validateCheckbox() {
		boolean checkboxEnabled = driver.findElement(By.xpath("//input[@id='profession-1']")).isSelected();
		Assert.assertEquals(checkboxEnabled, true);
	}
	
	@Test
	public static void elementExists() {
		boolean elementExists = driver.findElement(By.xpath("//input[@id='datepicker']")).isDisplayed();
		Assert.assertEquals(elementExists, true);
	}
	
	@Test
	public static void textboxCheck() {
		boolean elementDisabled = driver.findElement(By.xpath("//select[@id='continents']")).isEnabled();
		Assert.assertEquals(elementDisabled, false);
	}

}
