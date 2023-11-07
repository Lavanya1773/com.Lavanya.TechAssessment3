//package com.TechAssessment3;
//
//import java.time.Duration;
//import java.util.List;
//import java.util.Map;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.Assert;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginStepDefinitionClass {
//	
//	LoginPageActions objLogin = new LoginPageActions();
////	LoginPageLocators objLoginLoc = new LoginPageLocators();
//	
//	WebDriver driver;
//	
//	@Before
//	public void beforemethod() {
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().window().maximize();
//	}
//	
//	@Given("User launch the DemoWebShop application using url {string}")
//	public void user_launch_the_demo_web_shop_application_using_url(String url) {
//	    
//		System.out.println("Login Url is launched");
//		HelperClass.openPage(url);
//	}
//
//	@When("User click login and provide credentials")
//	public void user_click_login_and_provide_credentials(DataTable dataTable) {
//		
//		System.out.println("Credentials Entered");
//	    List<Map<String,String>> signUpForm =dataTable.asMaps(String.class, String.class);
//	    for(Map<String,String> form : signUpForm) {
//	    	String email = form.get("Email");
//	    	System.out.println("Email:" + email);
//	    	objLogin.setEmail(email);
//	    	
//	    	String password = form.get("Password");
//	    	System.out.println("Password:" +password);
//	    	objLogin.setPassword(password);
//	    	
//	    	objLogin.clickLogin();
//	    }
//	    
//	}
//
//	@Then("User geta a confirmation message")
//	public void user_geta_a_confirmation_message() {
//		String logouttext = driver.findElement(By.xpath("//a[@class='ico-logout']")).getText();
//	    System.out.println("Logout available:" +logouttext);
//	    Assert.assertTrue(logouttext.equals("Log out"));
//	    
//	}
//
//	@Then("User get an error message")
//	public void user_get_an_error_message() {
//		
//		String invalidMessage = driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']")).getText();
//		 Assert.assertTrue(invalidMessage.equals("Login was unsuccessful. Please correct the errors and try again."));
//		 System.out.println("Expected Error Message:" +invalidMessage);
//	   
//	}
//}
