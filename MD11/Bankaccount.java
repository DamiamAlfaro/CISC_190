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

public class Bankaccount {
    
    // A bank account has an account number. String is appropriate for this variable because the account number
    // might start with 0s (e.g. 00044323453)
    private String accountNumber;
    
    // A bank account has a primary account holder. String is appropriate since the account holder is a name
    private String primaryAccountHolder;
    
    // A bank account has a balance
    private double balance;
    
    // A bank account has an annual interest rate. Double is appropriate since the interest rate is a percentage
    private double annualInterestRatePercentage;
    
    // Implement a constructor that takes an account number, and an annual interest rate. Starting balance should be $0.00
    public Bankaccount(String accountNumber, String primaryAccountHolder, double annualInterestRatePercentage) {
        
        // Declare given constructor variables. 
        this.accountNumber = accountNumber;
        this.primaryAccountHolder = primaryAccountHolder;
        this.annualInterestRatePercentage = annualInterestRatePercentage / 100;
        
        // Declare missing constructor variables
        this.balance = 0.0;
        
    }
    
    // Method that can get the account number
    public String getAccountNumber() {
        return accountNumber;
    }
    
    // Method that can get the primary account holder
    public String getPrimaryAccountHolder() {
        return primaryAccountHolder;
    }
    
    // Method that can get the balance
    public double getBalance() {
        return balance;
    }
    
    // Method that can deposit an amount with the balance being updated accordingly

    public void depositAmount(double amountToDeposit)  {
        
        // In BankAccount, throw an IllegalArgumentException if a programmer tries to deposit a negative amount
        if (amountToDeposit < 0) {
            throw new IllegalArgumentException("Cannot withdraw a negative amount: " + amountToDeposit);
        }

        
        balance += amountToDeposit;
    }
    
    // Method that can withdraw an amount with the balance being updated accordingly
    public void withdrawAmount(double amountToWithdraw) throws InvalidAmountException, TooManyWithdrawalsException {
        
        // In BankAccount, throw an IllegalArgumentException if a programmer tries to withdraw a negative amount.
        if (amountToWithdraw < 0) {
            throw new IllegalArgumentException("Cannot withdraw a negative amount: " + amountToWithdraw);
        }
        
        balance -= amountToWithdraw;
        
        
    }
    
    // Method that can process an account at the end of the month by depositing interest rate accrued monthly at 1/12 of the annual rate
    public void processEndOfMonth() throws InvalidAmountException, TooManyWithdrawalsException {
        
        // Generate the monthly interest
        double interestAccruedMonthly = annualInterestRatePercentage/12;
        double monthlyInterest = interestAccruedMonthly * balance;
        
        // Add the accrued monthly interest to the balance
        balance += monthlyInterest;
    }
    
}