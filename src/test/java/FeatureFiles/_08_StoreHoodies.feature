Feature: Hoodies Functionality

  Background:
    Given Navigate to LunaBlanco
    And Hover over to Store

  Scenario: Checking Hoodies page
    When Click on the Element in Header
      | HOODIES |
    Then Confirm that user is in the hoodies page

    And Make a column selection
    Then Verify that hovering over a product changes its picture
    Then Click on the Element in Dialog
      | sSweaterFilter |

    And Filter products by its colours
    And Filter products by its size
    And Filter product by price
    And Sort by categories