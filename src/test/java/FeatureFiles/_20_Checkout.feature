@RegressionTest @SmokeTestShopping
Feature: Checkout Functionality

  Background:
    Given a customer navigates to LunaBlanco

  Scenario: Add items to cart and checkout page functions
    When the customer clicks on any product
    Then the customer confirms the existence of information text about the product(Fabric information,Delivery time,Price information)
    And the customer clicks on the size chart unit and verifies that the chart opens
    Then the customer verifies high quality photos of the product taken from different angles
    And the customer clicks on washing instructions and additional information and verifies text
    And the customer selects the product size, checks the stock status, determines the product quantity and clicks the add to cart button
    Then the customer verifies the text product successfully added to cart
    And the customer hovers over the shopping cart and clicks the checkout button
    When the customer clicks on payment options and enters incorrect credit card details
    And the customer enters personal information
    Then the customer calculates and verifies the total price of the product
    And the customer enters personal information
    Then the customer verifies the error message on the message display