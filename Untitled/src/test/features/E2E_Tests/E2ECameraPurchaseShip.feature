@regression @SPAR-55
Feature: Camera
  Scenario: Successful camera purchase
    Given User is on Demo WebShop home page
    When User logs in
    When Customer adds a camera to the card
    And Customer proceeds to check out
    And Customer fills up Billing Address
    And Customer chooses ship to home address
    And Customer submits the order
    Then Customer can verify success message


