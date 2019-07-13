package assignment9_pageobjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Base {
	
		public static WebDriver driver;
				
		@BeforeTest
		public void setUp() throws IOException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Siva\\eclipse-workspace\\Selenium Edureka\\src\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		@AfterTest
		public void tearDown() {
			driver.close();
		}
}