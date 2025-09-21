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
 * Version: September 21, 2025
 */ 
//Import necessary packages
import java.util.Scanner;
import java.util.Random;

// Create the class
public class HiLoGame {
    public static void main(String[] args) {
        // Declares the Scanner attribute of the package above
        Scanner keyboard = new Scanner(System.in);
        
        // Welcome the user
        System.out.println("Welcome to the Hi/Lo game!");
        
        // Assign the random number between 0 and 99 (incl.)
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        
        // Total Number of guesses count
        int totalNumberOfGuesses = 0;
        
        // Assign a variable to the exact guess of the user prior to his/her input
        int usersGuess;
        
        // Perform the Hi/Lo Game while the user does not hit the correct guess
        do {
            // Indicate the user to enter the guess
            System.out.println("Enter Guess: ");
            
            // Allow the user to enter his guess in the terminal
            usersGuess = keyboard.nextInt();
            
            // Add 1 to the total number of guesses count each time he attempts a new guess
            totalNumberOfGuesses += 1;
            
            // If the guess is below the random number, let the user know
            if (usersGuess < randomNumber) {
                System.out.println("Too low.");
            
            // If the guess is above the random number, let the user know
            } else if (usersGuess > randomNumber) {
                System.out.println("Too high.");
                
            // If the user accurately guesses the random number let him know and display the number
            // of guesses he took to guess the random number
            } else {
                System.out.println("Correct!");
                System.out.println("You used " + totalNumberOfGuesses + " guess(es).");
            }
        
        // Perform the Hi/Lo Game while the user does not hit the correct guess
        } while (usersGuess != randomNumber);
        
                

        

    }
}