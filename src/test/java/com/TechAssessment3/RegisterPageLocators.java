package com.TechAssessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageLocators {
	
	//Element Locators
	@FindBy(xpath = "//input[@id='gender-male']")
	WebElement gender;
		
	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@id='LastName']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	WebElement confirmPassword;
	
	@FindBy(xpath = "//input[@id='register-button']")
	WebElement registerButton;
	
	@FindBy(xpath = "//a[@class='ico-logout']")
	WebElement registerTitle;
	
	
}
