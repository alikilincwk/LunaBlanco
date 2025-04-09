@RegressionTest @SmokeTestAboutUs
Feature: Philosophy page Functionality

  Background:
    Given a customer navigates to LunaBlanco

  Scenario: Philosophy page

    When the customer clicks on the philosophy button
    Then the customer redirected to the philosophy page