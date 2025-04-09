@RegressionTest @SmokeTestMisc
Feature: Instagram Button Functionality

  Background:
    Given a customer navigates to LunaBlanco


  Scenario: Instagram Button Functionality
    When the customer clicks on the Instagram button
    Then the customer verifies Instagram page is opened