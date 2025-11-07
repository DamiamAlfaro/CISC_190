Challenges
Programming Challenge Md 11-1: Bank Exceptions
Based on Md 10: Programming Challenges. Be sure to implement any improvements suggested in Md 10 before you proceed.
Implement the following:
In BankAccount, throw an IllegalArgumentException if a programmer tries to deposit a negative amount.
In BankAccount, throw an IllegalArgumentException if a programmer tries to withdraw a negative amount.
Create a class called InvalidAmountException which is-an Exception and takes an amount in the constructor and sets a message about the amount in the super class.
In SavingsAccount, throw an InvalidAmountException if a programmer tries to withdraw more than allowed.
Hint: remember to to declare that the method throws an exception by adding throws InvalidAmountException in the method declaration.
In CheckingAccount, throw an InvalidAmountException if a programmer tries to withdraw more than allowed.
Create an Exception class to be thrown if a programmer tries to do more withdrawals than allowed.
Be sure to name it according to the Java exception convention.
In SavingsAccount, throw the above exception if a programmer tries to withdraw more times than allowed in a month.
You do not have to catch any exceptions, only declare and throw them.
Record a video that shows you taking the code through all the scenarios above to show all the different exceptions being thrown.

Programming Challenge Md 11-2: Scoreboard
In this challenge we are going to Implement a scoreboard for a game that can be saved to disk and read in again when the game starts. Be sure to make all instance variables private and comment them with has-a or is-a.
Create a class called GameScore which has-a player name and game score for that player.
Implement toString in GameScore to return the player name and score as a String.
Create a class called Scoreboard that has-many GameScores.
Implement a constructor that takes a GameScores array.
Implement toString in Scoreboard to return the GameScores as a String. Hint: See the Lottery challenge.
Create a class with two static methods:
save: which:
Creates a Scoreboard with five GameScores.
Prints out the name of each player with their score.
Hint: use the toString method in GameScore and Scoreboard.
Saves the Scoreboard to disk using Serialization.
Prevents the program from crashing by placing the serialization in a try...catch-block.
load: which:
Reads in a file created with the save method.
Prevents the program from crashing by placing the deserialization in a try...catch-block.
Prints out the name of each player with their score.

Submit
Make sure the code follows the Code Style.

As always in the class, start each file with the mandatory code comment header, see: Java Source Code Comment Header.

Submit a jar file of the entire project directory, along with the saved Serialization file and a link to your video (do not submit a file; link must not be publicly available)
