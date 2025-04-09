@RegressionTest @SmokeTestProfile
Feature: Profile Feature

  Background:
    Given a customer navigates to LunaBlanco
    When the customer hovers over to profile
    Then the customer should see the submenu

  Scenario: Verify Log In/Log Out Options in Profile Submenu
    And if the customer is not logged in, the "Anmelden" option should be visible
    When the customer clicks elsewhere on the page
    Then the submenu should be closed