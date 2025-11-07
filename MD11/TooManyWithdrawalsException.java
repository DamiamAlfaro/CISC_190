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
 * Version: November 9, 2025
 */ 


// The class that will be used to raise the too-many-withdrawals exception
public class TooManyWithdrawalsException extends Exception {
    public TooManyWithdrawalsException(int withdrawals) {
        
        // Utilize super constructor functionality
        super("Too many withdrawals this month: " + withdrawals);
    }
}