package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PushNotification {

	public WebDriver driver;

	public PushNotification(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Push Notifications']")WebElement pushNotificationsButton;
	@FindBy(xpath = "//input[@name='titlep']")WebElement clickEnterTitle;
	@FindBy(xpath = "//input[@name='description']")WebElement clickEnterDiscription;
	@FindBy(xpath = "//button[@type='submit']")WebElement clicksubmitButton;
	@FindBy(xpath = "//h5[text()=' Alert!']")WebElement sucessAlertText;

	public PushNotification clickPushNotificationsButton() {
		pushNotificationsButton.click();
		return this;
	}

	public PushNotification clickEnterTitle(String enterTitle) {
		clickEnterTitle.sendKeys(enterTitle);
		return this;
	}

	public PushNotification clickEnterDiscription(String enterDiscription) {
		clickEnterDiscription.sendKeys(enterDiscription);
		return this;
	}

	public PushNotification clicksubmitButton() {
		clicksubmitButton.click();
		return this;
	}
	
	public String gettingsucessAlertText() {

		return sucessAlertText.getText();
	}
}
