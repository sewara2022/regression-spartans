@regression
Feature: Sign-up Registration
@smoke
  Scenario: Successful sign-up
    Given I have chosen to sign up
    When I sign up with valid details
    Then I should see a confirmation message

  Scenario: Duplicate email
    Given I have chosen to sign up
    When I sign up with an email address that has already registered
    Then I should be told that the email is already registered
