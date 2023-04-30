Feature: User avoids mistakes while registering to BVG

  Background:
    Given user is on login page
    Given user hovers over language preference and selects Deutsch


  Scenario: User fails to register without inserting 'Vorname'
    When user clicks on Registirieren button
    And user verifies landing on Registrierung page
    And user inserts Nachname "Uyar"
    And user inserts unregistered E-Mail "bvgtester2@gmail.com"
    And user inserts Passwort "juniorTester123."
    And user inserts the same password to Passwort Bestätigen "juniorTester123."
    And user clicks on Jetzt Registrieren button
    Then user is warned to insert Vorname "Bitte gib eine Vorname ein."

  Scenario: User fails to register without inserting 'Nachname'
    When user clicks on Registirieren button
    And user verifies landing on Registrierung page
    And user inserts Vorname "Ali Ekrem"
    And user inserts unregistered E-Mail "bvgtester2@gmail.com"
    And user inserts Passwort "juniorTester123."
    And user inserts the same password to Passwort Bestätigen "juniorTester123."
    And user clicks on Jetzt Registrieren button
    Then user is warned to insert Nachname "Bitte gib eine Nachname ein."

  Scenario: User fails to register without inserting 'E-Mail'
    When user clicks on Registirieren button
    And user verifies landing on Registrierung page
    And user inserts Vorname "Ali Ekrem"
    And user inserts Nachname "Uyar"
    And user inserts Passwort "juniorTester123."
    And user inserts the same password to Passwort Bestätigen "juniorTester123."
    And user clicks on Jetzt Registrieren button
    Then user is warned to insert E-Mail through following message "Bitte gib eine E-Mail-Adresse ein."

  Scenario: User fails to register without inserting 'Passwort'
    When user clicks on Registirieren button
    And user verifies landing on Registrierung page
    And user inserts Vorname "Ali Ekrem"
    And user inserts Nachname "Uyar"
    And user inserts unregistered E-Mail "bvgtester2@gmail.com"
    And user clicks on Jetzt Registrieren button
    Then user is warned to insert Passwort through following message "Bitte gib ein Passwort ein."

  Scenario: User fails to register by not confirming 'Passwort'
    When user clicks on Registirieren button
    And user verifies landing on Registrierung page
    And user inserts Vorname "Ali Ekrem"
    And user inserts Nachname "Uyar"
    And user inserts unregistered E-Mail "bvgtester2@gmail.com"
    And user inserts Passwort "juniorTester123."
    And user clicks on Jetzt Registrieren button
    Then user is warned to confirm password through following message "Die Passwortbestätigung ist nicht identisch."

  Scenario: User fails to register by inserting non-identical 'Passwort'
    When user clicks on Registirieren button
    And user verifies landing on Registrierung page
    And user inserts Vorname "Ali Ekrem"
    And user inserts Nachname "Uyar"
    And user inserts unregistered E-Mail "bvgtester2@gmail.com"
    And user inserts Passwort "juniorTester123."
    And user inserts non-identical password to Passwort Bestätigen "juniorTester123"
    And user clicks on Jetzt Registrieren button
    Then user is warned to insert an identical password through following message "Die Passwortbestätigung ist nicht identisch."

  Scenario: User fails to register by inserting existing 'E-Mail'
    When user clicks on Registirieren button
    And user verifies landing on Registrierung page
    And user inserts Vorname "Ali Ekrem"
    And user inserts Nachname "Uyar"
    And user inserts registered E-Mail "aliekremuyar55@gmail.com"
    And user inserts Passwort "juniorTester123."
    And user inserts the same password to Passwort Bestätigen "juniorTester123."
    And user clicks on Jetzt Registrieren button
    Then user is warned to insert unregistered E-Mail through following message "E-Mail existiert bereits."

  Scenario: User fails to register by inserting invalid 'Passwort'
    When user clicks on Registirieren button
    And user verifies landing on Registrierung page
    And user inserts Vorname "Ali Ekrem"
    And user inserts Nachname "Uyar"
    And user inserts unregistered E-Mail "bvgtester2@gmail.com"
    And user inserts invalidPasswortOne "tester"
    And user inserts the same password to Passwort Bestätigen "tester"
    And user clicks on Jetzt Registrieren button
    Then user is warned to insert valid password with at least one special character through following message "Ungültiges Passwort: Es muss mindestens 1 Sonderzeichen beinhalten."

  Scenario: User fails to register by inserting invalid 'Passwort'
    When user clicks on Registirieren button
    And user verifies landing on Registrierung page
    And user inserts Vorname "Ali Ekrem"
    And user inserts Nachname "Uyar"
    And user inserts unregistered E-Mail "bvgtester2@gmail.com"
    And user inserts invalidPasswortTwo "tester."
    And user inserts the same password to Passwort Bestätigen "tester."
    And user clicks on Jetzt Registrieren button
    Then user is warned to insert valid password with at least one upper-case letter through following message "Ungültiges Passwort: Es muss mindestens 1 Großbuchstaben beinhalten."

  Scenario: User fails to register by inserting invalid 'Passwort'
    When user clicks on Registirieren button
    And user verifies landing on Registrierung page
    And user inserts Vorname "Ali Ekrem"
    And user inserts Nachname "Uyar"
    And user inserts unregistered E-Mail "bvgtester2@gmail.com"
    And user inserts invalidPasswortThree "Tester."
    And user inserts the same password to Passwort Bestätigen "Tester."
    And user clicks on Jetzt Registrieren button
    Then user is warned to insert valid password with at least eight characters through following message "Ungültiges Passwort: Es muss mindestens 8 Zeichen lang sein."

  Scenario: User fails to register by inserting invalid 'Passwort'
    When user clicks on Registirieren button
    And user verifies landing on Registrierung page
    And user inserts Vorname "Ali Ekrem"
    And user inserts Nachname "Uyar"
    And user inserts unregistered E-Mail "bvgtester2@gmail.com"
    And user inserts invalidPasswortFour "juniorTester."
    And user inserts the same password to Passwort Bestätigen "juniorTester."
    And user clicks on Jetzt Registrieren button
    Then user is warned to insert valid password with at least one digit through following message "Ungültiges Passwort: Es muss mindestens 1 Ziffer(n) beinhalten."

  Scenario: User fails to register by inserting invalid 'Passwort'
    When user clicks on Registirieren button
    And user verifies landing on Registrierung page
    And user inserts Vorname "Ali Ekrem"
    And user inserts Nachname "Uyar"
    And user inserts unregistered E-Mail "bvgtester2@gmail.com"
    And user inserts invalidPasswortFive "JUNIORTESTER123."
    And user inserts the same password to Passwort Bestätigen "JUNIORTESTER123."
    And user clicks on Jetzt Registrieren button
    Then user is warned to insert valid password with at least one lower-case letter through following message "Ungültiges Passwort: Es muss mindestens 1 Kleinbuchstaben beinhalten."

  Scenario: User fails to register by inserting existing 'E-Mail', invalid and non-identical 'Passwort'
    When user clicks on Registirieren button
    And user verifies landing on Registrierung page
    And user inserts Vorname "Ali Ekrem"
    And user inserts Nachname "Uyar"
    And user inserts registered E-Mail "aliekremuyar55@gmail.com"
    And user inserts invalidPasswortSix "tester"
    And user inserts the same password to Passwort Bestätigen "juniorTester123."
    And user clicks on Jetzt Registrieren button
    Then user is warned to insert unregistered E-Mail, valid password and confirm the password through following messages "E-Mail existiert bereits." "Ungültiges Passwort: Es muss mindestens 1 Sonderzeichen beinhalten." "Die Passwortbestätigung ist nicht identisch."