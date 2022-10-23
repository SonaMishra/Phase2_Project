Feature: Add to Cart

  Background: 
    Given I have launched the application

  @sanity
  Scenario: This scenario is to define the add to cart functionality
    When I enter the username as "standard_user" and Password as "secret_sauce"
    And I click on the Login Button
    Then I should land on the home page
    And Add this product into cart "Sauce Labs Bike Light"