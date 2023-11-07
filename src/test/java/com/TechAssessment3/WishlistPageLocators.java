package com.TechAssessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishlistPageLocators {
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	WebElement loginButton;	
	
	@FindBy(xpath = "//input[@class='button-2 add-to-wishlist-button']")
	WebElement addToWishlist;
	
	@FindBy(xpath = "//a[@class='ico-wishlist']")
	WebElement myWishlist;
	
	@FindBy(xpath = "//input[@name='removefromcart']")
	WebElement remove;
	
	@FindBy(xpath = "//input[@value='Update wishlist']")
	WebElement updateWishList;
	
	@FindBy(xpath = "//div[@class='wishlist-content']")
	WebElement status;
}
