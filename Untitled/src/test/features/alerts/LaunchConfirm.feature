@SPAR-97
Feature: Dealing with Launch Confirm
  Scenario: launch Confirm
    Given User is on practice site
    When User clicks on launch confirm
    Then User accepts the confirm alert
    And User can verify alert was accepted