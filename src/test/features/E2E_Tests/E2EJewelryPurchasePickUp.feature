@regression @SPAR-98
Feature: Purchase jewelry and pick up in store

  Scenario: Successful jewelry purchase in store
    Given User is on Demo WebShop home page
    When Customer logs in
    And Customer adds jewelry to the cart
    And Customer proceeds to check out
    And Customer fills up Billing Address
    And Customer chooses pick up in store
    And Customer submits the order
    Then Customer can verify success message