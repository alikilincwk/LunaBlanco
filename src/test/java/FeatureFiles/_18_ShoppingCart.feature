Feature: ShoppingCart

  Background:
    Given Navigate to LunaBlanco

  Scenario: ShoppingCart Functionality
    When The Customer clicks on any product
    Then The Customer confirms the existence of information text about the product(Fabric information,Delivery time,Price information)
    And The Customer clicks on the size chart unit and verifies that the chart opens
    Then The Customer verifies high quality photos of the product taken from different angles
    And The Customer clicks on washing instructions and additional information and verifies text
    And The Customer selects the product size, checks the stock status, determines the product quantity and clicks the add to cart button
    Then The Customer verifies the text product successfully added to cart
    And The Customer hovers over the shopping cart and clicks the view shopping cart button
    Then The Customer verifies that the update cart button has not been clicked without updating
    When The Customer increases the amount of products in the shopping cart and clicks the update shopping cart button
    Then The Customer verifies the product subtotal price
    When The Customer clicks the empty cart button
    Then The Customer confirms that the shopping cart is empty