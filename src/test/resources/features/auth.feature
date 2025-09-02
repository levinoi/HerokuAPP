Feature: Login

  @positive
  Scenario: Login with correct data

    Given User launches chrome browser
    When User opens herokuapp login page
    And User enters correct data
    And User clicks on Login button
    Then User verifies SuccessMessage is displayed
    And User quites browser