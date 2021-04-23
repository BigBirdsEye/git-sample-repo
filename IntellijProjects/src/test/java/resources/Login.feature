@Login
Feature: Login Test

#  Scenario: Successfully login as a user
#    Given I go to the home page
#    And I click the Sign in link
#    And I Enter an email address
#    And I enter a password
#    When I click the Sign in button
#    Then I verify that I am logged in
#    And I sign out successfully

  Scenario Outline: Successfully login as a user
    Given I go to the home page
    And I click the Sign in link
    And I Enter an email "<email>" address
    And I enter a password "<password>"
    When I click the Sign in button
    Then I verify that I am logged in
    And I sign out successfully

    Examples:
      | email                     | password |
      | davin.riches@gmail.com    | Today01  |
#      | greg.smith@gmail.com      | today01  |
#      | mary.cross@gmail.com      | Today01  |
#      | junior.otesanya@gmail.com | Today01  |

  @Login
  Scenario Outline: As a user I want to see an error message when I log in incorrectly
    Given I go to the home page
    And I click the Sign in link
    And I Enter an email "<email>" address
    And I enter a password "<password>"
    When I click the Sign in button
    Then I see an error "<errormessage>" message details

    Examples:
      | email                     | password | errormessage                  |
      | davin.riches009@gmail.com |          | Password is required.         |
      |                           | today01  | An email address is required. |
      | mary.cross0099@gmail.com  | xxxxxxx  | Authentication failed.        |
      | xxxxxxxxxxxxxxx@gmail.com | Today01  | Authentication failed.        |
      |                           |          | An email address is required. |