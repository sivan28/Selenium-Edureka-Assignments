package assignment8_login;

import org.openqa.selenium.By;

public class Page extends Base {

	public static void login() {

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
}