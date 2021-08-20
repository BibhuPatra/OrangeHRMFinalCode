@OrangeHrm 
Feature: OrangeHrm 
@Unsuccessful_login 
Scenario: Login with blank data 
	Given user is on login page 
	When  user do not enter username and password 
	And click on login button 
	Then  Alert username should not be empty 
	And close 
@Unsuccessful_login 
Scenario: Login with blank password 
	Given user is on login page 
	When  user entered username 
	And click on login button 
	Then  Alert password should not be  empty 
	And close 
@Unsuccessful_login 
Scenario: Login with blank username 
	Given user is on login page 
	When  user entered password 
	And click on login button 
	Then  Alert username  should not be  empty 
	And close 
@Unsuccessful_login 
Scenario: Login with invalid data 
	Given user is on login page 
	When  user  entered invalid  username and password 
	And click on login button 
	Then  Alert invalid credentials 
	And close 
@Successful_login 
Scenario: Login with valid  data 
	Given user is on login page 
	When  user entered valid username and password 
	Then  navigate user to welcome page 
	And close 
@UnSuccessful_search 
Scenario: Failure in searching employee with incorrect name 
	Given  user is on login page 
	When user enters valid username and password 
	And click on login button 
	Then user navigate to welcome page 
	Then user navigate to search page 
	When user enters wrong employee name 
	And click on search button 
	Then Display no records 
	And close 
@UnSuccessful_search 
Scenario: Failure in searching employee with incorrect id 
	Given  user is on login page 
	When user enters valid username and password 
	And click on login button 
	Then user navigate to welcome page 
	Then user navigate to search page 
	When user enters wrong employee id 
	And click on search button 
	Then Display no records 
	And close 
@UnSuccessful_search 
Scenario: Failure in searching employee with invalid data 
	Given  user is on login page 
	When user enters valid username and password 
	And click on login button 
	Then user navigate to welcome page 
	Then user navigate to search page 
	When user enters invalid employee details 
	And click on search button 
	Then Display no records 
	And close 
@Successful_search 
Scenario: Successful searching employee with valid data 
	Given  user is on login page 
	When user enters valid username and password 
	And click on login button 
	Then user navigate to welcome page 
	Then user navigate to search page 
	When user enters valid  employee details 
	And click on search button 
	Then Display all records 
	And close 
@Add_employee_firstname_validation 
Scenario: Failure in adding employee with missing first name 
	Given user is on login page 
	When user enters valid username and password 
	And click on login button 
	Then user navigate to welcome page 
	Then user navigate to  add page 
	When user enters data without first name 
	And click on save  button 
	Then Alert fill required fields 
	And close 
@Add_employee_lastname_validation 
Scenario: Failure in adding employee with missing last  name 
	Given user is on login page 
	When user enters valid username and password 
	And click on login button 
	Then user navigate to welcome page 
	Then user navigate to  add page 
	When user enters data without last  name 
	And click on save  button 
	Then Alert fill required fields 
	And close 
@existingid 
Scenario: Failure in adding employee with existing id 
	Given user is on login page 
	When user enters valid username and password 
	And click on login button 
	Then user navigate to welcome page 
	Then user navigate to  add page 
	When user enters data with existing employee id 
	And click on save  button 
	Then Alert cannot be saved...Already employee exists 
	And close 
@Succesful_addition_of_employee 
Scenario: successful addition of employee 
	Given user is on login page 
	When user enters valid username and password 
	And click on login button 
	Then user navigate to welcome page 
	Then user navigate to  add page 
	When user enters data with valid employee details 
	And click on save  button 
	Then navigate to profile page 
	And close 
@successful_deletion 
Scenario: Delete employee details 
	Given user is on login page 
	When user enters valid username and password 
	And click on login button 
	Then user navigates to welcome page 
	Then user navigates to delete page 
	Then user search for valid employee name 
	And click on search button 
	Then user clicks checkbox 
	And user click on delete button 
	And click on ok in dialog box 
	Then Display successfully deleted 
	And close 
	
	
	
	
