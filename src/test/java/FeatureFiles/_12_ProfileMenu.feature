Feature: Profile Feature

  Background:
    Given Navigate to LunaBlanco
    When Hover over to Profile
    Then Submenu should be seen

  Scenario: Verify Log In/Log Out Options in Profile Submenu
    Then If the user is not logged in, the "Anmelden" option should be visible
    And Click elsewhere on the page
    Then Submenu should be closed

