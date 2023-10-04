package com.obsqura.RMart.testscript;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import pages.AdminUserCreation;
import pages.LoginPage;

public class AdminUserCreationTest extends Base{

	public LoginPage loginpage;
	public AdminUserCreation adminUserCreation;

	@Test
	public void verifyUserIsAbleToCreateNewAdminUser() {
		
		String userName = ExcelUtility.getString(1,0,"LoginPage");
		String password = ExcelUtility.getString(1,1,"LoginPage");
		String userNameCreation= ExcelUtility.getString(1, 0, "AdminUserCreation");
		String passwordCreation= ExcelUtility.getString(1, 1, "AdminUserCreation");
		String expectedText ="Alert!";
		loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickOnSigninButton();
		adminUserCreation = new AdminUserCreation(driver);
		adminUserCreation.clickingAdminUserPage().clickingnewButton().enterUserNameOnUserNameField(userNameCreation).enterPasswordOnPasswordField(passwordCreation).clickinguserTypeSelection().clickingsaveButton();
		String actualText= adminUserCreation.gettingAlertMessageText();
		assertEquals(expectedText,actualText,"User is unable to create new AdminUser");
	}
}
