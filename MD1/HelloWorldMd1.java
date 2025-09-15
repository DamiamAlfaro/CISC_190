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
 * Version: September 1, 2025
 */ 
// This is an access modifier, signifying the class HelloWorldMd1, declaring a new class 
import java.util.Scanner;
public class HelloWorldMd1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is the tip?");
        double tipAmount = keyboard.nextDouble();

        System.out.println("For a $100 bill, the total amount is: " + (100.0+tipAmount));
        
        keyboard.close();
    }
}

