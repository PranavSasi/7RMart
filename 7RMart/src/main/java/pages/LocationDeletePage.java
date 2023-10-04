package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class LocationDeletePage {
	public PageUtility pageutility;
	public WebDriver driver;

	public LocationDeletePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[text()='35SpecialRoad']")WebElement locationName;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Location/delete?del=1677&page_ad=1']")WebElement deleteLocationButton;
	
	
	public LocationDeletePage clickLocationName() {
		locationName.click();
		return this;
	}
	public LocationDeletePage clickdeleteLocationButton() {
		deleteLocationButton.click();
		driver.switchTo().alert().accept();
		return this;
	}
	
	
}
