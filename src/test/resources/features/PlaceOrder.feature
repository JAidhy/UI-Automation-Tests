@uiautomation
Feature: Place order
  As a user I want to place an order

  @addToCart
  Scenario: User should be able to add an item to the cart
    Given I navigate to the shopping website
    When I navigate to Summer Dresses
    And I select an item from Summer Dresses list
    And I add the item to the cart
    Then the item should be successfully added to the cart
   
 
