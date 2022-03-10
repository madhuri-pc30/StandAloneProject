Feature: feature to test login functionality
  
 @Smoke
  Scenario: Check login is successful
    Given user is on login page
    When user enters username and password
    And user clicks on login button
    Then user navigate to home page

 @Regression
  Scenario Outline: Check login is successful
    Given user is on login page
    When user enters <username> and <password>
    And user clicks on login button
    Then user navigate to home page

    Examples: 
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
