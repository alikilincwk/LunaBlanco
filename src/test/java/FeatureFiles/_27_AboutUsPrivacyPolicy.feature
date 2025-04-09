@RegressionTest @SmokeTestAboutUs
Feature: About us Privacy Policy

  Background:
    Given a customer navigates to LunaBlanco

  Scenario: Datenschutzerklärung page

    When the customer clicks on the datenschutzerklärung button
    Then the customer verifies that the datenschutzerklärung page opens