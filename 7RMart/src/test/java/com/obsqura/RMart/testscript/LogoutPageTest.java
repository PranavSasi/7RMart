package com.obsqura.RMart.testscript;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import pages.LoginPage;
import pages.LogoutPage;

public class LogoutPageTest extends Base {

	public LoginPage loginpage;
	public LogoutPage logoutpage;

	@Test
	public void verifyUserIsAbleToLoginWithCorrectUserNameAndPassword() {

		String userName = ExcelUtility.getString(1,0,"LoginPage");
		String password = ExcelUtility.getString(1,1,"LoginPage");
		String expectedText = "Remember Me";
		loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickOnSigninButton();
		logoutpage = new LogoutPage(driver);
		logoutpage.clickOnadminHead().clickOnlogoutButton();
		String actualText = logoutpage.gettingLoginPageText();
		assertEquals(expectedText, actualText, "User unable to logout from Admin page");
	}
}