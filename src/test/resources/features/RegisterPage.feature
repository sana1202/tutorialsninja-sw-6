Feature: Register Page Test

  As a user i want to do registration into tutorial ninja website
  Background: I am on homepage

  @sanity @regression
  Scenario: User should navigate to register page successfully
    When I click on my account link
    And I select "Register" option from my account options
    Then I should navigate to register page successfully

  @smoke @regression
  Scenario: User should register account successfully
    When I click on my account link
    And I select "Register" option from my account options
    And I filled all mandatory field of registration
    And I click on continue button of registration page
    Then I should see account successfully created message
    And I click on continue
    And I click on my account link
    And I select "Logout" option from my account options
    Then I should logout successfully
    And I click on continue button