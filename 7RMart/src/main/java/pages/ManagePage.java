package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagePage {

	public WebDriver driver;
	public ManagePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/list-page') and @class='small-box-footer']")private WebElement managePageButton;
	@FindBy(xpath = "//h1[text()='List Pages']")WebElement listpages;

	public ManagePage clickingManagePageButton() {
		managePageButton.click();
		return this;
	}

	public String navigateToListPages() {
	 return listpages.getText();
	}
}
