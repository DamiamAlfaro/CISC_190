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
 * Version: September 28, 2025
 */ 

public class MoneyCalculations {
    
    // Purpose: Calculate corresponding tip amount
    // Input/output: Given amount and tip percent, returns tip amount
    // Examples:
    // calculateTipAmount(80, 20) return 16
    // calculateTipAmount(73.44, 16.45) return 12.08
    public static double calculateTipAmount(double amount, double tipPercent) {
        
        // Multiply the amount with by the tipPercent, which has to be divided by
        // a 100 in order to acquire a decimal which is the percent. It would be
        // awkard for the user to enter the percent as a decimal.
        double tipAmount = amount * (tipPercent/100);
        
        // Return the calculated tip amount
        return tipAmount;
    }
    
    
    // Purpose: Calculate total amount including the tip
    // Input/output: Given amount and tip percent, returns total amount with tip
    // Examples:
    // calculateTotalAmount(80, 20) return 96
    // calculateTotalAmount(73.44, 16.45) return 85.52
    public static double calculateTotalAmount(double amount, double tipPercent) {
        
        // Multiply the amount with by the tipPercent, which has to be divided by
        // a 100 in order to acquire a decimal which is the percent. It would be
        // awkard for the user to enter the percent as a decimal.
        double tipAmount = amount * (tipPercent/100);
        
        // Once the tipAmount has been acquired, add it to the initial
        // amount to get the total amount
        double totalAmount = amount + tipAmount;
        
        // return the calculated total amount
        return totalAmount;
        
    }
    
    // Purpose: Calculate total retail price of an item, including markup and taxes
    // Input/output: Given whole sale price and a markup percent, returns 
    // retails price of the item, including markup and taxes
    // Examples:
    // calculateRetailPrice(67, 15) return 84.755
    // calculateRetailPrice(89.99, 12.50) return 111.36
    
    public static double calculateRetailPrice(double wholeSalePrice, double markupPercent) {
        
        // Calculate the markup amount of the item. Just as the methods above,
        // we need to divide the markupPercent by 100 in order to conver it
        // into a decimal, therefore signifying a percentage.
        double markupAmount = wholeSalePrice * (markupPercent / 100);
        
        // Calculate the sale price with the newly acquired markup amount which
        // is added to the whole sale price
        double salePrice = wholeSalePrice + markupAmount;
        
        // Calculate the state tax based on the newly acquired sale price
        double stateTax = salePrice * (0.02);
        
        // Calculate the city tax based on the newly acquired sale price
        double cityTax = salePrice * (0.08);
        
        // With all the newly acquired parameters, add them together to
        // calculate the retail price of the item
        double retailPrice = salePrice + stateTax + cityTax;
        
        // Return the retail price
        return retailPrice;
    }
}