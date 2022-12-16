Feature: Sign In Feature

  @verifyLogIn
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'vahidb57@yahoo.com' and password 'Tek@1234'
    And User click on login button
    Then User should be logged in into Account

  @CreateAccount
  Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name    | email                       | password   | confirmPassword |
      | vahid | vahidb57@yahoo.com | Tek@1234 | Tek@1234      |
    And User click on SignUp button
    Then User should be logged into account page
