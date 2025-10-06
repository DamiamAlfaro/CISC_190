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
 * Version: October 5, 2025
 */ 

// Import the random number generator class
import java.util.Random;

public class Magic6BallAdvanced {
    
    // Purpose: Generate a message based on a random number
    // Input/output: input none, return string message
    // Examples:
    // designateMagicBallScenario() return "Try Again"
    // designateMagicBallScenario() return "You are taking CISC 190"
    public static String designateMagicBallScenario() {
        
        // Generate a random number between 0 and 5 (incl.)
        int randomNumber = new Random().nextInt(6);
        
        // Set an array of the 6 possible messages
        String[] possibleMessages = {
            "Try Again",
            "You are happy",
            "You are human",
            "You are taking CISC 190",
            "You are using BlueJ",
            "This is Java Programming"
        };
                
        // Return the message
        return possibleMessages[randomNumber];
        
        
    }
    
}
