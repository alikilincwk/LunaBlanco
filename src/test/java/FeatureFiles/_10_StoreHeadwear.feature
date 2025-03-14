Feature: Head Wears

  Background:
    Given Navigate to LunaBlanco
    When Hover over to Store
    Then Sub-Categories should be seen

  Scenario: Checking Head Wears
    And Click on the Element in Header
      | sHeaderHWIcon |
    Then Confirm that user is in the head wear page
    Then Confirm that hovering over a product changes its picture
    And Click on the Element in Dialog
      | sSweaterFilter |
    And Filter products by its colours
    And Filter products by its size
    And Filter products by its price range
    And Make a column selection
    And Sort by categories