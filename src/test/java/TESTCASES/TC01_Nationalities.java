package TESTCASES;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest4;
import PAGES.LOGINPAGE;
import PAGES.LOGOUTPAGE;
import PAGES.NationalitiesPAGE;

public class TC01_Nationalities {
    WebDriver driver;
    
    Map<String, HashMap<String,String>> Datatable = new HashMap<String, HashMap<String,String>>();
    String TestURL,UserName1,Password1,NationName;
    

    
	@BeforeTest
	public void openChrome() throws Exception {
		
		ExcelApiTest4 E1=new ExcelApiTest4();
		Datatable = E1.getDataTable("C:\\Excel\\TC01_EMPExport4.xlsx","Sheet1");
		
		TestURL = Datatable.get("TC01").get("TestURL");
		UserName1 = Datatable.get("TC01").get("UserName");
		Password1 = Datatable.get("TC01").get("Password");
		NationName = Datatable.get("TC01").get("Nationality");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(TestURL);
		
		
	}

	@Test
	public void MainTest() throws Throwable {
		LOGINPAGE L1 = new LOGINPAGE();
		L1.LoginPageDriver(driver);
		L1.Login(UserName1, Password1);
		
		NationalitiesPAGE N1 = new NationalitiesPAGE();
		N1.NationalitiesPAGEDriver(driver);
		N1.NationalitiesPageDriver(NationName);
		
		LOGOUTPAGE L2 = new LOGOUTPAGE();
		L2.LogoutPageDriver(driver);
			
	}

	@AfterTest
	public void closeBrowser() {
//		driver.quit();
	}

}
