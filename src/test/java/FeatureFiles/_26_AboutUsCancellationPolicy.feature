@RegressionTest @SmokeTestAboutUs
Feature: About us Cancellation Policy

  Background:
    Given a customer navigates to LunaBlanco

  Scenario: Widerrufsbelehrung page

    When the customer clicks on the widerrufsbelehrung button
    Then the customer verifies that the widerrufsbelehrung page opens