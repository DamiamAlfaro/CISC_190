Instructions
Use The Recipe as seen in this module. Add comments to the methods corresponding to each step of The Recipe. You do not need to use The Recipe for static main methods. You can use the following outline:

    /**
     * Purpose:
     * Input/output: Given ..., returns ...
     * Examples:
     * sampleMethod(...) returns ...
     */
    public int sampleMethod(int y)
If you place the comments right before the method, as shown, they will show in the Method Call window when you test so you have the examples handy. Note: the two stars on the first line.

This is an assignment in constructing methods so if these comments are missing or are incomplete the assignment will not receive full credit.

Video
Guideline
When you have completed all the challenges, record a three minute (or longer) video showing you testing the program. You can use Studio in the Canvas menu on the left (or any other screen recording software).

Guidelines:

On the video, introduce yourself with your full name, and explain each step clearly as you go along.
Demonstrate each method you have implemented using the examples from the Recipe and verify that with the given input, the methods return the correct output.
Do not use a main.
Only show how you test the program: using the examples from the Recipe, show that each method returns what you expect.
Do not  explain the source code or show the textbook.
Submit only a link to the video (not a video file).
Do not make your video publicly available (on Youtube or similar).
Checklist
Here are some items you want check before you submit your video:

Recommended length: 3-5 minutes (longer is fine).
Make sure you are recording what you think you are recording (some screen recorders only record part of the screen).
Make sure your voice can be clearly heard: loud enough and yet not distorted.
Cover all the topics in the instructions. Do not show your code or the textbook.
Watch your video before you submit to see that everything was recorded as you intended (and you learn a lot from watching yourself).

Programming Challenges
Programming Challenge Md 5-1: Money Calculators
Implement a method that takes an amount and a tip percent, and returns the corresponding tip amount.
Implement a method that takes an amount and a tip percent, and returns the amount plus the tip.
Hint: reuse the first method.
Implement a method that takes a whole sale price of an item, and a markup percent, and returns the retails price of the item, including markup and taxes. The state tax is 2% and the city tax is 8%.
Be sure to name the methods with a verb; for instance, calculate...().
Each method should have at least two examples (because sometimes methods "accidentally" returns the correct value)
Note: the methods should take parameters, and not do any input using text (Scanner) or GUI (JOptionPane), nor should they print anything out (unlike earlier in class).
Programming Challenge Md 5-2: Unit Conversions
Implement a method that takes a speed in miles per hour and returns the speed in kilometers per hour.
See: https://www.cuemath.com/miles-to-km-formula/Links to an external site.
Implement a method that takes a speed in kilometers per hour and returns the speed in miles per hour.
Implement a method that takes a temperature in Fahrenheit and returns the temperature in Celsius.
See: https://www.khanacademy.org/math/8th-engage-ny/engage-8th-module-4/8th-module-4-topic-d/v/converting-farenheit-to-celsiusLinks to an external site.
Implement a method that takes a temperature in Celsius and returns the temperature in Fahrenheit.
Be sure to create a separate method for doing the conversion; the name should contain a verb.
Each method should have at least two examples. Hint: can you find a way to reuse some of the examples?

Programming Challenge Md 5-3: Rock, Paper, Scissors
Implement the game of Rock, Paper, Scissors, see:
Rock paper scissors. (2001, September 7). Wikipedia, the free encyclopedia.
https://en.wikipedia.org/wiki/Rock_paper_scissorsLinks to an external site.
Follow the following steps:
Create a method:
String getComputerChoice()
that randomly returns either "Rock", "Paper" or "Scissors".
Note: this method does not take any input parameters.
Hint: See Magic 6 Ball
Create a method:
String getUserChoice()
that allows the player to select either "Rock", "Paper" or "Scissors", and nothing else.
Note: this method does not take any input parameters.
Create a method:
String findWinner(String userChoice, String computerChoice)
that returns "User", "Computer" or "Draw" depending on the input.
Hint: use userChoice.equals("Rock") and computerChoice.equals("Paper") to check who wins.
Note: Strings are case-sensitive: "rock" is different from "Rock"
Hint: Draw can be handled in one condition.
Hint: there are nine examples to test.
Put the game play in a main method, it could be as simple as printing out the result of:
findWinner(getUserInput(), getComputerChoice())
 

As always in the class, start each file with the mandatory code comment header, see: Java Source Code Comment Header.

Submit one jar or zip file of one BlueJ project folder containing all challenges, and the video link.

Canvas may not allow two items to be submitted at the same time, so either make two submission, one for files and one for the video, or put a link to the video in the Canvas comments.
