package com.obsqura.RMart.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import pages.LocationAddPage;
import pages.LocationDeletePage;
import pages.LoginPage;

public class LocationDeleteTest extends Base{
	
	
	public LoginPage loginpage;
	public LocationAddPage loacationAddPage;
	public LocationDeletePage locationDeletePage;
	
	@Test
	public void verifyUserIsAbleToCreateNewLocation() {
		
		String userName = ExcelUtility.getString(1,0,"LoginPage");
		String password = ExcelUtility.getString(1,1,"LoginPage");
		String location = ExcelUtility.getString(2, 0, "LocationAdd");
		String deliveryCharge= ExcelUtility.getString(2, 1, "LocationAdd");
		String expectedText ="Alert!";
		loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickOnSigninButton();
		loacationAddPage=new LocationAddPage(driver);
		loacationAddPage.clickingmanageLocationButtton().clickingnewButton().selectingCountry().selectingState().enterLocation(location).enterDeliveryCharges(deliveryCharge).clickingSSaveButton();
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/list-location");
		locationDeletePage =new LocationDeletePage(driver);
		locationDeletePage.clickLocationName();
		locationDeletePage.clickdeleteLocationButton();
		String toDelete="35SpecialRoad";
		List<WebElement> table = driver.findElements(By.xpath(""));
		//table[@class='table table-bordered table-hover table-sm']
		
	}
}
