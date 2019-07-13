package assignment3_facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigation {
	public static WebDriver driver;
	
	@Test
	public static void navigation() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siva\\eclipse-workspace\\Selenium Edureka\\src\\chromedriver.exe");
		driver = new ChromeDriver();
		
		String url = "https://google.com";
		driver.get(url);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("food");
		driver.navigate().refresh();
		driver.navigate().back();
	}
}
