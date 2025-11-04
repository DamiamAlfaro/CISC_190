Scenario
In this challenge you going to design and implement a set of classes for use in a bank or credit union. The point of the challenges is to demonstrate that you can implement is-a, has-a and has-many relationships, and override methods in sub classes.
Design and implement the following classes:

Bank account, which models a simple account.
A bank account: 
has-an account number - which data type is appropriate? Explain in the comments
has-an primary account holder - which data type is appropriate?
a balance
an annual interest rate.
Implements a constructor that takes an account number, and an annual interest rate. Starting balance should be $0.00.
Can get the account number
Can get the primary account holder
Can get the balance.
Can deposit an amount with the balance being updated accordingly.
Can withdraw an amount with the balance being updated accordingly.
Can process an account at the end of the month by depositing interest rate accrued monthly at 1/12 of the annual rate (hint: create processEndOfMonth())

Savings account, which:
Is a bank account
Can get the number of withdrawals in a month
Can only withdraw up to the balance; meaning that the balance cannot go below zero; withdraws after that are ignored.
Can only make six withdrawals in a month; withdraws after that are ignored. (This is a real rule, see: https://www.federalreserve.gov/boarddocs/supmanual/cch/int_depos.pdfLinks to an external site.)
Can accrue interest and reset the number of monthly withdrawals at the end of the month (hint: override processEndOfMonth() to reset the number of withdrawals and accrue interest)

Checking account, which:
Is a bank account
Can withdraw $100 more than the balance; meaning the balance can become negative.
Can get the number of deposits in a month
Can accrue interest and fees at the end of the month:
$0.5 for each deposits
(hint: override processEndOfMonth(); customers are only charged once for each deposit)
Then record a video: In the video show how instances of each of the classes work: use the BlueJ tools to as demonstrated earlier in class to show:

Start the video by showing the inheritance hierarchy in the main BlueJ window to explain which classes are the super classes and which are the sub classes.
Create a bank account with an annual interest rate of 12% (to keep the calculations simple).
Check the balance, which should be zero
Deposit an amount into the account
Check the balance
Withdraw an amount that leaves money in the account
Check the balance
Perform the end of month processing
Check the balance, which should include the some interest

Create a savings account with an annual interest rate of 6%.
Deposit an amount into the account
Check the balance
Check the number of withdrawals which should be zero
Try to make a withdrawal on an amount more that the balance
Check that the balance is unchanged
Check the number of withdrawals which should be zero
Withdraw an amount that leaves money in the account (balance > 0)
Check the balance
Check the number of withdrawals which should be one
Make five more withdrawals
Check the number of withdrawals which should be six
Try to make a withdrawal on an amount less that the balance
Check the balance which should be unchanged
Check the number of withdrawals which should be six
Perform the end of month processing
Check the balance, which should include the some interest
Check the number of withdrawals which should be zero

Create a checking account with an annual interest rate of 1%.
Deposit an amount into the account
Check the balance
Make two withdrawals that leave money in the account (balance > 0)
Perform the end of month processing
Check the balance which should have added interest and deducted fees

Technical implementation
Use inheritance to implement is-a relationships.
Comment each inheritance relationship with a "is-a" comment.
Use private instance variables/fields for all has-a relationships.
Comment each instance variable/field with a "has a" comment.
Implement “can” as methods.
Comment each method with purpose. Recipe examples are not required.
Use the super keyword in constructors to call constructors in the super class.
Override deposit and withdraw and processMonthly(), and use the super keyword to reuse methods in the super class.

Submit
Remember to comment and indent your code - the assignment will receive no credit if the comments are not meaningful and the code is not consistently indented.

As always in the class, start each file with the mandatory code comment header, see: Java Source Code Comment Header.

Submit a jar file of the entire project directory, along with a link to your video (do not submit a file; link must not be publicly available). Check the volume on the video before you submit.
