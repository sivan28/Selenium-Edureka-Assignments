package assignment4_facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KeyboardActions {
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
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,800)");
		driver.findElement(By.xpath("//body")).sendKeys(Keys.CONTROL.PAGE_UP);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.CONTROL, "a");
		driver.close();
	}

}
