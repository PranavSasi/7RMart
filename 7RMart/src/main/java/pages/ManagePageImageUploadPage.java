package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.FileUploadUtility;
import Utilities.GeneralUtility;

public class ManagePageImageUploadPage {

	public WebDriver driver;
	
	public ManagePageImageUploadPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/list-page') and @class='small-box-footer']")private WebElement managePageButton;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/pages/add']")private WebElement addNewButton;
	@FindBy(xpath = "//input[@id='title']")private WebElement enterTitleField;
	@FindBy(xpath = "//div[@contenteditable='true']")private WebElement descriptionField;
	@FindBy(xpath = "//input[@id='page']")private WebElement pageField;
	@FindBy(xpath = "//input[@id='main_img']")private WebElement imageUploadField;
	@FindBy(xpath = "//button[text()='Save']") WebElement saveButton;
	@FindBy(xpath = "//h5[text()=' Alert!']") WebElement confirmationOfUpload;

	public ManagePageImageUploadPage clickingManagePageButton() {
		managePageButton.click();
		return this;
	}
	public ManagePageImageUploadPage clickingAddNewButton() {
		addNewButton.click();
		return this;
	}
	public ManagePageImageUploadPage enterEnterTitleField(String enterTitle) {
		enterTitleField.sendKeys(enterTitle);
		return this;
	}
	public ManagePageImageUploadPage enterDescriptionField(String description) {
		descriptionField.sendKeys(description);
		return this;
	}
	public ManagePageImageUploadPage enterpageField(String enterpage) {
		pageField.sendKeys(enterpage);
		return this;
	}
	public ManagePageImageUploadPage imageUploadFieldButton() throws AWTException {
		FileUploadUtility fileUploadUtility= new FileUploadUtility();
		fileUploadUtility.fileUploadUsingSendKeys(imageUploadField, GeneralUtility.IMAGEFRUITMANGO);
		return this;
	}
	public ManagePageImageUploadPage clickingSaveButton() {
		saveButton.click();
		return this;
	}
	public String gettingsucessAlertText() {
		return confirmationOfUpload.getText();
	}

}
//FileUploadUtility fileUploadUtility=new FileUploadUtility();
//fileUploadUtility.fileUploadUsingRobotClass(imageUploadField, GeneralUtility.IMAGEFRUITMANGO);