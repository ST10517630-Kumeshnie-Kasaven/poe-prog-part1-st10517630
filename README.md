# PROG5121 POE – Part 1  
## Registration & Login System (Java Console Application)
Student Name: Kumeshnie Kasaven

Student Number: ST10517630
---

## Overview
This project is a **console-based Java application** developed for my PROG5121 POE.

The purpose of this application is to allow users to:
- Register an account  
- Validate user input  
- Login using stored credentials  
- Receive appropriate system feedback messages  

This project demonstrates the use of:
- Classes and methods (OOP)
- Decision structures
- Input validation
- Unit testing using JUnit  


## Features

### User Registration
The system prompts the user to enter:
- First Name  
- Last Name  
- Username  
- Password  
- Cell Phone Number  

The system validates all inputs before successful registration.


### Validation Rules

#### Username Requirements:
- Must contain an underscore `_`
- Must not exceed 5 characters  


#### Password Requirements:
- Minimum of 8 characters  
- At least one uppercase letter  
- At least one number  
- At least one special character  


#### Cell Phone Number Requirements:
- Must include South African international code `+27`
- Must be followed by 9 digits  



### Login System
- Users log in using their registered username and password  
- The system verifies credentials  

**Outputs:**
- Welcome <user first 
name>, <user last 
name> it is great to 
see you again


- if the details are incorrect the stsyem outputs "Username or password incorrect, please try again" and then system continues prompting the user until the correct credentials are entered



## Key Methods Explained

### checkUserName()
- Verifies that the username contains an underscore
- Ensures the username does not exceed 5 characters



### checkPasswordComplexity()
- Validates password strength using pattern matching
- Ensures all required conditions are met



### checkCellPhoneNumber()
- Uses a regular expression to validate South African phone numbers
- Ensures correct format including international code



### registerUser()
- Calls all validation methods
- Returns appropriate messages for invalid input
- Stores user details when all conditions are satisfied


### loginUser()
- Compares entered username and password with stored values
- Returns `true` if credentials match, otherwise `false`


### returnLoginStatus()
- Returns a message based on login success or failure
- Displays a personalized welcome message on successful login


## Unit Testing (JUnit)

Unit tests are included to verify that the system behaves correctly.

### Tests Implemented:
- Username validation (valid and invalid cases)
- Password complexity validation
- Cell phone number validation

### Test Results:
- All tests executed successfully  
- No failures or errors reported  

This confirms that the validation methods are functioning as expected.

## Project Structure
<img width="552" height="366" alt="image" src="https://github.com/user-attachments/assets/c13f0d8e-8dbc-457f-b9fa-04db9f952ec4" />




## Technologies Used
- Java
- Maven
- JUnit 5

## Concepts Demonstrated
- Object-Oriented Programming (OOP)
- Classes and methods
- Input validation
- Conditional statements (if/else)
- Looping (while loops)
- Unit testing

  ## YouTube video
  https://youtu.be/AIHgNqkP_lc


