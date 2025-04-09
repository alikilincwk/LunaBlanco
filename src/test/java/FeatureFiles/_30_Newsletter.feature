@RegressionTest @SmokeTestMisc
Feature: Newsletter Functionality

  Background:
    Given a customer navigates to LunaBlanco

  Scenario: Newsletter Functionality
    When the customer scrolls down to the bottom of the page
    Then the customer enters an email adress
    And the customer clicks on the button