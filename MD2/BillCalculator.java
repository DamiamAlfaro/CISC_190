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

// Class takes an amount, a tip percentage, and outputs the total bill amount
// based on those parameters.
public class BillCalculator {
    public static void main(String[] args) {
        // Declares the Scanner attribute of the package above
        Scanner keyboard = new Scanner(System.in);
        
        // Prints a request for input of total amount
        System.out.println("Enter amount ($): ");
        
        // Allows user to inter the full amount using the Scanner
        double totalAmount = keyboard.nextDouble();
        
        // Prints a request for input of tip percentage
        System.out.println("Enter tip (%): ");
        
        // Allows user to inter the tip percentage
        double tipPercentage = keyboard.nextDouble();
        
        // Calculates the tip amount based on the total amount
        // and the tip percentage. The tip percentage is 
        // divided by 100 in order to get a decimal (percentage) 
        // out of the user's input in whole numbers.
        double tipAmount = totalAmount * (tipPercentage / 100);
        
        // Calculates the total amount plus the tipAmount
        double totalBillAmount = totalAmount + tipAmount; 
        
        // Output the total bill's amount based on the user's input
        System.out.println("The total bill amount ($): " + totalBillAmount);
        

    }
}
    

