Feature: Register

  Background:
    Given Navigate to LunaBlanco
    And Hover over to Profile
    And Click on the Element in Header
      | headerLogin |

#  Due to existing bugs in both the login and registration systems,
#  the scenarios below focus on negative testing for authentication processes.

  Scenario: Register with an invalid parameter
    And User send keys in Dialog
      | pRegMail | invalidMail |
    And Click on the Element in Dialog
      | pRegPrvCheck |
      | pRegButton   |
    Then Confirm a validation message is visible on screen

  Scenario: Register without accepting the privacy policy
    And User send keys in Dialog
      | pRegMail | invalidMail@testing.com |
    And Click on the Element in Dialog
      | pRegButton |
    Then Confirm text message
      | pRegAlert | Bitte akzeptiere unsere Datenschutzerklärung |

  Scenario: Register with no email
    And Click on the Element in Dialog
      | pRegPrvCheck |
      | pRegButton   |
    Then Confirm text message
      | pRegAlert | Bitte gib eine gültige E-Mail-Adresse an |

  Scenario: Register with an already registered email
    And User send keys in Dialog
      | pRegMail | testtestlunablanco@gmail.com |
    And Click on the Element in Dialog
      | pRegPrvCheck |
      | pRegButton   |
    Then Confirm text message
      | pRegAlert | Bitte melde dich an oder verwende eine andere E-Mail-Adresse. |