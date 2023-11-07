package com.TechAssessment3;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class WishListStepDefinition {
	
	WebDriver driver;
	WishListActions objwish = new WishListActions();
	WishlistPageLocators objwishloc = new WishlistPageLocators();
	
	@Before
	public void beforemethod() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	
	@Given("User launch the demoWebShop application url")
	public void user_launch_the_demo_web_shop_application_url() {
		
		HelperClass.openPage("https://demowebshop.tricentis.com/login");
	   
	}

	@When("logins the Application")
	public void logins_the_application() {
		
		System.out.println("User logins the application");
		objwish.wishlist("alibabass12@gmail.com","Abc@1234");
	    HelperClass.log.info("USer Login");
	    
	}

	@When("User adds a product to wishlist")
	public void user_adds_a_product_to_wishlist() {
		
		HelperClass.log.info("User added to wishlist");
		System.out.println("User adds a product to wishlist and goes to his/her wishlist");
		objwish.clickAddToWishlist();
		objwish.clickMyWishlist();
	   
	}

	@When("User remove the product from wishlist")
	public void user_remove_the_product_from_wishlist() {
		HelperClass.log.info("User removed from wish list");
		System.out.println("User remove the product");
		objwish.clickSelectBox();
		objwish.clickUpdate();

		
	    
	}

	@Then("User get the confirmation message")
	public void user_get_the_confirmation_message() {
		Assert.assertTrue(objwish.verifyText().contains( "The wishlist is empty!"));
	    HelperClass.log.info("User get empty wishlist");
	    System.out.println("User wishlist status is been shown");
	}
	
		


}
