Feature: Login

  Background:
    Given Navigate to LunaBlanco
    And Hover over to Profile
    And Click on the Element in Header
      | headerLogin |

#  Due to existing bugs in both the login and registration systems,
#  the scenarios below focus on negative testing for authentication processes.

  Scenario: Login without email
    And User send keys in Dialog
      | pLogPw | invalidPassword |
    And Click on the Element in Dialog
      | pLogButton |
    And Confirm text message
      | pLogAlert | FEHLER |

  Scenario: Login without password
    And User send keys in Dialog
      | pLogUn | invalidtestmail@.testing.com |
    And Click on the Element in Dialog
      | pLogButton |
    And Confirm text message
      | pLogAlert | FEHLER |

  Scenario: Login without email and password
    And Click on the Element in Dialog
      | pLogButton |
    And Confirm text message
      | pLogAlert | FEHLER |

  Scenario: Login with invalid credentials
    And User send keys in Dialog
      | pLogUn | invalidtestmail@.testing.com |
      | pLogPw | invalidPassword              |
    And Click on the Element in Dialog
      | pLogButton |
    And Confirm text message
      | pLogAlert | FEHLER |