Feature: User Authentication 19001

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

  Scenario: Not so successful Login
    Given the user is on the login page
    When the user enters correct email or password
    And the user clicks the login button
    Then the user should see an error message
