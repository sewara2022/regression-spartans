@regression @SPAR-63
Feature: Purchase a cell phone and ship

  Scenario: Successful cell phone purchase
    Given User is on Demo WebShop home page
    When User logs in
    And Customer adds cell phone to the cart
    And Customer proceeds to check out
    And Customer fills up Billing Address
    And Customer chooses ship to home address
    And Customer submits the order
    Then Customer can verify success message