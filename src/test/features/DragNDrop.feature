Feature: Drag and Drop Test
  Scenario: Successfully drag and drop
    Given User is on Formy drag and drop page
    When User performs drag and drop
    Then User should see Dropped success message
