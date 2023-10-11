#Auto generated Octane revision tag
@TID19001REV0.2.0
Feature: User Authentication

  Scenario: Successful Login
    Given the user is on the login page
    When the user enters correct email and password
    And the user clicks the login button
    Then the user should be redirected to the homepage

  Scenario: Unsuccessful Login
    Given the user is on the login page
    When the user enters incorrect email or password
    And the user clicks the login button
    Then the user should see an error message
