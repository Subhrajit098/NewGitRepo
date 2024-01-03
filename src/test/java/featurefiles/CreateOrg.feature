#Author: subhrajit


Feature: login to vtiger appliication

 
  Scenario: Login to vtiger application with valid credentials and create 
    Given I want to launch the browser
    And I want to load the URL
    When login page is displayed provide the Username and Password
    And Click on login
    When Home page is displayed
    Then Click on create org feature
    And validate created id
    

 
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
