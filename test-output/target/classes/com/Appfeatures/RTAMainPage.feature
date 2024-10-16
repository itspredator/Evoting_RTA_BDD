#Author: Snehal More (snehalm@nsdl.co.in)
Feature: RTA login page which include all positive and negative scenario

	
  Background: New User is on login page
    When Enter the URL "https://10.150.5.88/"
    And On home page user click on RTA Login button

  Scenario: Check all menu present on main home page after login in RTA
    Given User should be on login page of RTA
    When Enter user id as "SHR1"
    And Enter verification code
    And Enter password as "nsdl@12345"
    And Click on Login button
    Then Check eVoting menu present
    And Check user profile menu present
    And Check News and Results menu present

  Scenario: Check Update User Details under user profile menu
    Given User should be on login page of RTA
    When Enter user id as "SHR1"
    And Enter verification code
    And Enter password as "nsdl@12345"
    And Click on Login button
    And Click on user profile menu
    And Click on Update contact details sub menu
    And Update address line four as "MUMBAI"
    And Click on submit button
    Then  Check the success message as "Details updated successfully"
    And Check with back end line four address "MUMBAI" for user is "SHR1"
    And Check heading on page as "Update User Details"

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
		Then Pop up appears as "Please enter Mobile Number"
		When User enter wrong mobile number as "12345"
		Then Pop up appears as "Mobile Number should be 10 digits only"
		
Scenario: Check if email id is not enter or enter wrong under Update User Details option 
		Given User should be on login page of RTA
    When Enter user id as "SHR1"
    And Enter verification code
    And Enter password as "nsdl@12345"
    And Click on Login button
    And Click on user profile menu
    And Click on Update contact details sub menu  	
    And Clear email text box	
		And Click on submit button
		Then Pop up appears as "Please enter Mobile Number"
		When User enter wrong email id as "demo"
		Then Pop up appears as "Invalid Email Id"

Scenario: Check if details enter in correct format and click on submit under Update User Details option 
		Given User should be on login page of RTA
    When Enter user id as "SHR1" 
    And Enter password as "nsdl@12345"
    And Enter verification code
    And Click on Login button
    And Click on user profile menu    
    And Click on Update contact details sub menu  
    And Enter mobile number	as "9270424212"
    And Enter Email ID as "snehalm@nsdl.co.in"
    Then Check the success message as "Details updated successfully"
    And Check backend also with value as email id as "snehalm@nsdl.co.in" and mobile no "9270424212" for user id "SHR1"
    
Scenario: Check Change Password option under User Details
		Given User should be on login page of RTA
    When Enter user id as "RTAUSER2" 
    And Enter password as "nsdl@12345"
    And Enter verification code
    And Click on Login button
    And Click on user profile menu  
    Then Check for change password sub menu
    
Scenario: Check Heading of page for Change Password option
		Given User should be on login page of RTA
    When Enter user id as "RTAUSER2" 
    And Enter password as "nsdl@12345"
    And Enter verification code
    And Click on Login button
    And Click on user profile menu  
		And Click on change password sub menu
		Then Check heading on page as "Change Password"
	
Scenario: Check if change button click without entering value
		Given User should be on login page of RTA
    When Enter user id as "RTAUSER2" 
    And Enter password as "nsdl@12345"
    And Enter verification code
    And Click on Login button
    And Click on user profile menu  
		And Click on change password sub menu
		And Click on change button under change password page
		Then  Pop up appears as "Please Enter the Details"

Scenario: Check old password field validation
		Given User should be on login page of RTA
    When Enter user id as "RTAUSER2" 
    And Enter password as "nsdl@12345"
    And Enter verification code
    And Click on Login button
    And Click on user profile menu  
		And Click on change password sub menu
		And Enter value in new password as "abc"
		And Enter value in confirm password as "abc"
		And Click on change button under change password page
		Then  Pop up appears as "Please Enter Old Password"
		And Check old password text field present

		
Scenario: Check new password field validation
		Given User should be on login page of RTA
    When Enter user id as "RTAUSER2" 
    And Enter password as "nsdl@12345"
    And Enter verification code
    And Click on Login button
    And Click on user profile menu  
		And Click on change password sub menu
		And Enter value in old password as "abc"
		And Enter value in confirm password as "abc"
		And Click on change button under change password page
		Then  Pop up appears as "Please Enter New Password"
		And Check new password text field present
	
Scenario: Check confirm password field validation	
			Given User should be on login page of RTA
    When Enter user id as "RTAUSER2" 
    And Enter password as "nsdl@12345"
    And Enter verification code
    And Click on Login button
    And Click on user profile menu  
		And Click on change password sub menu
		And Enter value in old password as "abc"
		And Enter value in new password as "abc"
		And Click on change button under change password page
		Then  Pop up appears as "Please Enter Confirm New Password"
		And Check confirm password text field present
	
	
	
	
Scenario: Check if confirm and new password is not matched
			Given User should be on login page of RTA
    When Enter user id as "RTAUSER2" 
    And Enter password as "nsdl@12345"
    And Enter verification code
    And Click on Login button
    And Click on user profile menu  
		And Click on change password sub menu
		And Enter value in old password as "nsdl@12345"
		And Enter value in new password as "NSDL@1234"
		And Enter value in confirm password as "nsdl@123456"
		And Click on change button under change password page
		Then  Pop up appears as "New Password and Confirm New Password do not match"
	
	
	Scenario: Check if new password enter is not proper format
			Given User should be on login page of RTA
    When Enter user id as "RTAUSER2" 
    And Enter password as "nsdl@12345"
    And Enter verification code
    And Click on Login button
    And Click on user profile menu  
		And Click on change password sub menu
		And Enter value in old password as "nsdl@12345"
		And Enter value in new password as "nsdl@4"
		And Enter value in confirm password as "nsdl@4"
		And Click on change button under change password page
		Then  Pop up appears as "Password should contain minimum 1 lower case, upper case, special character and number each. Minimum password length allowed is 8 and maximum 15."


Scenario: Check if new password enter is having length less than 8 char
			Given User should be on login page of RTA
    When Enter user id as "RTAUSER2" 
    And Enter password as "nsdl@12345"
    And Enter verification code
    And Click on Login button
    And Click on user profile menu  
		And Click on change password sub menu
		And Enter value in old password as "nsdl@12345"
		And Enter value in new password as "nsdl@4"
		And Enter value in confirm password as "nsdl@4"
		And Click on change button under change password page
		Then  Pop up appears as "Password should be minimum 8 characters long"

Scenario: Check if new password enter is not proper format
			Given User should be on login page of RTA
    When Enter user id as "RTAUSER2" 
    And Enter password as "nsdl@12345"
    And Enter verification code
    And Click on Login button
    And Click on user profile menu  
		And Click on change password sub menu
		And Enter value in old password as "nsdl@12345"
		And Enter value in new password as "nsdl@12345"
		And Enter value in confirm password as "nsdl@12345"
		And Click on change button under change password page
		Then  Pop up appears as "Password should contain minimum 1 lower case, upper case, special character and number each. Minimum password length allowed is 8 and maximum 15."

Scenario: Check for new password after reset and login again
			Given User should be on login page of RTA
    When Enter user id as "RTAUSER2" 
    And Enter password as "nsdl@12345"
    And Enter verification code
    And Click on Login button
    And Click on user profile menu  
		And Click on change password sub menu
		And Enter value in old password as "nsdl@12345"
		And Enter value in new password as "Nsdl@12345"
		And Enter value in confirm password as "Nsdl@12345"
		And Click on change button under change password page
		Then Check the success message as "Dear User RTAUSER2 Your Password has been changed successfully"
		When Enter the URL "https://10.150.5.88/"
    And On home page user click on RTA Login button
		And Enter user id as "RTAUSER2" 
    And Enter password as "Nsdl@12345"
    And Enter verification code
    And Click on Login button
		Then Change password as back to normal for user id "RTAUSER2"
		
  Scenario: Check if News and Result button present			
	 Given User should be on login page of RTA
    When Enter user id as "SHR1"
    And Enter verification code
    And Enter password as "nsdl@12345"
    And Click on Login button
   	Then Check news and result button 
    
    	



