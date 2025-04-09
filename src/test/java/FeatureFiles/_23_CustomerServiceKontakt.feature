@RegressionTest @SmokeTestCustomerService
Feature: Customer Service us Kontakt page Functionality

  Background:
    Given a customer navigates to LunaBlanco

  Scenario: Kontakt page
    When the customer clicks on the kontakt button
    Then the customer verifies that the kontakt page opens
    And the customer verifies that telephone number and email address on the kontakt page