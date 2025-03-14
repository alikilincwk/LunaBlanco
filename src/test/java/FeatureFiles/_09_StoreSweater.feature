Feature: Sweaters

  Background:
    Given Navigate to LunaBlanco
    When Hover over to Store
    Then Sub-Categories should be seen

  Scenario: Checking Sweaters
    And Click on the Element in Header
      | sHeaderSweaterIcon |
    Then Confirm that user is in the correct page
    Then Confirm that hovering over a product changes its picture
    And Click on the Element in Dialog
      | sSweaterFilter |
    And Filter products by its colours
    And Filter products by its size
    And Filter products by its price range
    And Make a Column Selection
    And Sort by categories
