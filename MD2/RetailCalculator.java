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
import javax.swing.JOptionPane;

// Class takes an whole sale amount, a mark up percentage, and outputs the total price of the item
// including the state tax of 2% and the city tax of 8%. We use JOptionPane to request input and output text.
public class RetailCalculator {
    public static void main(String[] args) {
        // Declares the Scanner attribute of the package above
        Scanner keyboard = new Scanner(System.in);
        
        // Asks a request for input of total sale price
        String amountInput = JOptionPane.showInputDialog("Enter sale price ($):");
        
        // Parses the input from JOptionPane into a calculable variable.
        // In this case, the total amount. 
        double totalAmount = Double.parseDouble(amountInput);
        
        // Asks a request for input of mark up percentage
        String tipInput = JOptionPane.showInputDialog("Enter markup (%):");
        
        // Parses the input from JOptionPane into a calculable variable.
        // In this case, the tip percentage. 
        double markupPercentage = Double.parseDouble(tipInput);
        
        // Calculates the price of the item based on the total amount
        // the mark up percentage, the state tax (2%), and the 
        // city tax (8%). 
        double markupAmount = totalAmount * (markupPercentage / 100);
        double salePrice = totalAmount + markupAmount;
        double stateTax = salePrice * (0.02);
        double cityTax = salePrice * (0.08);
        
        // Calculates the total retail price of the item
        double retailPrice = salePrice + stateTax + cityTax;
        
        // Output the total retail price amount based on the user's input
        JOptionPane.showMessageDialog(null, "The total retail price ($): " + retailPrice);

    }
}
    

