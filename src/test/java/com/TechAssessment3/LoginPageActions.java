package com.TechAssessment3;

import org.openqa.selenium.support.PageFactory;

public class LoginPageActions {
	
	LoginPageLocators loginPageLocators = null;
	String stremail, strpassword;   
	
	//constructor
	
	public LoginPageActions() {  
		this.loginPageLocators = new LoginPageLocators();		
		PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
	}
	
	
	public void setEmail(String stremail) {
		loginPageLocators.email.sendKeys(stremail);
	}
	
	public void setPassword(String strpassword) {
		loginPageLocators.password.sendKeys(strpassword);
	}

	
	public void clickLogin() {
		loginPageLocators.loginButton.click();
	}
	
	public void register(String stremail, String strpassword) {

		this.setEmail(stremail);
		this.setPassword(strpassword);
		this.clickLogin();
		
	}

}
