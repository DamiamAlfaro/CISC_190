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

// Start the class
public class Palindrome {
    
    // Purpose: return reversed string
    // Input/output: input string, return string backwards
    // Examples:
    // reverseString("Rock") return "kcoR"
    // reverseString("Paper") return "repaP"
    public static String reverseString(String normalString) {
        
        // Turn the string into an array
        char[] arrayString = normalString.toCharArray();
        
        // Empty string to add the new upcoming characters within the loop
        String reversedString = "";
        
        // Loop through the array string backwards and ...
        for (int index = arrayString.length - 1; index >= 0; index--) {
            
            // ...add to the empty string
            reversedString += arrayString[index];
        }
        
        // Return the reversed string
        return reversedString;
        
    }
    

    // Purpose: return boolean to check if a string is a palindrome
    // Input/output: input string, return boolean to indicate if palindrome or not
    // Examples:
    // isPalindrome("raCecar") return true
    // isPalindrome("Damiam") return false
    public static boolean isPalindrome(String inputString) {
        
        // Assign variable to store the original string
        String originalString = inputString;
        
        // Get the functionality of reverseString
        String reversedString = reverseString(inputString);
        
        // Check if the original string is equal to the reversed string regardless of the case, return true if it is...
        if (originalString.equalsIgnoreCase(reversedString)) {
            return true;
            
        // ... return false if not
        } else {
            return false;
        }
        
    }
    
}