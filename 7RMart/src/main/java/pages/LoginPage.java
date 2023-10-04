package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class LoginPage {
	public PageUtility pageutility;
	public WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@placeholder='Username']")private WebElement userNameField;
	@FindBy(xpath = "//input[@placeholder='Password']")private WebElement passwordField;
	@FindBy(xpath = "//button[@type='submit']")private WebElement signinButton;
	@FindBy(xpath = "//li[@class='breadcrumb-item active']")private WebElement adminPage;
	@FindBy(xpath = "//h5[text()=' Alert!']")private WebElement alertMessage;

	public LoginPage enterUserNameOnUserNameField(String userName) {

		userNameField.sendKeys(userName);
		return this;
	}

	public LoginPage enterPasswordOnPasswordField(String password) {

		passwordField.sendKeys(password);
		return this;
	}

	public LoginPage clickOnSigninButton() {

		signinButton.click();
		return this;
	}

	public String gettingHomePageText() {

		return adminPage.getText();
	}

	public String gettingAlertMessageText() {

		return alertMessage.getText();
	}

	public void x() {

		pageutility = new PageUtility();
		pageutility.selectDropdownbyText(alertMessage, "Red");

	}

}
