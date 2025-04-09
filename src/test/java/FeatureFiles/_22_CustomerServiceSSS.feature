@RegressionTest @SmokeTestCustomerService
Feature: Customer Service SSS page Functionality

  Background:
    Given a customer navigates to LunaBlanco

  Scenario: Verify Customer Services page features
    When the customer clicks on the FAQs element
    Then the customer verifies the FAQs page appear
    And the customer clicks on the plus icon and sees the solution suggestions for the questions should appear