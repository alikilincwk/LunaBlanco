@RegressionTest @SmokeTestAboutUs
Feature: About Us Impressum Functionality

  Background:
    Given a customer navigates to LunaBlanco
    When the customer scrolls down to the bottom of the page


  Scenario: Impressum Functionality
    Then the customer clicks on the impressum
