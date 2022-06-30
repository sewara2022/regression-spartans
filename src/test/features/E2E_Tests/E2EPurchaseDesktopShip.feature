@regression @SPAR-15
Feature: Purchase a book

  Scenario: Successful desktop purchase
    Given User is on Demo WebShop home page
    When User logs in
    And Customer adds a desktop to the cart
    And Customer proceeds to check out
    And Customer fills up Billing Address
    And Customer chooses ship to home address
    And Customer submits the order
    Then Customer can verify success message