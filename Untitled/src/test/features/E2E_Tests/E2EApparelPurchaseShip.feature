@regression @SPAR-84
Feature: Purchase apparel and ship to home
  Scenario: Successful purchase of apparel and ship to home
    Given User is on Demo WebShop home page
    When User logs in
    And Customer adds apparel to the cart
    And Customer proceeds to check out
    And Customer fills up Billing Address
    And Customer chooses ship to home address
    And Customer submits the order
    Then Customer can verify success message