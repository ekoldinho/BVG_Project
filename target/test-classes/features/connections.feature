
Feature: User searches for connections throughout Berlin

  Background:
    Given user is on main page

    Scenario: User can list connections after inserting valid addresses in Berlin
      When User inserts the following start address "Holzmarkt Straße 15-17"
      And User inserts the following ziel address "Europaplatz 1"
      And User clicks on Verbindung Finden button
      Then User verifies the possible connections

  @wip
    Scenario: User can list connections without SBahn options after inserting valid addresses in Berlin
      When User inserts the following start address "Holzmarkt Straße 15-17"
      And User inserts the following ziel address "Europaplatz 1"
      And User opens Erweiterte list
      And User deselects SBahn
      And User closes Erweiterte list
      And User clicks on Verbindung Finden button
      Then User verifies the possible connections without SBahn lines
        | S1  |
        | S2  |
        | S25 |
        | S26 |
        | S3  |
        | S41 |
        | S42 |
        | S45 |
        | S46 |
        | S47 |
        | S5  |
        | S7  |
        | S75 |
        | S8  |
        | S85 |
        | S9  |