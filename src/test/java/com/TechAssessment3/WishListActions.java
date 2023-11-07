package com.TechAssessment3;

import org.openqa.selenium.support.PageFactory;

public class WishListActions {
	
	WishlistPageLocators wishlistPageLocators = null;

	
	
	//constructor
	
	public WishListActions() {  
		this.wishlistPageLocators = new WishlistPageLocators();	
		
		PageFactory.initElements(HelperClass.getDriver(), wishlistPageLocators);
	}
	
	public void setEmail(String stremail) {
		wishlistPageLocators.email.sendKeys(stremail);
	}
	
	public void setPassword(String strpassword) {
		wishlistPageLocators.password.sendKeys(strpassword);
	}
	
	public void clickLogin() {
		wishlistPageLocators.loginButton.click();
	}
	
	public void clickAddToWishlist() {
		wishlistPageLocators.addToWishlist.click();
	}

	public void clickMyWishlist() {
		wishlistPageLocators.myWishlist.click();
	}
	
	public void clickSelectBox() {
		wishlistPageLocators.remove.click();
	}
	
	public void clickUpdate() {
		wishlistPageLocators.updateWishList.click();
	}
	
	public String verifyText() {
		return wishlistPageLocators.status.getText();
	}

	
	
	public void wishlist(String stremail, String strpassword) {
		
		this.setEmail(stremail);
		this.setPassword(strpassword);
		this.clickLogin();
		
		this.clickAddToWishlist();
		this.clickMyWishlist();
		this.clickSelectBox();
		this.clickUpdate();
		
	}

}
