@regression @SPAR-84
Feature: Purchase apparel and pick up in store
  Scenario: Successful purchase of apparel in store
    Given User is on Demo WebShop home page
    When User logs in
    And Customer adds apparel to the cart
    And Customer proceeds to check out
    And Customer fills up Billing Address
    And Customer chooses pick up in store
    And Customer submits the order
    Then Customer can verify success message

