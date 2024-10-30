package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LOGOUTPAGE {
	WebDriver driver;
	public void LogoutPageDriver(WebDriver driver1) {
		this.driver = driver1;
	}

	public void Logout() {
		driver.findElement(By.xpath("//header/div[1]/div[3]/ul[1]/li[1]/span[1]")).click();
		
	}
}
