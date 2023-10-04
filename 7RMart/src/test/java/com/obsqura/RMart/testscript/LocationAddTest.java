package com.obsqura.RMart.testscript;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import Utilities.ExcelUtility;
import pages.LocationAddPage;
import pages.LoginPage;

public class LocationAddTest extends Base {
	
	public LoginPage loginpage;
	public LocationAddPage loacationAddPage;
	
	@Test
	public void verifyUserIsAbleToCreateNewLocation() {
		
		String userName = ExcelUtility.getString(1,0,"LoginPage");
		String password = ExcelUtility.getString(1,1,"LoginPage");
		String location = ExcelUtility.getString(1, 0, "LocationAdd");
		String deliveryCharge= ExcelUtility.getString(1, 1, "LocationAdd");
		String expectedText ="Alert!";
		loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickOnSigninButton();
		loacationAddPage=new LocationAddPage(driver).clickingmanageLocationButtton().clickingnewButton().selectingCountry().selectingState().enterLocation(location).enterDeliveryCharges(deliveryCharge).clickingSSaveButton();
		String actualMessage= loacationAddPage.gettingAlertMessageText();
		assertEquals(expectedText, actualMessage,"User unable to create new Location");
		
	}
}