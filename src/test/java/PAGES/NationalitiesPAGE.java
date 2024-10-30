package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NationalitiesPAGE {
   WebDriver driver;
   public void NationalitiesPAGEDriver( WebDriver driver1) {
	   this.driver = driver1;
   }
   public void NationalitiesPageDriver(String nationname) throws Throwable {
	   driver.findElement(By.xpath("(//*[text()='Admin'])[1]")).click();
	   driver.findElement(By.xpath("//a[contains(text(),'Nationalities')]")).click();
	   driver.findElement(By.xpath("//button[text()=' Add ']")).click();
	   Thread.sleep(3000);
	   
	   driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys(nationname);
	   driver.findElement(By.xpath("//button[text()=' Save ']")).click();
   }
}
