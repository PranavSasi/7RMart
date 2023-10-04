package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class ManagingDeliveryBoyPage {
	
	public PageUtility pageutility;
	public WebDriver driver;

	public ManagingDeliveryBoyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/list-deliveryboy') and @class=' nav-link']")private WebElement manageDeliveryBoyButton;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Deliveryboy/add']")private WebElement newButton;
	@FindBy(xpath = "//input[@id='name']")private WebElement enterNameField;
	@FindBy(xpath = "//input[@id='email']")private WebElement emailField;
	@FindBy(xpath = "//input[@id='phone']")private WebElement phoneField;
	@FindBy(xpath = "//textarea[@id='address']")private WebElement addresField;
	@FindBy(xpath = "//input[@id='username']")private WebElement userNameField;
	@FindBy(xpath = "//input[@id='password']")private WebElement passwordField;
	@FindBy(xpath = "//button[@name='create']")private WebElement saveButton;
	@FindBy(xpath = "//h5[text()=' Alert!']")private WebElement alertMessage;

	
	public ManagingDeliveryBoyPage clickOnManageDeliveryBoyButton() {
		manageDeliveryBoyButton.click();
		return this;
	}
	
	public ManagingDeliveryBoyPage clickOnNewButton() {
		newButton.click();
		return this;
	}
	
	public ManagingDeliveryBoyPage enterNameOnNameField(String name) {
		enterNameField.sendKeys(name);
		return this;
	}
	
	public ManagingDeliveryBoyPage enterEmailField(String email) {
		emailField.sendKeys(email);
		return this;
	}
	
	public ManagingDeliveryBoyPage enterPhoneField(String phone) {
		phoneField.sendKeys(phone);
		return this;
	}
	
	public ManagingDeliveryBoyPage enteraddresField(String address) {
		addresField.sendKeys(address);
		return this;
	}
	
	public ManagingDeliveryBoyPage enterUserNameField(String userNameCreation) {
		userNameField.sendKeys(userNameCreation);
		return this;
	}
	
	public ManagingDeliveryBoyPage enterPasswordField(String passwordCreation) {
		passwordField.sendKeys(passwordCreation);
		return this;
	}
	
	public ManagingDeliveryBoyPage clickOnSaveButton1() {
		saveButton.click();
		return this;
	}
	
	public String gettingTextOfAlertMessage() {
		return alertMessage.getText();
			}
}
