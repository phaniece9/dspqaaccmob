Feature: Sign in to Accura
  @signing
  Scenario: Successful sign in
    Given I open the URL
    When the user enters valid credentials
    Then the user should be signed in successfully