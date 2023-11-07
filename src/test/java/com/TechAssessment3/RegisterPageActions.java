package com.TechAssessment3;

import org.openqa.selenium.support.PageFactory;

public class RegisterPageActions {
	RegisterPageLocators registerPageLocators = null;
	String strGender, strfirstName, strlastName, stremail, strpassword, strconfirmPassword;   //read it from external file and store it here
	
	//constructor
	
	public RegisterPageActions() {  
		this.registerPageLocators = new RegisterPageLocators();		
		PageFactory.initElements(HelperClass.getDriver(), registerPageLocators);
	}
	
	public void setGender(String strGender) {
		registerPageLocators.gender.sendKeys(strGender);
	}

	public void setFirstName(String strfirstName) {
		registerPageLocators.firstName.sendKeys(strfirstName);
	}
	
	public void setLastName(String strlastName) {
		registerPageLocators.lastName.sendKeys(strlastName);
	}
	
	public void setEmail(String stremail) {
		registerPageLocators.email.sendKeys(stremail);
	}
	
	public void setPassword(String strpassword) {
		registerPageLocators.password.sendKeys(strpassword);
	}

	public void setConfirmPassword(String strconfirmPassword) {
		registerPageLocators.confirmPassword.sendKeys(strconfirmPassword);
	}

	
	public void clickRegister() {
		registerPageLocators.registerButton.click();
	}
	
	public void register(String strGender, String strfirstName, String strlastName, String stremail, String strpassword, String strconfirmPassword) {
		
		
		this.setGender(strGender);
		this.setFirstName(strfirstName);
		this.setLastName(strlastName);
		this.setEmail(stremail);
		this.setPassword(strpassword);
		this.setConfirmPassword(strconfirmPassword);
		this.clickRegister();
		
	}


}
