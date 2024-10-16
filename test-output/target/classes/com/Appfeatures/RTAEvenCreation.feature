#Author: Snehal More
Feature: This feature file will test all the possible feature under even creation

  Background: New User is on login page
    When Enter the URL "https://10.150.5.88/"
    And On home page user click on RTA Login button

  Scenario: If sharfeholder click on submit button without entering value under register evoting details 
    Given User should be on login page of RTA
    When Enter user id as "SHR1"
    And Enter verification code
    And Enter password as "nsdl@12345"
    And Click on Login button
    And Click on eVoting menu
    And Click on Register Evoting Details option
    And Click on submit button
    Then Pop appears as "ISIN field is mandatory."
    
Scenario: To check all the elements under Register Evoting Details Page present  
    Given User should be on login page of RTA
    When Enter user id as "SHR1"
    And Enter verification code
    And Enter password as "nsdl@12345"
    And Click on Login button
    And Click on eVoting menu
    And Click on Register Evoting Details option	
    Then Check all web elements present on Register Evoting Details