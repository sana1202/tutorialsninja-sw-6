Feature: Laptop And Notebook Page Test

  As a user I want to check functionality of laptop and notebook page

  Background: I am on homepage

  @sanity @regression
  Scenario: User should arrange product in price high to low order successfully
    When I mouse hover and click on laptop and notebook tab
    And I click on show all laptop and notebook
    And I click on sort by position
    And I select product sort by "Price (High > Low)"
    Then I should see product arrange in price high to low order successfully

  @smoke @regression
  Scenario: User should place order successfully
    When I mouse hover and click on laptop and notebook tab
    And I click on show all laptop and notebook
    And I select currency "£Pound Sterling"
    And I select product sort by "Price (High > Low)"
    And I select product "Macbook" from laptop and notebook page
    Then I should navigate to "MacBook" product
    And I click on add to cart button
    Then I should see product macbook added successfully message
    And I click on shopping cart button
    Then I should see shopping cart text
    And I should see "MacBook" product
    And I change quantity "2" for product
    And I click on update quantity
    Then I should see cart modified message
    And I should see total price for macbook products
    And I click on checkout button
    Then I should navigate to checkout page
    And I should see new customer text
    And I click on guest checkout button
    And I click on continue button of guest checkout page
    And I filled all mandatory field of checkout page
    And I click on continue after fill all detail on checkout page
    And I add comments to text area about product order
    And I click checkbox of terms and condition
    And I click on continue of checkout
    Then I should see warning message regarding Payment method