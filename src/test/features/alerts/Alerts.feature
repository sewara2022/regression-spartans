Feature: Working with alerts
  Scenario: Formy alert
    Given User goes to Formy alert page
    When User clicks on open alert
    And User agrees to the alert
    Then User should no see any alerts
