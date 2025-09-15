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
// Import user input functionality
import java.util.Scanner;

// Create the class
public class CellPhonePlans {
    public static void main(String[] args) {
        // Declares the Scanner attribute of the package above
        Scanner keyboard = new Scanner(System.in);
        
        // Assign variable for each plan type cost
        int planAFixedCost = 0;
        int planBFixedCost = 10;
        int planCFixedCost = 20;
        
        // Assign variable for each extra minute cost for each plan
        double planAExtraMinuteCost = 0.09;
        double planBExtraMinuteCost = 0.05;
        double planCExtraMinuteCost = 0;
        
        // Ask user for the desired plan
        System.out.println("Choose Plan (A, B, or C): ");
        String planType = keyboard.nextLine().toUpperCase();

        // Ask user for number of minutes of talk time
        System.out.println("Total minutes of talk time: ");
        double minutesOfTalkTime = keyboard.nextDouble();

        
        // Calculate the total bill based on the plan type
        // and total number of minutes of talk time
        switch (planType) {
            // Plan Type A
            case "A":
                
                // Calculate total bill based on plan type and total minutes of talk time
                double planABillAmount = planAFixedCost + (minutesOfTalkTime * planAExtraMinuteCost);
                
                // Print the total bill
                System.out.println("Total Bill for Plan A($): " + planABillAmount);
                
                // Stop the program
                break;
                
            
            // Plan Type B
            case "B":
                
                // Calculate total bill based on plan type and total minutes of talk time
                double planBBillAmount = planBFixedCost + (minutesOfTalkTime * planBExtraMinuteCost);
                
                // Print the total bill
                System.out.println("Total Bill for Plan B ($): " + planBBillAmount);
                
                // Stop the program
                break;
            
            // Plan Type C
            case "C":
                
                // Calculate total bill based on plan type and total minutes of talk time
                double planCBillAmount = planCFixedCost + (minutesOfTalkTime * planCExtraMinuteCost);
                
                // Print the total bill
                System.out.println("Total Bill for Plan B ($): " + planCBillAmount);
                
                // Stop the program
                break;
                
            // Print friendly error message in case plan is invalid
            default:
                System.out.println("Sorry my friend, that is not a valid plan.");
        }
        

    }
}
    