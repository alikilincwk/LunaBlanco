#When the customer clicks on the "MEIN KONTO" option,
# they should be redirected to the account information page.
#On the account page, the customer should be able to view
# and click and write details such as first name, last name, email, and password.

Feature: Profile Feature

  Background:
    Given Navigate to LunaBlanco
    When Hover over to Profile
    Then Submenu should be seen

  Scenario: Verify the User Information Page
    When Click on the Element in Header
    |Mein Konto|
    And User Profile page should be seen
    Then Field names should be displayed
    Then Fields should be clickable and writable