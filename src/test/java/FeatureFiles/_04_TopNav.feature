@RegressionTest @SmokeTestMisc
Feature: Top Navigation Menu

  Scenario: Top Navigation Function
    Given a customer on the LunaBlanco website

    Then the "Logo" should be visible
    When the customer clicks on the "Logo"
    Then the customer should be redirected to the "lunablanco.com" page

    Then the "Home" should be visible
    When the customer clicks on the "Home"
    Then the customer should be redirected to the "home" page

    Then the "Store" should be visible
    When the customer hovers over the "Store"
    Then the customer should see the store submenu

    When the customer clicks on the "Store"
    Then the customer should be redirected to the "store" page

    Then the "Philosophy" should be visible
    When the customer clicks on the "Philosophy"
    Then the customer should be redirected to the "philosophy" page

    Then the "Profile" should be visible
    When the customer hovers over the "Profile"
    Then the customer should see the profile submenu

    Then the "Shopping Cart" should be visible
    When the customer hovers over the "Shopping Cart"
    Then the customer should see the shopping cart submenu
