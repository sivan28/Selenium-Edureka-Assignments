package assignment9_pageobjects;

import org.openqa.selenium.By;

public class NewToursPage extends Base {

	public static void login(String username, String password) {
		
	    driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);;
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);;
		driver.findElement(By.xpath("//input[@value='Login']")).click();;
	}
}