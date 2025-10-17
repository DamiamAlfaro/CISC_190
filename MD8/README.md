Programming Challenges
Programming Challenge Md 8-1: Coin
In this challenge we are going to write a class of objects that simulate coins and tossing them.
An instance of the Coin class (hereafter a coin) has-a side up, which can either be "heads" or "tails." When a coin is created, it is randomly assigned a side up by tossing it. Users of the coins can later toss the coin again by calling an method.
Instructions:
Create a class called Coin that has a sideUp private instance variable/field.
Implement an accessor/getter that returns which side is up.
Implement a method to toss the coin. The method should not return anything.
Implement a constructor that tosses the coin when the coin is created.
Hint: create a Coin class and toss the coin (read: call toss method) in the constructor.
To check whether the coin is fair, write a main method that tosses the coin 100 times, adds which side is up each time, and prints out the statistics.

Programming Challenge Md 8-2: Electric Scooter
In this challenge we are going to write an class of objects that simulates how electric scooters work.
An instance of the ElectricScooter class (hereafter a scooter) has-a brand name, has-a color, has-a price per hour and has-a speed. When a scooter is created it is given a brand name and a price per hour, and the speed starts at zero.
A scooter can return the brand name, the price per hour and the speed. It can also accelerate and brake; when it accelerates the speed goes up by 2½ miles per hour, and when it brakes the speed is reduces by 2½ miles per hour.
Technical implementation:
Create a class that has brand name, color, price and speed as private instance variables/fields. Color can be a simple String.
Implement a constructor that takes brand name and price.
Implement an accessor/getter for each instance variable.
Implement a mutator/setter for the color of the scooter - simulating hat scooters can be repainted.
Implement an accelerate method that increases the speed by 2.5 miles per hour. Note: the method should not return anything.
Implement an brake method that decreases the speed by 2.5 miles per hour. Note: the method should not return anything.
Record a three minute (or longer) video.
In the video show how instance of the class works: use the BlueJ tools to as demonstrated in the first part of my video (class and object boxes in the main window of BlueJ) to show:
Create two different scooters with different brands, prices and colors.
Set the colors to something different.
Access the instance variables of the scooters: show that they are different by using the getters.
Use the accelerate method on one scooter, and get the speed of both scooters. Show that only one scooter changes speed, the other should remain the same.
Use the accelerate method on the other scooter, and get the speed of both scooters. Show that only that scooter changes speed, the other should remain the same.
Use the brake method on one of the scooters, and get the speed of both scooters: only one scooter should change speed, the other should remain the same.
Use the brake method on the other scooters, and get the speed of both scooters: only one scooter should change speed, the other should remain the same.
On the video, introduce yourself, then explain each step as you go along.
Use the BlueJ tools, for instance Inspect (the red boxes).
Do not show the source code, just the exercising of methods.
Submit only a link to the video (not a video file).
Do not make your video publicly available (on Youtube or similar).
Please check the audio before you submit; if your voice is cannot be clearly heard, you will have to re-record and resubmit.
 

Write one comment for each line of code within a method (not { or } lines), for each method and for each class

As always in the class, start each file with the mandatory code comment header, see: Java Source Code Comment Header.

Submit one jar file of the entire BlueJ project directory, and the video link.

 
