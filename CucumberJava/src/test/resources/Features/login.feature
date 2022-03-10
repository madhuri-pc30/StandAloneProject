Feature: feature to test login functionality

  
  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username>and<password>
    And user clicks on login button
    Then user navigate to home page

    Examples: 
      | username | password |
      | user1    |    12345 |
      | user2    |    12345 |
