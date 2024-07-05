#Auto generated Octane revision tag
@BSPID5001REV0.0.1
Feature: User Authentication bddspec

@TSCID35001
  Scenario: Successful Login
    Given the user is on the login page
    When the user enters correct email and password
    And the user clicks the login button
    Then the user should be redirected to the homepage

@TSCID35002
  Scenario: Unsuccessful Login
    Given the user is on the login page
    When the user enters incorrect email or password
    And the user clicks the login button
    Then the user should see an error message

@TSCID35003
  Scenario: Not so successful Login
    Given the user is on the login page
    When the user enters correct email or password
    And the user clicks the login button
    Then the user should see an error message
