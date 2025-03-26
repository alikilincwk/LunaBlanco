Feature: Wishlist
  Background:
    Given Navigate to LunaBlanco
    When Hover over to Store

  Scenario:
    And Click on the Element in Header
      | sHeaderSweaterIcon |
    And Hover over to first product
    And Click on the Element in Dialog
    |wLFirstProduct|
    Then Confirm text message
    |wLAlert|Produkt wurde erfolgreich zur Wunschliste hinzugefügt|
    And Check wishlist to confirm guest users cannot save products
    Then Confirm text message
    |wLNoProduct|Ihre Wunschliste ist leer.|