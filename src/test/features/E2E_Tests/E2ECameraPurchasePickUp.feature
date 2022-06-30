@regression @SPAR-55
Feature: Camera purchase in store
  Scenario: Successful camera purchase in store
    Given User is on Demo WebShop home page
    When User logs in
    When Customer adds a camera to the card
    And Customer proceeds to check out
    And Customer fills up Billing Address
    And Customer chooses pick up in store
    And Customer submits the order
    Then Customer can verify success message