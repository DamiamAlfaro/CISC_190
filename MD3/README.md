Programming Challenges
For these challenges you have complete creative freedom to use GUI or commandline/text for user input.

Flowcharts
Before you start programming: for each programming challenge below, construct a complete flowchart with all decisions and processing in detail with pen & paper or a drawing program. This will help you to think about how to structure the programs.
Please use diamonds for decisions and rectangles for processing; diamonds have two exit arrows, rectangle have one exit arrow.
Submit pictures of your flowcharts before you start writing code.

Programming Challenge MD3-1: Magic 6 BallLinks to an external site.
Create a program that every time it runs, prints out one of six answers (Strings) randomly. The default answer is "Try again;" you pick the other five answers.
You can generate a random number between 0 and 5 by using:
// Import the random number generator class
import java.util.Random;
...
// Generate a random number between 0 and 5 (incl.)
int randomNumber = new Random().nextInt(6);
Think about whether if or switch is better.

Programming Challenge MD3-2: Cell Phone Text Plan
A cell phone company has a texting plan where the first 100 texts are free each month, and every text after that is ¢2. So, if a user sends more than 100 texts the user is charged more than what it costs to simply be on the plan which is $8. Write a program that implements the texting plan.
Example: if the user enters 100, the program prints $8, but if the user enters 120, the program prints $8.40

Programming Challenge MD3-3: Letter Grade
Calculate a grade based on a percentage: 100-90: A, -80: B, -70: C, -60: D, below 60: F.
Example: User enters 89 and the program prints B
Hint: Get program to work for scores 90-100 first, then add the other intervals.
Hint: use else

Programming Challenge MD3-4: Cell Phone Plans
A cell phone company has three plans:
Plan A: $0.09 per minute of talk time, no cost to be on the plan.
Plan B: Plan costs $10 and each minute costs $0.05
Plan C: Plan costs $20 and no per minute cost
Implement a program where a user can input the name of a plan and a number of minutes of talk time and then the program prints out how big the bill is.
If the user enters an invalid plan, for instance D, a friendly error message is printed.
Hints
Think about where if or switch are better. 
Start with creating variables to contain all the information you are given in the challenge: planACostPerMinute, planBFixedCost, planBCostPerMinute, etc.. Make them final so you do not accidentally change them.
Then create variables for the user's inputs.
From that calculate totalCost in a conditional statement, based on the above variables.
Then output the total cost for the selected package.
Take into account that users may enter "a" or "A", or none of "A", "B", or "C" Hint: use default
Start by implementing plan A, test it and make sure it works correct. Then move on to other packages.

Directions
Create one class for each assignment within one BlueJ project. Each class is to have a public static main method.

As always in the class, start each file with the mandatory code comment header, see: Java Source Code Comment Header.
Write a meaningful comment for each line of code within a method, including variable declarations, but not { or } lines, and for each class explaining what it does. The comments are there for you to ensure that you understand your program.
For variable declarations, describe what the variable is going to be used for and possible what it is initialized to.
For executable statements, describe what the line accomplishes.

Submit:

pictures of the four flowcharts
a screenshot for each program
one jar file of one single BlueJ project with all classes in it (see module 1 on how to check the contents of the jar file)
