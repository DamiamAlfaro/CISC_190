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
public class CellPhoneTextPlan {
    public static void main(String[] args) {
        // Declares the Scanner attribute of the package above
        Scanner keyboard = new Scanner(System.in);

        // Designate a number for the first 
        // 100 free texts.
        int totalFreeTexts = 100;
        
        // Baseline texting plan amount
        double textingPlanAmount = 8;
        
        // Asks user for total number of
        // texts sent.
        System.out.println("Total texts: ");
        double totalTexts = keyboard.nextDouble();
        
        // Calculate the total amount to be
        // paid this month based on the total
        // texts.
        if (totalTexts <= 100){
            System.out.println("Total this month: $" + textingPlanAmount);
        } else {
            // Calculate how many texts did the user
            // went beyond the first 100 free.
            double textsOverLimit = totalTexts - totalFreeTexts;
            
            // Multiple the texts over the limit by
            // 2 cents each
            double extraCents = textsOverLimit * 0.02;
            
            // Calculate new month bill amount
            double newMonthBill = textingPlanAmount + extraCents;
            
            System.out.println("Total this month: $" + newMonthBill);
        }
        

    }
}
    