@RegressionTest @SmokeTestShopping
Feature: Wishlist
  Background:
    Given a customer navigates to LunaBlanco
    When the customer hovers over to store

  Scenario:
    And the customer clicks on the element in header
      | sHeaderSweaterIcon |
    And the customer hovers over to first product
    And the customer clicks on the element in dialog
    |wLFirstProduct|
    Then the customer confirms the text message
    |wLAlert|Produkt wurde erfolgreich zur Wunschliste hinzugefügt|
    And the customer checks wishlist to confirm guest users cannot save products
    Then the customer confirms the text message
    |wLNoProduct|Ihre Wunschliste ist leer.|