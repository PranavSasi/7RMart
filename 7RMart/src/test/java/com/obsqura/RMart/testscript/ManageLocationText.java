package com.obsqura.RMart.testscript;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import pages.LoginPage;
import pages.ManageLocationPage;
import pages.ManagePage;
import pages.PushNotification;

public class ManageLocationText extends Base {

	public LoginPage loginpage;
	public ManageLocationPage managelocationpage;

	@Test
	public void verifyUserIsAbleToUpdateLocationInManageLocationPage() {
		String userName = ExcelUtility.getString(1,0,"LoginPage");
		String password = ExcelUtility.getString(1,1,"LoginPage");
		String updateExpectedText = "Alert!";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickOnSigninButton();
		ManageLocationPage managelocationpage = new ManageLocationPage(driver);
		managelocationpage= new ManageLocationPage(driver);
		managelocationpage.viewsidebarmenu().clicktomanagelocation().checktoedit().updatedclickable();
		String updateActualText= managelocationpage.gettingVerifyUpdate();
		assertEquals(updateExpectedText , updateActualText, "User Is Unable To Update Location In ManageLocationPage");
	}
}
