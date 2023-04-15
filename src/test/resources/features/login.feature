@wip
Feature: User logins to BVG

  Background:
    Given user is on login page
    Given user hovers over language preference and selects Deutsch


  Scenario: user can login with valid credentials
    When user clicks on email input box and enter email "bvgtester1@gmail.com"
    And user clicks to password input box and enter password "juniorTester123."
    And user clicks on 'Sign In' button or hit enter key
    And user accepts cookies
    Then user verifies landing on account page


  Scenario: user cannot login with invalid credentials
    When user inserts the following invalid username "invalid"
    And user inserts the following invalid password "invalid"
    And user clicks on 'Sign In' button or hit enter key
    Then user verifies the following warning message "Ungültiger Benutzername oder Passwort."


   Scenario: user cannot login with no input
     When user clicks on 'Sign In' button or hit enter key
     Then user verifies the following warning message or any equivalent message "E-Mail und Passwort erforderlich"


  Scenario: user can see password as dots
    When user enters email "aliekremuyar55@gmail.com" and password "zxv10W300."
    Then password must be seen as dots


  Scenario: user can see password explicitly
    When user enters email "aliekremuyar55@gmail.com" and password "zxv10W300."
    And user clicks on the eye button
    Then user should see the password explicitly


  Scenario: user should be able to reset password if forgotten
    When user clicks on 'Passwort Vergessen?' link
    Then user is directed to the website to reset password