Feature: Registering in DemoWebShop Application

Background:
	  
    Given User launch the demoWebShop application url "https://demowebshop.tricentis.com/register"
    
  Scenario: User provides user details to register
 
    When User provides valid user details
    And User clicks the register
    Then User get the confirmation message
    