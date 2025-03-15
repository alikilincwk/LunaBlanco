Feature: Archieved Products

  Background:
    Given Navigate to LunaBlanco
    When Hover over to Store
    Then Sub-Categories should be seen

  Scenario: Checking Out-Of-Stock Products
    And Click on the Element in Header
      | archiv |
    Then Confirm that user is in the Archiv page
    And Click on the Element in Dialog
      | ausverkauftProduct |
    Then Product page should be seen
    Then Confirm that the product is marked as out-of-stock