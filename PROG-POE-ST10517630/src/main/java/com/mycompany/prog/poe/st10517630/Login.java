package com.mycompany.prog.poe.st10517630;

public class Login {

    private String Username;
    private String Password;
    private String firstName;
    private String lastName;
   

    // Checks if username contains an underscore and is <= 5 characters
    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // Checks password for length, capital letter, number, and special character
    public boolean checkPasswordComplexity(String password) {
        if (password.length() < 8)return false;//insures that the password is not less than 8 characters 
        
        if (!password.matches(".*[A-Z].*"))return false;// Makes sure user adds a capital letter.
        
        if(!password.matches(".*[0-9].*"))return false;// password should contain a number.
        
        if(!password.matches(".*[^a-zA-Z0-9].*"))return false; // this states that the code contains atleast 1 character that isn't a letter or number
           
        return true;
    }
    
    public boolean checkCellPhoneNumber(String cellNumber) {
                
     return cellNumber.matches("^\\+27\\d{9}$");
    }

    // Registers the user and returns appropriate status messaging
    public String registerUser(String username, String password, String firstName, String lastName, String cellNumber) {
        
           
        if (!checkCellPhoneNumber(cellNumber)) {
            return "Cell phone number incorrectly formatted or does not contain international code.";
        } 
        
        if (!checkUserName(username)) {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }
        
        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
     

        this.Username = username;
        this.Password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        
        return "User successfully registered.";
    }

    public boolean loginUser(String username, String password) {
        return username.equals(this.Username) && password.equals(this.Password);
    }

    public String returnLoginStatus(boolean isLoggedIn) {
        if (isLoggedIn) {
            return "Welcome " + firstName + ", " + lastName + " it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}