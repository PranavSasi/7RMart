package com.obsqura.RMart.testscript;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import pages.LoginPage;
import pages.ManagingDeliveryBoyPage;

public class ManageDeliveryBoyTest extends Base {
	public LoginPage loginpage;
	public ManagingDeliveryBoyPage managingDeliveryBoyPage;
	
	@Test
	public void verifyUserIsAbleToCreateNewDeliveryBoyAccount() {
		String userName = ExcelUtility.getString(1,0,"LoginPage");
		String password = ExcelUtility.getString(1,1,"LoginPage");
		String name= ExcelUtility.getString(1, 0, "ManageDeliveryBoy");
		String email= ExcelUtility.getString(1, 1, "ManageDeliveryBoy");
		String phone = ExcelUtility.getString(1, 2, "ManageDeliveryBoy");
		String address =ExcelUtility.getString(1, 3, "ManageDeliveryBoy");
		String userNameCreation=ExcelUtility.getString(1, 4, "ManageDeliveryBoy");
		String passwordCreation = ExcelUtility.getString(1, 5, "ManageDeliveryBoy");
		String expectedText ="Alert!";
		loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickOnSigninButton();
		managingDeliveryBoyPage= new ManagingDeliveryBoyPage(driver);
		managingDeliveryBoyPage.clickOnManageDeliveryBoyButton().clickOnNewButton().enterNameOnNameField(name).enterEmailField(email).enterPhoneField(phone).enteraddresField(address).enterUserNameField(userNameCreation).enterPasswordField(passwordCreation);
		managingDeliveryBoyPage.clickOnSaveButton1();
		String actualText= managingDeliveryBoyPage.gettingTextOfAlertMessage();
		assertEquals(expectedText, actualText, "User is unable to create new Delivery Boy Account");
	}
}
