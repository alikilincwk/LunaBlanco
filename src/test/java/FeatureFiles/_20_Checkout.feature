Feature: Checkout Functionality

  Background:
    Given Navigate to LunaBlanco

  Scenario: Add items to cart and checkout page functions
    When The Customer clicks on any product
    Then The Customer confirms the existence of information text about the product(Fabric information,Delivery time,Price information)
    And The Customer clicks on the size chart unit and verifies that the chart opens
    Then The Customer verifies high quality photos of the product taken from different angles
    And The Customer clicks on washing instructions and additional information and verifies text
    And The Customer selects the product size, checks the stock status, determines the product quantity and clicks the add to cart button
    Then The Customer verifies the text product successfully added to cart
    And The Customer hovers over the shopping cart and clicks the checkout button
    When The Customer clicks on payment options and enters incorrect credit card details
    And The Customer enters personal information
    Then The Customer calculates and verifies the total price of the product
    And The Customer enters personal information
    Then The Customer verifies the error message on the message display