package com.obsqura.RMart.testscript;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import pages.AdminUserCreation;
import pages.LoginPage;
import pages.ManagePageImageUploadPage;

public class ManagePageImageUploadTest extends Base {

	public LoginPage loginpage;
	public ManagePageImageUploadPage managePageImageUploadPage;
	
	@Test
	public void verifyUserIsAbleToUploadImage() throws AWTException {
		
		String userName = ExcelUtility.getString(1,0,"LoginPage");
		String password = ExcelUtility.getString(1,1,"LoginPage");
		String enterTitle= ExcelUtility.getString(1, 0, "ManagePageImage");
		String description= ExcelUtility.getString(1, 1, "ManagePageImage");
		String enterpage= ExcelUtility.getString(1, 2, "ManagePageImage");
		String expectedUploadText= "Alert!";
		loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickOnSigninButton();
		managePageImageUploadPage = new ManagePageImageUploadPage(driver);
		managePageImageUploadPage.clickingManagePageButton().clickingAddNewButton().enterEnterTitleField(enterTitle).enterDescriptionField(description).enterpageField(enterpage).imageUploadFieldButton();
		managePageImageUploadPage.clickingSaveButton();
		driver.navigate().back();
		String actualUploadText= managePageImageUploadPage.gettingsucessAlertText();
		assertEquals(expectedUploadText, actualUploadText, "User unable to Upload Image");
	}
}
