/** 
 * Lead Author(s): 
 * Damiam Alfaro; dalfaro@student.sdccd.edu 
 * 
 * Other Contributors: 
 * <<Add additional contributors (mentors, tutors, friends) here>> 
 * 
 * References: 
 * Gaddis, T. (2023). Starting out with Java: From control structures through objects. Pearson. 
 * 
 * Version: November 2, 2025
 */ 

// Checkingaccount is-a Bankaccount (inheritance relationship)
public class Checkingaccount extends Bankaccount {

    // A checking account has a number of deposits this month
    private int depositsThisMonth;

    // Constructor calls super() to initialize parent class
    public Checkingaccount(String accountNumber, String primaryAccountHolder, double annualInterestRatePercentage) {
        // This is-a inheretance from Bankaccount
        super(accountNumber, primaryAccountHolder, annualInterestRatePercentage);
        this.depositsThisMonth = 0;
    }

    // Method to get the number of deposits this month
    public int getDepositsThisMonth() { 
        return depositsThisMonth; 
    }

    // Can deposit an amount — increments deposit counter
    public void depositAmount(double totalAmount) {
        // This is-a inheretance from Bankaccount
        super.depositAmount(totalAmount);
        depositsThisMonth++;
    }

    // Can withdraw up to $100 more than balance (overdraft)
    public void withdrawAmount(double amountToWithdraw) {
        double currentBalance = getBalance();
        
        if (amountToWithdraw > 0 && (currentBalance - amountToWithdraw) >= -100) {
            // This is-a inheretance from Bankaccount
            super.withdrawAmount(amountToWithdraw);
        } else {
            System.out.println("Withdrawal denied: overdraft limit exceeded.");
        }
    }

    // Can accrue interest and fees at the end of the month
    // accrue interest, $0.50 per deposit, actually deduct from account balance
    // and reset counter for next month
    public void processEndOfMonth() {
        // This is-a inheretance from Bankaccount
        super.processEndOfMonth(); 
        double fee = depositsThisMonth * 0.5; 
        super.withdrawAmount(fee); 
        depositsThisMonth = 0; 
    }
}
