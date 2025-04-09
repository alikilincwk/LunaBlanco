@RegressionTest @SmokeTestStore
Feature: Archieved Products

  Background:
    Given a customer navigates to LunaBlanco
    When the customer hovers over to store
    Then sub-categories should be seen

  Scenario: Checking Out-Of-Stock Products
    And the customer clicks on the element in header
      | archiv |
    Then the customer confirms that they are in the archiv page
    And the customer clicks on the element in dialog
      | ausverkauftProduct |
    Then the product page should be seen
    Then the customer confirms that the product is marked as out-of-stock