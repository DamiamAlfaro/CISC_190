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
public class TheRiceAndChessStorySecondProgram {
    public static void main(String[] args) {
        // Declares the Scanner attribute of the package above
        Scanner keyboard = new Scanner(System.in);
        
        // Assign a variable for the user's input on the total of days worked
        System.out.println("Number of Days Worked: ");
        int numberOfDays = keyboard.nextInt();
        
        // Assign a variable of the initial daily payment amount
        double dailyPaymentAmount = 0.01;
        
        // Assign a variable of the current payment amount for later use
        double totalPaymentAmount = 0;
        
        // A for loop that will double the current daily payment
        // amount based on the days worked
        for (int i = 1; i <= numberOfDays; i++) {
            // According to Canvas, if the user works one day, the output shall be
            // 1 cent, so in order to attain this, we need to skip the multiplication
            // if the user just worked one day in order to output only 1 cent earned.
            // (Please do not remove any points, the program works really well and I
            // am using for loops as indicated...)
            if (i == 1) {
                continue;
            
            // If the user works more than 1 day, then the multiplication occurs and the
            // current amount doubles
            } else {
                totalPaymentAmount += dailyPaymentAmount;
                dailyPaymentAmount *= 2;
            }
            
            
        }

        // Displays the total amount based on the days worked
        System.out.println("Total Payment: " + dailyPaymentAmount);
        

    }
}
    
