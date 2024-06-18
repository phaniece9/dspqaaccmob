Feature: Verify the landing screen for accura
  @smoke
  Scenario: When open the home screen and display accura vehicles
    Given I open the URL
    When I am on the landing screen
    Then verify the menu list present

    @Regression
    Scenario: Naigate to Vehicle search screen
      Given I open the URL
      When I am on the landing screen
      Then I change the location
      Then Verify Location is changed
      Then Navigate to Vehicle search page
