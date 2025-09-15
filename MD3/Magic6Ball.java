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
 * Version: September 14, 2025
 */ 
// Import the random number generator class
import java.util.Random;

// Create the class
public class Magic6Ball {
    public static void main(String[] args) {

        // Generate a random number between 0 and 5 (incl.)
        int randomNumber = new Random().nextInt(6);
        
        // Decide which scenario to display based on the
        // random number from above. Using switch is better
        // than if as we are using scenarios, not 
        // specific events.
        switch (randomNumber) {
            
            // The case the random number is 0
            case 0:
                // Prints a message
                System.out.println("Try again");
                // break is used to avoid compiling the
                // other cases.
                break;
            
            // The case the random number is 0
            case 1:
                // Prints a message
                System.out.println("You are happy");
                // break is used to avoid compiling the
                // other cases.
                break;
                
            
            // The case the random number is 0
            case 2:
                // Prints a message
                System.out.println("You are human");
                // break is used to avoid compiling the
                // other cases.
                break;
            
            // The case the random number is 0
            case 3:
                // Prints a message
                System.out.println("You are taking CISC 190");
                // break is used to avoid compiling the
                // other cases.
                break;
            
            // The case the random number is 0
            case 4:
                // Prints a message
                System.out.println("You are using BlueJ");
                // break is used to avoid compiling the
                // other cases.
                break;
            
            // The case the random number is 0
            case 5:
                // Prints a message
                System.out.println("This is Java Programming");
                // break is used to avoid compiling the
                // other cases.
                break;
        }

    }
}
    