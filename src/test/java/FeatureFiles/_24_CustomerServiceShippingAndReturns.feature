@RegressionTest @SmokeTestCustomerService
Feature: About us Shipping and Returns page Functionality

  Background:
    Given a customer navigates to LunaBlanco

  Scenario: Shipping and Returns page
    When the customer clicks on the shipping and returns button
    Then the customer verifies that the shipping and returns page opens
    And the customer verifies that return period and shipping areas on the shipping and returns page