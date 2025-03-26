Feature: Hoodies Functionality

  Background:
    Given Navigate to LunaBlanco
    And Hover over to Store

  Scenario: Checking Hoodies page
    When Click on the Element in Header
      | HOODIES |
    Then Confirm that user is in the hoodies page

    And the user selects a column layout
    Then Verify that hovering over a product changes its picture
    Then Click on the Element in Dialog
      | sSweaterFilter |

    And the user filters products by colour
    Then the displayed products should match the selected colour filter
    And the user filters products by size
    Then the displayed products should match the selected size filter
    And Filter product by price
    And the user sorts products by category