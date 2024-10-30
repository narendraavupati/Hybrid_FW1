package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LOGINPAGE {
	WebDriver driver;

	public void LoginPageDriver(WebDriver driver1) {
		this.driver = driver1;
	}

	public void Login(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

	}

}
