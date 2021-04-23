@ContactUs
Feature: Contact Us Test

  Scenario: Successfully use the contact us function
    Given I go to the home page
    And I click the contact us button
    And I click the Subject Heading
    And I enter my email address
    And I enter my order reference
    And I enter a message
    And I attach a file
    When I click the send button
    Then I verify that Contact us was successful