@regression @SPAR-54
Feature: Accessory
  Scenario: Accessory Purchase
    Given User is on Demo WebShop home page
    When User logs in
    And Customer adds accessory to the cart
    And Customer proceeds to check out
    And Customer fills up Billing Address
    And Customer chooses ship to home address
    And Customer submits the order
    Then Customer can verify success message


