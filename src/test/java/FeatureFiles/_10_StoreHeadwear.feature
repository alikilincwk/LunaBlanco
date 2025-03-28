Feature: Head Wears

  Background:
    Given Navigate to LunaBlanco
    When Hover over to Store
    Then Sub-Categories should be seen

  Scenario: Checking Head Wears
    When Click on the Element in Header
      | sHeaderHWIcon |
    Then the user should be redirected to the headwear page
    When the user hover over the product
    Then hovering over a product should change its picture
    When Click on the Element in Dialog
      | sSweaterFilter |
    And the user filters products by colour
    Then the displayed products should match the selected colour filter
    And the user filters products by size
    Then the displayed products should match the selected size filter
    And the user filters products by price range
    Then the displayed products should match the selected price range filter
    And the user selects a column layout
    And the user sorts products by category