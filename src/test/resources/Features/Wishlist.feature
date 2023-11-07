Feature: Launch DemoWebShop Application and add product in wishlist

  Scenario: User Login and add a product to wishlist and removes it
  
    Given User launch the demoWebShop application url
    When logins the Application
    And User adds a product to wishlist
    And User remove the product from wishlist
    Then User get the confirmation message