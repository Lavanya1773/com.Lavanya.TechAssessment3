package com.TechAssessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	WebElement loginButton;	
	
//	@FindBy(xpath = "//span[text()='Login was unsuccessful. Please correct the errors and try again.']")
//	WebElement error;
	
}
