@RegressionTest @SmokeTestAboutUs
Feature: About us AGB page Functionality

  Background:
    Given a customer navigates to LunaBlanco

  Scenario: AGB page

    When the customer clicks on the AGB button
    Then the customer verifies that the AGB page opens