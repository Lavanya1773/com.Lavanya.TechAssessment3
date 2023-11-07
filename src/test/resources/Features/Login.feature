Feature: User Login the DemoWebShop Application
 
  @ValidCredentials
  
  Scenario: User provide Valid credentials to login
  
    Given User launch the DemoWebShop application using url "https://demowebshop.tricentis.com/login"
    When User click login and provide credentials       
    |          Email          | Password |
    | alibabas12@gmail.com    | Abc@1234 |
    
 
    Then User geta a confirmation message
 
  @InvalidCredentials
  Scenario Outline: User provide invalid credentials to login
    
    Given User launch the DemoWebShop application using url "https://demowebshop.tricentis.com/login"
    When User click login and provide credentials
    |          Email          | Password |
    |     abas12@gmail.com    | Abc@1234 |
    |  alibabas12@gmail.com   | Abc@123  |
    
    
    Then User get an error message
    