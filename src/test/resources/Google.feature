# This is a Feature
Feature: Login feature
  # This is a Positive Scenario
  Scenario: Login with valid credentials
    # These are the steps
    Given I navigate to "http://www.gmail.com" page
    When I enter userId and Password
    And I click on next button
    Then I should see the error massage