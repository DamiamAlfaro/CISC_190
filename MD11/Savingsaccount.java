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

// 
public class Savingsaccount extends Bankaccount {
    
    // A savings account has a number of withdrawals each month
    private int totalMonthlyWithdrawals;
    
    // Implement a constructor for the class
    public Savingsaccount(String accountNumber, String primaryAccountHolder, double annualInterestRatePercentage) {
        // Call the superclass constructor
        // This is-a inheretance from Bankaccount
        super(accountNumber, primaryAccountHolder, annualInterestRatePercentage);
        this.totalMonthlyWithdrawals = 0;
    }
    
    // Can get the number of withdrawals this month
    public int getWithdrawalsThisMonth() {
        return totalMonthlyWithdrawals;
    }

    // Method to deposit to the bankaccount (same as parent)
    public void depositAmount(double amount) {
        // This is-a inheretance from Bankaccount
        super.depositAmount(amount);
    }

    // Method to withdraw amount from account (overrides parent)
    @Override
    public void withdrawAmount(double amount) throws InvalidAmountException, TooManyWithdrawalsException {
        // If the total withdrawals are more than 6, prevent the action and output the result
        if (totalMonthlyWithdrawals >= 6) {
            // In SavingsAccount, throw the above exception if a programmer tries to withdraw more times than allowed in a month.

            throw new TooManyWithdrawalsException(totalMonthlyWithdrawals);
        }
        
        // In SavingsAccount, throw an InvalidAmountException  if a programmer tries to withdraw more than allowed.
        if (amount < 0) {
            throw new InvalidAmountException(amount);
        }
        
        // Only withdraw if amount is positive and <= balance
        if (amount > 0 && amount <= getBalance()) {
            // This is-a inheretance from Bankaccount
            super.withdrawAmount(amount);
            totalMonthlyWithdrawals++;
        } else {
            System.out.println("Invalid or excessive withdrawal. Ignored.");
        }
    }

    // Method that can process the account at the end of the month by depositing interest and resetting withdrawals
    public void processEndOfMonth() throws TooManyWithdrawalsException, InvalidAmountException {
        // This is-a inheretance from Bankaccount
        super.processEndOfMonth();
        totalMonthlyWithdrawals = 0;
    }
}
