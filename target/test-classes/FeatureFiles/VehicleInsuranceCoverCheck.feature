@coverCheck
Feature: Vehicle insurance cover checking using registration number
  As a user
  I want to enter registration number
  So that I can be able to check vehicle cover information.

  Scenario:To verify I can see vehicle insurance cover information with valid registration number
    Given I am on the homepage
    When I enter valid vehicle registration number
    And I click on Find vehicle button
    Then I should be able to see vehicle insurance cover information

  Scenario: To verify I should see record not found message with invalid registration number
    Given I am on the homepage
    When I enter invalid vehicle registration number
    And I click on Find vehicle button
    Then I should be able to see message "Sorry record not found"

  Scenario: To verify I should see an error message with no registration number
    Given I am on the homepage
    When I do not enter vehicle registration number
    And I click on Find vehicle button
    Then I should be able to see an error message "Please enter a valid car registration"

