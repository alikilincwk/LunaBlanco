@RegressionTest @SmokeTestMisc
Feature: Nach Oben Feature

  Scenario: Nach Oben Functionality
    Given a customer on the LunaBlanco homepage for nach oben test

    When the customer scrolls to the bottom or click the down arrow
    Then the "Nach Oben" button should appear at bottom right

    When the customer clicks the "Nach Oben" button
    And the "Nach Oben" button should not be visible anymore