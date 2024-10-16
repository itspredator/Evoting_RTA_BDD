#Author: Snehal More (snehalm@nsdl.co.in)
Feature: RTA login page which include all positive and negative scenario

  Background: New User is on login page
    When Enter the URL "https://10.150.5.88/"
    And On home page user click on RTA Login button

  Scenario: Check for All required field present
    Given User should be on login page of RTA
    Then Check user id label present
    And Check user id text field present
    And Check password text field present
    And Check password label present
    And Check captcha label present
    And Check login button present

  Scenario: Check RTA able to login to system
    Given User should be on login page of RTA
    When Enter user id as "SHR1"
    And Enter verification code
    And Enter password as "nsdl@12345"
    And Click on Login button
    Then Check for welcome message for "SHR1"

  Scenario: Check forgot link present and on forgot page all elements present
    Given User should be on login page of RTA
    Then Check Forgot Password link
    When Click on Forgot Password link
    Then Check forgot password page title
    And Check User id txt field Present
    And Check Email Id field Present

  Scenario: Check Forgot Link combination on Forgot password page
    Given User should be on login page of RTA
    When Click on Forgot Password link
    And Enter user id as "RTAUSER2"
    And Click on submit button
    Then Pop appears as "Please Enter Email Address"
    When Click on reset button
    And Enter email id as "snehalm@nsdl.co.in"
    And Click on submit button
    Then Pop appears as "Please Enter User Id"
    When Click on reset button
    And Enter user id as "RTAUSER2"
    And Enter email id as "snehalm@nsdl.co.in"
    And Click on submit button
    Then Check successmessage for "snehalm@nsdl.co.in"

  Scenario Outline: Check all the combination for login
    Given User should be on login page of RTA
    When Enter user id as "<UserID>"
    And Enter password as "<Passsword>"
    And Enter verification code
    And Click on Login button
    Then Error message appeas as "<ErrorMsg>"

    Examples: 
      | UserID     | Password   | ErrorMsg                           |
      | TESTRTA123 | NSDL@12344 | You have entered wrong credentials |
      | TestRTA231 | nsdl@12345 | You have entered wrong credentials |

  Scenario: Check if wrong captcha enter
    Given User should be on login page of RTA
    When Enter user id as "TestRTA231"
    And Enter wrong verification code as "1234NSDL"
    And Enter password as "nsdl@12345"
    And Click on Login button
    Then Error message appeas as "Captcha mismatch !!"

  Scenario: Again reset details
    Given User unlock and password based changes for user id "TestRTA123"

  Scenario: Check if user enter only user id
    Given User should be on login page of RTA
    When Click on Login button
    Then Pop appears as "Please enter the Details"

  Scenario: Check if user enter password with legth less than 8 and also wihtout password
    Given User should be on login page of RTA
    When Enter user id as "TestRTA231"
    And Click on Login button
    Then Pop appears as "Please Enter Password"
    When Enter password as "nsdl"
    Then Pop appears as "Password should be minimum 8 character long"

  Scenario: Check if user not enter captcha
    Given User should be on login page of RTA
    When Enter user id as "TestRTA231"
    And Enter password as "nsdl"
    And Click on Login button
    Then Pop appears as "Please enter Security Code"
