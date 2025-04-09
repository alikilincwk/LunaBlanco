@RegressionTest @SmokeTestProfile
Feature: Login

  Background:
    Given a customer navigates to LunaBlanco
    When the customer hovers over to store
    And the customer clicks on the element in header
      | headerLogin |

#  Due to existing bugs in both the login and registration systems,
#  the scenarios below focus on negative testing for authentication processes.

  Scenario: Login without email
    And the customer sends keys in dialog
      | pLogPw | invalidPassword |
    And the customer clicks on the element in dialog
      | pLogButton |
    And the customer confirms the text message
      | pLogAlert | FEHLER |

  Scenario: Login without password
    And the customer sends keys in dialog
      | pLogUn | invalidtestmail@.testing.com |
    And the customer clicks on the element in dialog
      | pLogButton |
    And the customer confirms the text message
      | pLogAlert | FEHLER |

  Scenario: Login without email and password
    And the customer clicks on the element in dialog
      | pLogButton |
    And the customer confirms the text message
      | pLogAlert | FEHLER |

  Scenario: Login with invalid credentials
    And the customer sends keys in dialog
      | pLogUn | invalidtestmail@.testing.com |
      | pLogPw | invalidPassword              |
    And the customer clicks on the element in dialog
      | pLogButton |
    And the customer confirms the text message
      | pLogAlert | FEHLER |