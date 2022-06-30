@regression @SPAR-30
Feature: Purchase GiftCard

  Scenario: Successful GiftCard Purchase
    Given User is on Demo WebShop home page
    When User logs in
    And Customer adds a giftCard to the cart
    And Customer proceeds to check out
    And Customer fills up Billing Address
    And Customer chooses pick up in store
    And Customer submits the order
    Then Customer can verify success message




