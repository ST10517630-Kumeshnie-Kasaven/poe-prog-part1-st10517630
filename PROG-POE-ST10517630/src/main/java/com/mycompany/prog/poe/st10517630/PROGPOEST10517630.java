package com.mycompany.prog.poe.st10517630;

import java.util.Scanner;
//imported scanner

public class PROGPOEST10517630 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Login loginSystem = new Login();

        System.out.println("--- CREATE ACCOUNT ---\n");
        
        System.out.print("Enter First Name: \n");
        String Name = a.nextLine();
        
        while (Name.isBlank()){
            //Loop so that user cannot leave the space blank.
            System.out.println("Please enter name: ");
            Name = a.nextLine();
        }
       
        System.out.print("Enter surname: \n");
        String Surname = a.nextLine();
        
        while (Surname.isBlank()){
            //Loop so that surname cannot be left blank.
            System.out.println("Please enter surname: ");
            Surname = a.nextLine();
        }
        
        String cellNumber;
        while (true){
        System.out.print("Enter Cell Phone Number (e.g., +27123456789): \n");
        cellNumber = a.nextLine();
        if (loginSystem.checkCellPhoneNumber(cellNumber)){
            System.out.println("Cell phone number successfully added");
            break;
        }else{    //returns a message if the expectations are not met.
            System.out.println("Cell phone number incorrectly formatted or does not contain international code");
        }
        }
        
        String username;
        while (true) {
            System.out.print("Enter Username (max 5 chars, must contain '_'):\n ");
            username = a.nextLine();
            if (loginSystem.checkUserName(username)) {
                System.out.println("Username successfully captured.");
                break;
            } else { //returns a message if the expectations are not met.
                System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
            }
        }

    
        String password;
        while (true) {
            System.out.print("Enter Password (min 8 chars, 1 capital, 1 number, 1 special char): \n");
            password = a.nextLine();
            if (loginSystem.checkPasswordComplexity(password)) {
                System.out.println("Password successfully captured.");
                break;
            } else {
                System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
            }
        }
        String registrationStatus = loginSystem.registerUser(username, password, Name, Surname, cellNumber);
        System.out.println("\n" + registrationStatus);

        System.out.println("\n--- LOGIN ---");
        System.out.print("Enter Username: \n");
        String Username = a.nextLine();
        
        System.out.print("Enter Password: \n");
        String Password =a.nextLine();
        
        while (!loginSystem.loginUser(Username, Password)){
                 System.out.println("Username or Password incorrect please try again");
                
             System.out.println("Enter your Username:\n ");
            Username = a.nextLine();
            
            System.out.println("Enter Password: \n");
            Password = a.nextLine();
            }
                
            System.out.println(loginSystem.returnLoginStatus(true));

        a.close();
    
        }
    }