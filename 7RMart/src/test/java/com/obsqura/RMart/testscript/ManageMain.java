package com.obsqura.RMart.testscript;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import pages.LoginPage;
import pages.ManageLocationPage;
import pages.ManagePage;

public class ManageMain extends Base {

	public LoginPage loginpage;
	public ManagePage managepage;

	@Test
	public void verifyUserIsAbleToNavigateToManagePages() {

		String userName = ExcelUtility.getString(1,0,"LoginPage");
		String password = ExcelUtility.getString(1,1,"LoginPage");
		String elementExcepted = "List Pages";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickOnSigninButton();
		managepage = new ManagePage(driver);
		managepage.clickingManagePageButton();
		String elementActual = managepage.navigateToListPages();
		assertEquals(elementExcepted, elementActual, "User is unable to navigate the managepages");

	}
}
