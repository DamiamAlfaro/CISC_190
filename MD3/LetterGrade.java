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
public class LetterGrade {
    public static void main(String[] args) {
        // Declares the Scanner attribute of the package above
        Scanner keyboard = new Scanner(System.in);
        
        // Asks user for his grade percentage
        System.out.println("Grade Percentage (%): ");
        double gradePercent = keyboard.nextDouble();
        
        // Calculates and assigns a grade based
        // on the percentage intervals.
        // Assign the grade A if the percent is between 89 and 80
        if (gradePercent < 100 && gradePercent >= 90){
            System.out.println("Your grade: A");
            
        // Assign the grade B if the percent is between 89 and 80
        } else if (gradePercent < 90 && gradePercent >= 80){
            System.out.println("Your grade: B");
            
        // Assign the grade C if the percent is between 79 and 70
        } else if (gradePercent < 80 && gradePercent >= 70){
            System.out.println("Your grade: C");
            
        // Assign the grade D if the percent is between 89 and 80
        } else if (gradePercent < 70 && gradePercent >= 60){
            System.out.println("Your grade: D");
            
        // Assign the grade F if the grade is below 60
        } else if (gradePercent < 60){
            System.out.println("Your grade: F");
            
        }
        

    }
}
    