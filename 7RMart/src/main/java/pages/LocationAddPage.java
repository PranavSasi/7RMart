package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class LocationAddPage {
	
	public PageUtility pageutility;
	public WebDriver driver;

	public LocationAddPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/list-location') and @class='small-box-footer']")private WebElement manageLocationButtton;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")private WebElement newButton;
	@FindBy(xpath = "//select[@id='country_id']")private WebElement selectCountry;
	@FindBy(xpath = "//select[@id='st_id']")private WebElement selectState;
	@FindBy(xpath = "//input[@id='location']")private WebElement locationField;
	@FindBy(xpath = "//input[@id='delivery']")private WebElement deliveryCharges;
	@FindBy(xpath = "//button[@type='submit']")private WebElement saveButton;
	@FindBy(xpath = "//h5[text()=' Alert!']")private WebElement alertMessage;

	//h5[text()=' Alert!']
	
	public LocationAddPage clickingmanageLocationButtton() {
		manageLocationButtton.click();
		return this;
	}
	public LocationAddPage clickingnewButton() {
		newButton.click();
		return this;
	}
	public LocationAddPage selectingCountry() {
		PageUtility pageUtility=new PageUtility();
		pageUtility.selectDropdownbyText(selectCountry,"United Kingdom");
		return this;
	}
	public LocationAddPage selectingState() {
		PageUtility pageUtility=new PageUtility();
		pageUtility.selectDropdownbyText(selectState,"Birmingham");
		return this;
	}
	public LocationAddPage enterLocation(String location) {
		locationField.sendKeys(location);
		return this;
	}
	public LocationAddPage enterDeliveryCharges(String deliveryCharge) {
		deliveryCharges.sendKeys(deliveryCharge);
		return this;
	}
	
	public LocationAddPage clickingSSaveButton() {
		saveButton.click();
		return this;
	}
	public String gettingAlertMessageText() {
		return alertMessage.getText();
	}
}
