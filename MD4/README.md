Flowcharts
Before you start programming: for each programming challenge below, construct a a complete flowchart with all loops/decisions and processing in detail with pen & paper or a drawing program; this will help you to think about which type of loop to use.
Please use diamonds for decisions and rectangles for processing. Submit pictures of your flowcharts.

Programming Challenge Md4-1: The Rice And Chessboard Story
Read: 
The rice and chessboard story. (n.d.). Dr Mike's Math Games for Kids.
https://www.dr-mikes-math-games-for-kids.com/rice-and-chessboard.htmlLinks to an external site.
(The Rice And Chessboard Story - Learning How Doubling Makes Numbers Grow Dr Mike's Math Games for Kids.pdf Download The Rice And Chessboard Story - Learning How Doubling Makes Numbers Grow Dr Mike's Math Games for Kids.pdf)

Solve the problem:
You are offered a job, which lasts for 7 weeks. You get to choose your salary.

    Either, you get $100 for the first day, $200 for the second day, $300 for the third day. Each day you are paid $100 more than the day before.
    Or, you get 1 cent for the first day, 2 cents for the second day, 4 cents for the third day. Each day you are paid double what you were paid the day before. 

Which do you choose?

1. Write one program that inputs a number of days and calculates how much money would would have earned if "you get $100 for the first day, $200 for the second day, $300 for the third day. Each day you are paid $100 more than the day before"
2. Write another program that inputs a number of days and calculates how much money you would have earned if "you get 1 cent for the first day, 2 cents for the second day, 4 cents for the third day. Each day you are paid double what you were paid the day before."
Think about which type of loop you want to use given that the loop has to run a fixed number of times
Use an accumulator to add up the earnings from each day, do not use any Math.

Programming Challenge Md4-2: Reading and Printing a File
Write a program that reads the contents of the file while printing out each line with a line number. It may look like:

1: This the first line in the file
2: This is the second line in the file
3: This is another line in the file

You decide which file to read; you can use one of the Java files in your project. Code the file name in a variable in the program.
Think about which type of loop is best suited for the situation given that a file could be empty
Use the following to avoid compilation errors:
public static void main(String[] args) throws IOException

Programming Challenge Md4-3: The Hi/Lo Game
In this game, the computer "thinks" of a secret random number between 0 and 99 (incl.) and the user is challenged to guess the number. When the user enters a guess, the computer responds with "Too low," "Too high," or "Correct" depending on whether the user's guess was lower, higher or the secret number. When the user guesses the secret number, the program also prints out the number of guesses the user used and ends. Example:
Welcome to the Hi/Lo game!
Enter guess: 25
Too low.
Enter guess: 75
Too high.
Enter guess: 55
Correct!
You used 3 guess(es).
Think about which kind of loop is best suited given that the program has to prompt for each guess; the program only has to ask for user input in one place.
In each programming challenge use a different kind of loop from the others (figuring out which to use is half the challenge).

As always in the class, start each file with the mandatory code comment header, see: Java Source Code Comment Header.

Follow the Code Style, and comment each line of code to show you understand how it works.

Submit:

pictures of the flowcharts
a screenshot for each program running
one jar file of one single BlueJ project with three classes in it (see module 1 on how to check the contents of the jar file)
