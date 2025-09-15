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
 * Version: September 7, 2025
 */ 
// Imports necessary packages
import java.util.Scanner;

// Class takes an amount and prints out the tip amount for a 20% tip.
public class SimpleTipCalculator {
    public static void main(String[] args) {
        // Declares the Scanner attribute of the package above
        Scanner keyboard = new Scanner(System.in);
        
        // Prints a request for input
        System.out.println("Enter amount ($): ");
        
        // Allows user to inter the full amount using the Scanner
        double totalAmount = keyboard.nextDouble();
        
        // Calculates the 20% of the inputed amount
        double twentyPercentOfAmount = totalAmount * 0.2;
        
        // Outputs the tip amount respective to 20%
        System.out.println("The tip is ($):" + twentyPercentOfAmount);

    }
}
    

