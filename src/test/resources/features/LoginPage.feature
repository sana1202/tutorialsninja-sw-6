Feature: Login Page Test

  As a user I want to check login/logout functionality
  Background: I am on homepage

  @sanity @regression
  Scenario: User should navigate to login page successfully
    When I click on my account link
    And I select "Login" option from my account options
    Then I should navigate to login page successfully

  @smoke @regression
  Scenario: User should login and logout successfully
    When I click on my account link
    And I select "Login" option from my account options
    And I enter email "iampatel@gmail.com"
    And I enter password "HelloNum1"
    And I click on login button
    Then I should login successfully
    And I click on my account link
    And I select "Logout" option from my account options
    Then I should logout successfully
    And I click on continue button