package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	
	public void dragAnddrop(WebElement dragableItem, WebElement dropItem, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.clickAndHold(dragableItem).moveToElement(dropItem).release(dropItem).build().perform();
	}

	public void selectDropdownbyText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void selectDropdownbyIndex(WebElement element, int value) {
		Select select = new Select(element);
		select.selectByIndex(value);
	}
	
	public void selectDropdownbyTextvalue(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByValue(text);
	}
	
	public void selectDropdownbyTextValue(WebElement element,String text)
	 {
		 Select select = new Select(element);
		 select.deselectByValue(text);
	 }
	
	public void javascriptExecuter(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value" ,element); 
	} 
}