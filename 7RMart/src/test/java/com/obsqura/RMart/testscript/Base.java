package com.obsqura.RMart.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utilities.WaitUtility;

public class Base {
	WebDriver driver;
	WaitUtility waitutility;
	@BeforeMethod
	public void initialiseBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KuAp\\eclipse-workspace\\7RMart\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver = WebDriverManager.chromedriver().create();
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		waitutility =new WaitUtility();
		waitutility.implicitwait(driver);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void driverCloseOrQuit() {
		// driver.close();
		driver.quit();
	}

}
