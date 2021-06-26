package com.commonFunction;

import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.objectRepositery.ObjectRepository_xpath;
import com.utilities.PageActions;

public class ResuableFunction extends PageActions {
	ExtentReports extent;
	ExtentTest test;
	
	public static void clickLoginIcon() {

		getElement("Evaly login button", "User login button Found",
				(By.xpath(ObjectRepository_xpath.loginButtonClick)), defaultElementLoadTime, "click", "");
	}
	

	public static void enterUserPhone() {
		String userPhone = getData.getCellData(sheetName, startIter, "UserPhone");

		getElement("Evaly login page", "User phone number Textbox Found", (By.xpath(ObjectRepository_xpath.evalyUserPhone)),
				defaultElementLoadTime, "sendKeys", userPhone);
	}

	public static void enterUserPassword() {
		String password = getData.getCellData(sheetName, startIter, "Password");

		getElement("Evaly login page", "Password Textbox Found", (By.xpath(ObjectRepository_xpath.evalyUserPassword)),
				defaultElementLoadTime, "sendKeys", password);
	}

	public static void clickLoginButton() {

		getElement("Yahoo login page", "User password signin button Found",
				(By.xpath(ObjectRepository_xpath.evalyLoginButton)), defaultElementLoadTime, "click", "");
	}


}
