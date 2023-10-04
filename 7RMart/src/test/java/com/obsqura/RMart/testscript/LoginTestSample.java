package com.obsqura.RMart.testscript;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTestSample extends Base {

	@Test
	public void loginWCorrectUserNamePassword() {
		String userName = "admin";
		String password = "admin";
		String expectedResult = "Admin";
		WebElement userNameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userNameField.sendKeys(userName);
		WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passwordField.sendKeys(password);
		WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
		signInButton.click();
		WebElement adminpage = driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
		String actualResult = adminpage.getText();
		assertEquals(expectedResult, actualResult,"Verify if Signed in succefully to Admin page with correct username and correct password ");
	}

	@Test
	public void loginWCorrectUserNameWrongPassword() {
		String userName = "admin";
		String password = "admin12123";
		String expectedResult = "Alert!";
		WebElement userNameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userNameField.sendKeys(userName);
		WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passwordField.sendKeys(password);
		WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
		signInButton.click();
		WebElement alertMessage = driver.findElement(By.xpath("//h5[text()=' Alert!']"));
		String actualResult = alertMessage.getText();
		assertEquals(expectedResult, actualResult, "Verify if correct username and wrong Password has faild to Signin");
	}

	@Test
	public void loginWWrongUserNameCorrectPassword() {
		String userName = "admin23122";
		String password = "admin";
		String expectedResult = "Alert!";
		WebElement userNameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userNameField.sendKeys(userName);
		WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passwordField.sendKeys(password);
		WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
		signInButton.click();
		WebElement alertMessage = driver.findElement(By.xpath("//h5[text()=' Alert!']"));
		String actualResult = alertMessage.getText();
		assertEquals(expectedResult, actualResult, "Verify if wrong username and correct Password has faild to Signin");
	}

	@Test
	public void loginWWrongUserNameWrongPassword() {
		String userName = "admin23122";
		String password = "admin32545";
		String expectedResult = "Alert!";
		WebElement userNameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userNameField.sendKeys(userName);
		WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passwordField.sendKeys(password);
		WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
		signInButton.click();
		WebElement alertMessage = driver.findElement(By.xpath("//h5[text()=' Alert!']"));
		String actualResult = alertMessage.getText();
		assertEquals(expectedResult, actualResult, "Verify if wrong username and wrong Password has faild to Signin");
	}

}
