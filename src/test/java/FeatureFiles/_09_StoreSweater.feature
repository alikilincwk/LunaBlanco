@RegressionTest @SmokeTestStore
Feature: Sweaters

  Background:
    Given a customer navigates to LunaBlanco
    When the customer hovers over to store
    Then sub-categories should be seen

  Scenario: Checking Sweaters
    When the customer clicks on the element in header
      | sHeaderSweaterIcon |
    Then the customer should be redirected to the sweater page
    When the customer hover over the product
    Then hovering over a product should change its picture
    When the customer clicks on the element in dialog
      | sSweaterFilter |
    And the customer filters products by colour
    Then the displayed products should match the selected colour filter
    And the customer filters products by size
    Then the displayed products should match the selected size filter
    And the customer filters products by price range
    Then the displayed products should match the selected price range filter
    And the customer selects a column layout
    And the customer sorts products by category
