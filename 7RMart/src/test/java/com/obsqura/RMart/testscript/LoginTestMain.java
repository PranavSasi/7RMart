package com.obsqura.RMart.testscript;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import pages.LoginPage;

public class LoginTestMain extends Base {

	public LoginPage loginpage;

	@Test
	public void verifyUserIsAbleToLoginWithCorrectUserNameAndPassword() {
		
		String userName = ExcelUtility.getString(1,0,"LoginPage");
		String password = ExcelUtility.getString(1,1,"LoginPage");
		String expectedHomePageText = "Dashboard";
		loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickOnSigninButton();
		String actualHomePageText = loginpage.gettingHomePageText();
		assertEquals(expectedHomePageText, actualHomePageText,"User unable to login to Admin page with correct Username and correct Password");

	}

	@Test
	public void verifyUserIsUnableToLoginWithCorrectUserNameAndWrongPassword() {

		String userName = ExcelUtility.getString(1,0,"LoginPage");
		String password = ExcelUtility.getString(1,3,"LoginPage");
		String expectedAlertText = "Alert!";
		loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickOnSigninButton();
		String actualAlertText = loginpage.gettingAlertMessageText();
		assertEquals(expectedAlertText, actualAlertText,"User able to Signin using correct Username and wrong Password");

	}
	
	@Test
	public void verifyUserIsUnableToLoginWithWrongUserNameAndCorrectPassword() {

		String userName = ExcelUtility.getString(1,2,"LoginPage");
		String password = ExcelUtility.getString(1,1,"LoginPage");
		String expectedAlertText = "Alert!";
		loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickOnSigninButton();
		String actualAlertText = loginpage.gettingAlertMessageText();
		assertEquals(expectedAlertText, actualAlertText,"User able to Signin using Wrong Username and Correct Password");

	}
	
	@Test
	public void verifyUserIsUnableToLoginWithWrongUserNameAndWrongPassword() {

		String userName = ExcelUtility.getString(1,2,"LoginPage");
		String password = ExcelUtility.getString(1,3,"LoginPage");
		String expectedAlertText = "Alert!";
		loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickOnSigninButton();
		String actualAlertText = loginpage.gettingAlertMessageText();
		assertEquals(expectedAlertText, actualAlertText,"User able to Signin using Wrong Username and wrong Password");

	}
}
