/** 
 * Lead Author(s): 
 * Damiam Alfaro; dalfaro@student.sdccd.edu 
 * <<Add additional lead authors here>> 
 * 
 * Other Contributors: 
 * Full name; student ID or contact information if not in class 
 * <<Add additional contributors (mentors, tutors, friends) here, with contact information>> 
 * 
 * References: 
 * Gaddis, T. (2023). Starting out with Java: From control structures through objects. Pearson. 
 * <<Add more references here>> 
 * 
 * Version: October 12, 2025
 */ 

// Import the String package
import java.lang.String;

// Import the Scanner package to allow user input
import java.util.Scanner;

public class StrongPasswordValidator {
    
    public static void main(String[] args) {
        
        // Allow user's input
        Scanner usersPasswordInput = new Scanner(System.in);
        
        // Assign variable to the user's input password
        String password = usersPasswordInput.nextLine();
        
        // Assign a boolean variable to every single method 
        boolean fiveCharactersLongValidation = validateFiveCharactersLong(password);
        boolean upperCasePresenceValidation = containsACapitalLetter(password);
        boolean twoDigitPresenceValidation = validateTwoDigitPresence(password);
        
        // Assign a variable to a boolean array to check which is not met (if applicable)
        boolean[] criteriaValidations = {fiveCharactersLongValidation, upperCasePresenceValidation, twoDigitPresenceValidation};
        
        // Assign a varible to a string array to display a message of criteria not met accordingly
        String[] criterialNotMetMessages = {"Password less than five characters", "Password missing uppercase", "Password missing two or more digits"};
        
        // Check if all methods are true
        if (fiveCharactersLongValidation && upperCasePresenceValidation && twoDigitPresenceValidation) {
            
            // Let the user know if the password is valid by...
            System.out.println("Password is valid");
        } else {
            
            // Looping through the validation boolean array and checking if any of them is a false statement
            for (int index = 0; index < criteriaValidations.length; index++) {
                
                //  If one of them is a false statment...
                if (criteriaValidations[index] == false) {
                    
                    // ...display the respective message using its respective index
                    System.out.println(criterialNotMetMessages[index]);
                }
                
            }
            
            
        }
        
    }
    
    // Purpose: return boolean to check if a string is at least five characters long
    // Input/output: input string, return boolean confirming if string is at least five characters long
    // Examples:
    // validateFiveCharactersLong("rock") return false
    // validateFiveCharactersLong("damiam") return true
    public static boolean validateFiveCharactersLong(String password) {
        
        // Turn the string into an array
        char[] arrayString = password.toCharArray();
        
        // Check if the string is at least five characters long and return accordingly
        if (arrayString.length >= 5) {
            
            // Return true (first check passed)
            return true;
        } else {
            
            // Return false (not a valid password)
            return false;
        }
        
    }
     
    
    // Purpose: return boolean to check if a string contains an uppercase character
    // Input/output: input string, return boolean confirming if string contains uppercase
    // Examples:
    // containsACapitalLetter("rock") return false
    // containsACapitalLetter("Rock") return true
    public static boolean containsACapitalLetter(String password) {
        
        // Turn the string into an array
        char[] arrayString = password.toCharArray();
        
        // Assign a boolean variable to validate the upper case presence
        boolean upperCasePresence = false;
        
        // Loop through the string to see if there is an upper case character
        for (int index = 0; index < arrayString.length; index++) {
            
            // If one of the character is an upper case...
            if (Character.isUpperCase(arrayString[index]) == true) {
                
                // ...make the upperCasePresence true
                upperCasePresence = true;
            }
        }
        
        // Return the boolean
        return upperCasePresence;
    }
    
    
    // Purpose: return boolean to check if a string contains at leas two digits
    // Input/output: input string, return boolean confirming if string contains at least two digits
    // Examples:
    // validateTwoDigitPresence("rock") return false
    // validateTwoDigitPresence("damiam66") return true
    public static boolean validateTwoDigitPresence(String password) {
        
        // Turn the string into an array
        char[] arrayString = password.toCharArray();
        
        // Assign a variable to count the total digits present in the string array
        int totalDigitsInString = 0;        
        
        // Loop through the string to see if there are at least two digits in it
        for (int index = 0; index < arrayString.length; index++) {
            
            // If one of the characters is a digit
            if (Character.isDigit(arrayString[index]) == true) {
                
                // Increase the count of digits in the string
                totalDigitsInString += 1;
            }
        }
        
        // Check to see if the count of digits in the string is at least two
        if (totalDigitsInString >= 2) {
            
            // Return true if there are two or more digits
            return true;
        } else {
            
            // Return false is there is less than 2 digits in the string
            return false;
        }
    }
    
}