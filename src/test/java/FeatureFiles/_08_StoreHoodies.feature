@RegressionTest @SmokeTestStore
Feature: Hoodies Functionality

  Background:
    Given a customer navigates to LunaBlanco
    When the customer hovers over to store

  Scenario: Checking Hoodies page
    When the customer clicks on the element in header
      | HOODIES |
    Then the customer confirms that they are in the hoodies page

    And the customer selects a column layout
    Then the customer verifies that hovering over a product changes its picture
    Then the customer clicks on the element in dialog
      | sSweaterFilter |

    And the customer filters products by colour
    Then the displayed products should match the selected colour filter
    And the customer filters products by size
    Then the displayed products should match the selected size filter
    And the customer filters the products by price
    And the customer sorts products by category