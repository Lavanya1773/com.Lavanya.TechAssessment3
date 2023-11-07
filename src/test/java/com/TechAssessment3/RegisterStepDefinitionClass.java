//package com.TechAssessment3;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import java.time.Duration;
//
//public class RegisterStepDefinitionClass {
//	
//	UtilityClass data = new UtilityClass();
//	RegisterPageActions objReg = new RegisterPageActions();
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
//	@Given("User launch the demoWebShop application url {string}")
//	public void user_launch_the_demo_web_shop_application_url(String url) {
//		
//		System.out.println("Url is launched");
//		HelperClass.openPage(url);
////		HelperClass.openPage(data.url);
//		
//	    
//	}
//
//	@When("User provides valid user details")
//	public void user_provides_valid_user_details() {
//		System.out.println("User provide valid details to Register");
//		objReg.register(data.gender, data.firstname, data.lastname, data.email, data.password, data.confirmpassword);
//	   
//	}
//
//	@When("User clicks the register")
//	public void user_clicks_the_register() {
//		System.out.println("User clicks the register button");
//		objReg.clickRegister();
//	    
//	}
//
//	@Then("User get the confirmation message")
//	public void user_get_the_confirmation_message() {
//		String registertext = driver.findElement(By.xpath("//div[@class='result']")).getText();
//		System.out.println("RegisterMessage:" +registertext);
//	    Assert.assertTrue(registertext.equals(" Your registration completed"));
//	    
//	}
//}
