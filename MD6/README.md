Instructions
Use The Recipe as in Md 5. Add comments to the methods corresponding to each step of The Recipe. You do not need to use The Recipe for static main methods, but do show them working in the video. You can use the following outline:

    /**
     * Purpose:
     * Input/output: Given ..., returns ...
     * Examples:
     * sampleMethod(...) returns ...
     */
    public int sampleMethod(int y)
If you place the comments right before the method, as shown, they will show in the Method Call window when you test so you have the examples handy.

This is an assignment in constructing methods so if these comments are missing or are incomplete the assignment will not receive full credit.

When you have completed all the challenges, record a three minute (or longer) video showing you testing the methods one at a time (and nothing else) using the examples from the recipe (do not use a main method to test). It is fine to have bugs in the program when you record the video as long as you call it out.

Programming Challenges
Programming Challenge MD6-1: Magic 6 Ball
Implement the Magic 6 Ball from Md 3: Programming Challenges without a switch. Hint: use an array of Strings.

Programming Challenge MD6-2: Number Arrays
Create a class with the following static methods using the recipe:
getCount: which returns the number of elements in the array.
Examples:
getCount({1, 2, 3}) returns 3,
getCount({}) returns 0.
getHighestIndex which return the highest index of an element in the array.
Examples:
getHighestIndex({1, 3, 5}) returns 2,
getHighestIndex({5, 3, 1}) returns 2,
getHighestIndex({1}) returns 0.
getLastElement which returns the last element in a (non-empty) array.
Examples:
getLastElement({2}) returns 2,
getLastElement({4, 5, 6}) returns 6.
calculateSum: which which returns the sum of the elements in the array.
Example:
calculateSum({0, 1, 2, 3}) returns 6,
calculateSum({}) returns 0.
calculateAverage: which returns the average of the elements in the array.
Example:  calculateAverage({1,2}) returns 1.5.
Hint: reuse calculateSum of the above methods.
findMaximum: which returns the highest element in the array. Make sure it works for negative numbers.
Be diligent with explaining the loop in the comments.
Examples:
getMaximum({1, 3, 2}) returns 3,
getMaximum({-1, -2, -3}) returns -1.
findMinimum: which returns the lowest element in the array. Make sure it works for negative numbers.
Be diligent with explaining the loop in the comments.

Programming Challenge MD6-3: Lottery
Create a program that that can picks five random numbers between 1-9 and can check if five numbers that a user provides are the winning numbers.
It helps to make flowcharts for each method before you start programming so you have an clear idea of what you want to implement.
Implement the following static methods:
contains: which determines if a number is in the array.
Examples:
contains({1, 2, 3}, 2) returns true,
contains({1, 2, 3}, 4) returns false.
pickWinningNumbers: which returns an array with 5 unique number between 1 and 9 (incl.). Note: a number cannot appear twice.
Example: pickWinningNumbers() could return {9, 1, 3, 7, 5}, {1, 3, 5, 7, 9} or something else, randomly.
Hint: use contains.
inputUserNumbers: which returns an array with 5 unique number between 1 and 9 (incl.) that the user inputs. Note: a number cannot appear twice.
Example: inputUserNumbers() could return {9, 1, 3, 7, 5}, {1, 3, 5, 7, 9} or something else, according to what the user inputs.
Hint: see pickWinningNumbers. Same loop, except for the source of the numbers.
isWinner: which returns true if an array with five unique elements contain the winning numbers.
Examples:
isWinner({9, 1, 3, 7, 5}, {1, 3, 5, 7, 9}) returns true,
isWinner({9, 1, 3, 7, 5}, {1, 3, 6, 7, 9}) returns false.
Hint: use contains.
stringify: which returns a string containing all the elements separated by commas.
Examples:
stringify({1, 2, 3}) returns "1, 2, 3"
stringify({}) returns "" (the empty string).
main: write a main method that allows a user to enter five numbers, checks the numbers against a array of winning numbers, and prints out winning numbers and whether use player won.
The recipe is not used for the main method. Hint: use stringify to pretty print the arrays.
When a method returns an arrays in BlueJ, it is shown as a curved arrow because what is returned is a reference (pointer) to the array object. To see what the arrow points to, click on it or click Inspect.
Do not use break or continue.
What to Submit
Follow the Code Style and be sure to include The Recipe comments. Note: No recipe, no credit.

As always in the class, start each file with the mandatory code comment header, see: Java Source Code Comment Header.

Submit one jar file of the entire BlueJ project directory and a link to the video.

 

Some assignments inspired by: Gaddis, T. (2015). Starting Out With Java Myprogramming Lab  From Control Structures Through Objects. (6th ed.). Addison-Wesley.  
