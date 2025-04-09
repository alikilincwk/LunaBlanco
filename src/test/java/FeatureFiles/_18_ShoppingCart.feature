@RegressionTest @SmokeTestShopping
Feature: ShoppingCart

  Background:
    Given a customer navigates to LunaBlanco

  Scenario: ShoppingCart Functionality
    When the customer clicks on any product
    Then the customer confirms the existence of information text about the product(Fabric information,Delivery time,Price information)
    And the customer clicks on the size chart unit and verifies that the chart opens
    Then the customer verifies high quality photos of the product taken from different angles
    And the customer clicks on washing instructions and additional information and verifies text
    And the customer selects the product size, checks the stock status, determines the product quantity and clicks the add to cart button
    Then the customer verifies the text product successfully added to cart
    And the customer hovers over the shopping cart and clicks the view shopping cart button
    Then the customer verifies that the update cart button has not been clicked without updating
    When the customer increases the amount of products in the shopping cart and clicks the update shopping cart button
    Then the customer verifies the product subtotal price
    When the customer clicks the empty cart button
    Then the customer confirms that the shopping cart is empty