@uiautomation @login
Feature: Login
  As a user I should be able to login when I enter valid credentials

  @successfulLogin
  Scenario Outline: As a user should be able to successfully login
    Given I navigate to the shopping website
    When I navigate to Signin page
    And I enter valid "<EmailAddress>" and "<Password>"
    Then I should be able to successfully login

    Examples:
      | EmailAddress     | Password  |
      | test@121212.com  | test1234  |
      | newtest@test.com | test12345 |

  @unsuccessfulLogin
  Scenario Outline: As a unregistered user should not be able to login
    Given I navigate to the shopping website
    When I navigate to Signin page
    And I enter "<EmailAddress>" and "<Password>" which are not registered
    Then I should not be able to login

    Examples:
      | EmailAddress         | Password  |
      | invaliduser@tes.com  | test1234  |
      | notareguser@test.com | test12345 |
    	
      
      
      
      
      
      
