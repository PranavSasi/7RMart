package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageLocationPage {
	public WebDriver driver;

	public ManageLocationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-widget='pushmenu']") WebElement sidebar;
	@FindBy(xpath = "//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/list-location') and @class='small-box-footer']")	WebElement manageLocation;
	@FindBy(xpath = "//a[@href=\"https://groceryapp.uniqassosiates.com/admin/Location/edit?edit=1672&page_ad=1\"]")	WebElement editButton;
	@FindBy(xpath = "//button[@type='submit']")	WebElement update;
	@FindBy(xpath = "//h5[text()=' Alert!']")	WebElement verifyUpdate;

	//h5[text()=' Alert!']

	public ManageLocationPage viewsidebarmenu() {
		sidebar.click();
		return this;
	}

	public ManageLocationPage clicktomanagelocation() {
		manageLocation.click();
		return this;
	}

	public ManageLocationPage checktoedit() {
		editButton.click();
		return this;
	}
	public ManageLocationPage updatedclickable() {
		update.click();
		return this;
	}
	public String gettingVerifyUpdate() {
		return verifyUpdate.getText();
	}
}
