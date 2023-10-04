package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class AdminUserCreation {
	public PageUtility pageutility;
	public WebDriver driver;

	public AdminUserCreation(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']")private WebElement adminUserPage;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")private WebElement newButton;
	@FindBy(xpath = "//input[contains(@type,'text') and @id='username']")private WebElement usernameField;
	@FindBy(xpath = "//input[contains(@type,'password') and @id='password']")private WebElement passwordField;
	@FindBy(xpath = "//select[@id='user_type']")private WebElement userTypeSelection;
	@FindBy(xpath = "//button[@name='Create']")private WebElement saveButton;
	@FindBy(xpath = "//h5[text()=' Alert!']")private WebElement alertMessage;
	
	
 	public AdminUserCreation clickingAdminUserPage() {
		adminUserPage.click();
		return this;
	}
	public AdminUserCreation clickingnewButton() {
		newButton.click();
		return this;
	}
	public AdminUserCreation enterUserNameOnUserNameField(String userNameCreation) {
		usernameField.sendKeys(userNameCreation);
		return this;
	}
	public AdminUserCreation enterPasswordOnPasswordField(String passwordCreation) {
		passwordField.sendKeys(passwordCreation);
		return this;
	}
	public AdminUserCreation clickinguserTypeSelection() {
		PageUtility pageUtility=new PageUtility();
		pageUtility.selectDropdownbyText(userTypeSelection,"Partner");
		return this;
	}
	public AdminUserCreation clickingsaveButton() {
		saveButton.click();
		return this;
	}
	public String gettingAlertMessageText() {
		return alertMessage.getText();
	}
	
}
