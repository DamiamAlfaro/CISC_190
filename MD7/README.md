Programming Challenges
Use the recipe from the beginning for the following challenges. I also recommend drawing a flowchart for the methods so you have clear idea of how to structure the loops.

Submit a video showing how you test the methods using all the examples from the recipe for all methods, except main. Do not show code or the challenge, just the exercising of methods. When you test your examples and you see a bent arrow, click on it or the Inspect button to see what the arrow points to.

Java String documentation is available here: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.htmlLinks to an external site.

Programming Challenge MD8-1: Palindrome
Using the recipe, write a method that given a String, returns the String backwards.
Technical implementation: use a loop (or recursion)
Hint: Use StringLinks to an external site.'s toCharArrayLinks to an external site., charAtLinks to an external site., substringLinks to an external site. or similar
Using the recipe, write a method that given a String, returns true if the String is a palindrome; see https://en.wikipedia.org/wiki/PalindromeLinks to an external site.
For instance: isPalindrome("X") and isPalindrome("racecar") should return true; isPalindrome("no") should return false.
Hint: Use your implementation of backward string; then it can be done in a single line: return ...equals...

Programming Challenge MD8-2: Name Capitalizer
Using the recipe, write a method that given a String, returns a String where each word has the first character capitalized.
For instance, if the input String is "john doe", the output will be "John Doe", for "n", the output will be "N", for "" (the empty string), the output will be "" (make sure this works!)
Note: it is the character after a space that is capitalized, in addition to the first character.
Hint: Use Character's toUpperCase()
Hint: When you test your examples and you see a bent arrow, click on it or the Inspect button to see what the arrow points to.
Programming Challenge MD8-3: Strong Password Validator
Write a program that lets a user input a potential password and if the password lives up to certain criteria allows the password; otherwise informs the user which criteria was not fulfilled. The three criteria are:
Password must be at least five characters long
Password must contain at least one uppercase letter
Password must contain at least two digits
Technical implementation:
Using the recipe, write a method that given a String, returns true if the String is at least five characters log.
Hint: can be done in a single line: return ...>=...
Using the recipe, write a method that given a String, returns true if the String contains at least one uppercase letter.
Using the recipe, write a method that given a String, returns true if the String contains at least two digits.
Write a main method that inputs a String from a user and prints out which, if any, criteria was violated.
Hint: create a method for each of the three criteria, that return true or false depending on whether the password meets the criteria or not.
For instance: boolean containsACapitalLetter(String ...).
Do not use regular expressions as we have not covered them in this class.
 

Directions
Be sure to use the recipe.

As always in the class, start each file with the mandatory code comment header, see: Java Source Code Comment Header. 

Submit one jar file of one BlueJ project and a link to the video.

 

Some assignments inspired by: Gaddis, T. (2015). Starting Out With Java Myprogramming Lab  From Control Structures Through Objects. (6th ed.). Addison-Wesley.  
