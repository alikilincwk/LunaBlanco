@RegressionTest @SmokeTestProfile
Feature: Register

  Background:
    Given a customer navigates to LunaBlanco
    When the customer hovers over to store
    And the customer clicks on the element in header
      | headerLogin |

#  Due to existing bugs in both the login and registration systems,
#  the scenarios below focus on negative testing for authentication processes.

  Scenario: Register with an invalid parameter
    And the customer sends keys in dialog
      | pRegMail | invalidMail |
    And the customer clicks on the element in dialog
      | pRegPrvCheck |
      | pRegButton   |
    Then the customer confirms a validation message is visible on screen

  Scenario: Register without accepting the privacy policy
    And the customer sends keys in dialog
      | pRegMail | invalidMail@testing.com |
    And the customer clicks on the element in dialog
      | pRegButton |
    Then the customer confirms the text message
      | pRegAlert | Bitte akzeptiere unsere Datenschutzerklärung |

  Scenario: Register with no email
    And the customer clicks on the element in dialog
      | pRegPrvCheck |
      | pRegButton   |
    Then the customer confirms the text message
      | pRegAlert | Bitte gib eine gültige E-Mail-Adresse an |

  Scenario: Register with an already registered email
    And the customer sends keys in dialog
      | pRegMail | testtestlunablanco@gmail.com |
    And the customer clicks on the element in dialog
      | pRegPrvCheck |
      | pRegButton   |
    Then the customer confirms the text message
      | pRegAlert | Bitte melde dich an oder verwende eine andere E-Mail-Adresse. |