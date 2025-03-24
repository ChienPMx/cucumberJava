Feature: User Registration

  Scenario: Create a free account on CTFLearner
    Given I am on the registration page
    When I fill in the registration form with valid data
    And I click the register button
    Then I should see a confirmation or be logged in