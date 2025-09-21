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
// Import user input functionality
import java.util.Scanner;

// Create the class
public class TheRiceAndChessStoryFirstProgram {
    public static void main(String[] args) {
        // Declares the Scanner attribute of the package above
        Scanner keyboard = new Scanner(System.in);
        
        // Assign variable for the user's input on the total of days worked
        System.out.println("Number of Days Worked: ");
        int numberOfDays = keyboard.nextInt();
        
        // Assign variable of the initial daily payment amount
        int dailyPaymentAmount = 0;
        
        // A for loop that will add $100 to the initial daily payment
        // amount based on the days worked
        for (int i = 1; i <= numberOfDays; i++) {
            // Addition of $100 per days worked
            dailyPaymentAmount += 100;
        }

        // Displays the total amount based on the days worked.
        System.out.println("Total Payment: " + dailyPaymentAmount);
        

    }
}
    