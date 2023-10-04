package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	public WebDriver driver;

	public LogoutPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-toggle='dropdown']")WebElement adminHead;
	@FindBy(xpath = "//i[contains(@class,'ace-icon fa fa-power-off')]")WebElement logoutButton;
	@FindBy(xpath = "//label[@for='remember']")WebElement loginpage;

	public LogoutPage clickOnadminHead() {
		adminHead.click();
		return this;
	}

	public LogoutPage clickOnlogoutButton() {
		logoutButton.click();
		return this;
	}

	public String gettingLoginPageText() {

		return loginpage.getText();
	}
}
