Feature: Nach Oben Feature

  As a customer,
  I want to return to the top of the page using the "Nach Oben" button,
  So that I can navigate long pages more efficiently without scrolling manually.

  Scenario: Verify Nach Oben button visibility and functionality
    Given I am on the LunaBlanco homepage for Nach Oben test

    When I scroll to the bottom or click the down arrow
    Then the "Nach Oben" button should appear at bottom right

    When I click the "Nach Oben" button
    And the "Nach Oben" button should not be visible anymore