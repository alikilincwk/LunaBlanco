@RegressionTest @SmokeTestMisc
Feature: Homepage Logo Navigation

  Scenario: Homepage Logo
    Given a customer on the LunaBlanco website
    When the customer clicks on the company logo
    Then the customer should be redirected to the homepage
