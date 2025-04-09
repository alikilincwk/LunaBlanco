@RegressionTest @SmokeTestStore
Feature: Store Functionality


  Scenario:Hover over to Store

    Given a customer navigates to LunaBlanco
    When the customer hovers over to store
    Then sub-categories should be seen
