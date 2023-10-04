package com.obsqura.RMart.testscript;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import pages.LoginPage;
import pages.PushNotification;

public class PushNotificationTest extends Base {

	public LoginPage loginpage;
	public PushNotification pushNotification;

	@Test
	public void verifyUserIsAbleToSendPushNotificatio() {

		String userName = ExcelUtility.getString(1, 0, "LoginPage");
		String password = ExcelUtility.getString(1,1,"LoginPage");
		String enterTitle = ExcelUtility.getString(1,0,"PushNotification");
		String enterDiscription =  ExcelUtility.getString(1,1,"PushNotification");
		String expectedText ="Alert!";
		loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickOnSigninButton();
		pushNotification =new PushNotification(driver);
		pushNotification.clickPushNotificationsButton().clickEnterTitle(enterTitle).clickEnterDiscription(enterDiscription).clicksubmitButton();
		String actualText= pushNotification.gettingsucessAlertText();
		assertEquals( expectedText, actualText,"User unable to send Push Notification");
	}
}
