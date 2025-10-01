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
 * Version: September 28, 2025
 */ 

// Import the random number generator class and Scanner for user's choice
import java.util.Random;
import java.util.Scanner;

// Start the class
public class RockPaperScissors {
    
    // Print the result using a main method
    public static void main(String[] args) {
        System.out.println("Result: " + findWinner(getUserChoice(), getComputerChoice()));
    }
    
    // Purpose: Randomly return Rock, Paper, or Scissors
    // Input/output: No input, returns either "Rock", "Paper" or "Scissors"
    // Examples:
    // getComputerChoice() return "Rock"
    // getComputerChoice() return "Paper"
    // getComputerChoice() return "Scissors"
    public static String getComputerChoice() {
        
        // Designate the random number between 0 - 2 (three options total)
        int randomNumber = new Random().nextInt(3);
        
        // If the random number is 0, return "Rock"
        if (randomNumber == 0) {
            return "Rock";
            
        // If the random number is 1, return "Paper"
        } else if (randomNumber == 1) {
            return "Paper";
        
        // If the random number is 2, return "Scissors"
        } else {
            return "Scissors";
        }
    }
    

    // Purpose: Allow the player to select either "Rock", "Paper", or "Scissors"
    // Input/output: input user's choice, returns nothing
    // Examples:
    // getUserChoice() return "Rock"
    // getUserChoice() return "Paper"
    // getUserChoice() return "Scissors"
    public static String getUserChoice() {
        
        // Import scanner (no other way to allow user to choose an option...)
        Scanner keyboard = new Scanner(System.in);
        
        // Let the user choose and option
        System.out.println("Choose between 'Rock', 'Paper', or 'Scissors'");
        String usersChoice = keyboard.nextLine();
        
        // Return user's choice
        return usersChoice;
    }
    
    // Purpose: Select the winner 
    // Input/output: input userChoice and computerChoice, return winner
    // Examples:
    // findWinner("Rock", "Paper") return "Computer"
    // findWinner("Scissors","Paper") return "User"
    public static String findWinner(String userChoice, String computerChoice) {
        
        // For reference purposes, print out each participant's choices
        System.out.println("User's Choice: " + userChoice);
        System.out.println("Computer's Choice: " + computerChoice);
        
        // If the user chooses "Rock", and the Computer choice is "Paper", 
        // return "Computer" as a winner
        if (userChoice.equals("Rock") && computerChoice.equals("Paper")) {
            return "Computer";

        // If the user chooses "Rock", and the Computer choice is "Scissors", 
        // return "User" as a winner
        } else if (userChoice.equals("Rock") && computerChoice.equals("Scissors")) {
            return "User";
        
        // If the user chooses "Paper", and the Computer choice is "Rock", 
        // return "User" as a winner
        } else if (userChoice.equals("Paper") && computerChoice.equals("Rock")) {
            return "User";
        
        // If the user chooses "Paper", and the Computer choice is "Scissors", 
        // return "Computer" as a winner
        } else if (userChoice.equals("Paper") && computerChoice.equals("Scissors")) {
            return "Computer";
            
        // If the user chooses "Scissors", and the Computer choice is "Rock", 
        // return "Computer" as a winner
        } else if (userChoice.equals("Scissors") && computerChoice.equals("Rock")) {
            return "Computer";
        
        // If the user chooses "Scissors", and the Computer choice is "Paper", 
        // return "User" as a winner
        } else if (userChoice.equals("Scissors") && computerChoice.equals("Paper")) {
            return "User";

        // If the choices are the same, then it is a draw
        } else {
            return "Draw";
        }
    }


}