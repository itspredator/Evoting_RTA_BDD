#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: update here

	
  Background: New User is on login page
    When Enter the URL "https://10.150.5.88/"
    And On home page user click on RTA Login button
    
  Scenario: Check if mobile number is not enter or enter wrong under Update User Details option 
    Given User should be on login page of RTA
    When Enter user id as "SHR1"
    And Enter verification code
    And Enter password as "nsdl@12345"
    And Click on Login button
    And Click on user profile menu
    And Click on Update contact details sub menu  	
    And Clear Mobile text box	
		And Click on submit button
		Then Check the message as "Please enter valid Mobile Number"
		When User enter wrong mobile number as "12345"
		Then Pop up appears as "Mobile Number should be 10 digits only"