@Register
Feature: Register test

  Scenario Outline: Register an account as a new user
    Given I go to the home page
    And I click the Sign in link
    And I enter a new email address
    And I click the create an account button
    And I click the radio button
    And I enter my "<firstname>" & "<lastname>"
#    And I verify that the email address is prepopulated
    And I create a "<password>"
    And I enter my D.O.B
    And I enter my Address, City and Postal code
    And I select my State and Country
    And I enter my mobile number
    And I assign an address alias
    When I click the register button
    Then I verify that "<user>" has registered
    And I sign out

    Examples:
      | firstname | lastname | password |     user        |
      | Teanna    | Riches   | Today01  | Teanna Riches   |
      | Lily      | Smith    | today01  | Lily Smith      |
      | Mary      | Cross    | 5678900  | Mary Cross      |
      | Junior    | Otesanya | 32456u9  | Junior Otesanya |