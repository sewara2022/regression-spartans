@regression @SPAR-01
Feature: Purchase a book

  Scenario: Successful book purchase
    Given User is on Demo WebShop home page
    When User logs in
    And Customer adds a book to the cart
    And Customer proceeds to check out
    And Customer fills up Billing Address
    And Customer chooses pick up in store
    And Customer submits the order
    Then Customer can verify success message





