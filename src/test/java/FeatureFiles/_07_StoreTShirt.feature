@RegressionTest @SmokeTestStore
Feature: Shop Feature/T-Shirts page Functionality

  Background:
    Given a customer navigates to LunaBlanco
    When the customer hovers over to store

  Scenario: T-Shirt product page
    When the customer clicks on the t-shirts button
    Then the customer verifies the product visibility on the t-shirts page