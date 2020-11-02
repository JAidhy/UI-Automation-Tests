@uiautomation
Feature: Register user
  As a user I should be able to register a new user

  @customerregistration
  Scenario: User should be able to register on the shopping website
    Given I navigate to the shopping website
    When I select sign in to register as a new user
    And I enter valid email address to create an account
    And I enter valid personal information
    Then I should be able successfully register
   
 
