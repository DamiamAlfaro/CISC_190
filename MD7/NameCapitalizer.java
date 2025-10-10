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

public class NameCapitalizer {
    
    // Purpose: return string with first character capitalized in each word
    // Input/output: input string, return string with first character capitalized
    // Examples:
    // capitalizeFirstWord("rock") return "Rock"
    // capitalizeFirstWord("paper and scissors") return "Paper And Scissors"
    public static String capitalizeFirstWord(String badString) {
        
        // Turn the string into an array
        char[] arrayString = badString.toCharArray();
    
        // Assign number of count the total white spaces
        int totalWhiteSpaces = 0;
        
        // Assign variable to new string with capitalized form
        String newString = "";
        
        // Always capitalize the first letter
        arrayString[0] = Character.toUpperCase(arrayString[0]);
        
        // Add letter to the new string
        newString += arrayString[0];
        
        // Loop through the string array to see the number of the white spaces
        for (int index = 1; index < arrayString.length; index++) {
                
            // If the character before the current letter is a white space " ", capitalize the letter 
            if (Character.isWhitespace(arrayString[index - 1])) {
                
                // Add the capitalized letter to the new string
                newString += Character.toUpperCase(arrayString[index]); 
                
            // Else, do not do anything, just add to the new string as the current character does not need to be capitalized
            } else {
                newString += arrayString[index];
            }
        }

        // Return the string
        return newString;
        
        
    }
    
    
    
}