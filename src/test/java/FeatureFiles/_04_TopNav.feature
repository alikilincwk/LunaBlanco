Feature: Top Navigation Menu

  As a user,
  I want to interact with the top navigation menu items,
  So that I can navigate through the main sections of the website easily.

  Scenario: Verify top navigation menu items are visible and functional
    Given I am on the LunaBlanco homepage

    Then the "Logo" should be visible
    When I click on the "Logo"
    Then I should be redirected to the "lunablanco.com" page

    Then the "Home" should be visible
    When I click on the "Home"
    Then I should be redirected to the "home" page

    Then the "Store" should be visible
    When I hover over the "Store"
    Then I should see the store submenu

    When I click on the "Store"
    Then I should be redirected to the "store" page

    Then the "Philosophy" should be visible
    When I click on the "Philosophy"
    Then I should be redirected to the "philosophy" page

    Then the "Profile" should be visible
    When I hover over the "Profile"
    Then I should see the profile submenu

    Then the "Shopping Cart" should be visible
    When I hover over the "Shopping Cart"
    Then I should see the shopping cart submenu
