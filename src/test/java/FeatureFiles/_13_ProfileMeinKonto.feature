#When the customer clicks on the "MEIN KONTO" option,
# they should be redirected to the account information page.
#On the account page, the customer should be able to view
# and click and write details such as first name, last name, email, and password.

@RegressionTest @SmokeTestProfile
Feature: Profile Feature

  Background:
    Given a customer navigates to LunaBlanco
    When the customer hovers over to profile
    Then the customer should see the submenu

  Scenario: Verify the User Information Page
    When the customer clicks on the element in header
      | meinKonto |
    Then user profile page should be seen
    Then field names should be displayed
    Then fields should be clickable and writable