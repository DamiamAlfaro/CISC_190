This is a project in Object Oriented Programming so please use object-oriented strategies when implementing the program; see Technical Implementation.

The Treasure Hunt Game
This is a simple game of finding treasures on a board. Below is low-fidelity mock-up of what the game can look like.

Tresure Hunt Game MockupTreasureHuntGame.PNG 

Implement the user stories below one at a time in the order given.

Week 1

Game Features

Create UI similar to the illustration
The treasure field is 5 by 5 locations
Each location can be clicked to reveal
A treasure, or
Nothing
Use fonts, color, images etc. to make the game look interesting
Treasures Left shows the number of treasures left on the board starting with 10
Treasures Found shows the number of treasures the user has found
Tries Left shows the number of clicks on the board the user has left
Counting each field only once
The game starts with 20 tries available
 

User Stories

 

As a user, I can see the title of game so that I know what I will be playing.
As a player, I can see a board of 5 by 5 locations where I can click, so that I can play the game.
As a player, when I click on a location it visually changes so I can see where I have already clicked.
As a player, when I click on a location that I have already clicked, nothing happens.
As a player, when I click on a location on the board, the Tries Left is reduced by one, so that I know how many tries I have left. I have 20 tries in a game.
As a player, I can see how many treasures that are hidden on the board, starting at 10, so that I know how far away from winning I am.
As a player, when I click on a location on the board, the appearance of the location changes so that I can see if there was a treasure randomly placed at the location.
As a player, when I click on a location on the board where there is a treasure, the Treasures Left is reduced by one, and the Treasures Found is increased by one , so that I can see how successful I have been so far.
As a player, when I have no more tries left, clicking on the board locations does nothing.
As a player, when I have no more tries left, I can see where all the treasures are on the board.
 

Technical Implementation

Follow these instructions to complete the game:

Implement each story one at a time in the order given.
Comment each method with at least a purpose comment, see the Recipe.
Use a border layout for the main window (or another layout that allows the design above).
Use a grid layout for the board and a for-loop to populate the board.
Extend the JButton class to create a EmptyButton class instances of which are the contents of the board
Set the default icon or text for an unclicked button in the constructor
Implement a reveal() method that changes the button to how it would look after it has been clicked (including disable future clicks).
Create a EmptyButtonListener by implementing the ActionListener interface. Have it contain a reference to the button it is a listener for, so this will work:
emptyButton.addActionListener(new EmptyButtonListener(...));
Have the listener have a reference to the button and to the game as instance variables, and pass them in in the constructor.
Use it to disable button when it is clicked.
Use it change how the button looks when it is clicked.
Extend the EmptyButton class to create a TreasureButton class instances of which are on the board
As you create the buttons, keep them in an array so that you can easily access them later.
Create a TreasureButtonListener by implementing the ActionListener interface.
Use it to change how the button looks when it is clicked.
One example of an algorithm for placing treasures randomly is:
Create an array to hold all EmptyButtons and TreasureButtons at the same time.
Then place 20 TreasureButtons randomly in the array;
if buttons[location] != null then create a new location and try again (a loop).
Then place EmptyButtons in all the locations where button[location] == null.
Have the TreasureGame implement the following methods which can be called from the listeners:
public void reduceNumberOfTries()
public void foundTreasure()
public void foundNothing()
public boolean isGameOver()
public endGame()
which updates the counters, text fields and buttons, and disables buttons when the game is over.
The main method should simply contain:
new TreasureGame().play();
All named classes must be in separate files.
All instance variables must be private.
Do not use getSource(), instanceof,  continue or break, except inside of switch statements.
Keep the code tidy with comments and indentation.
 

Documentation to Submit

Submit one jar file with the entire project folder. Be sure to include all comments and to indent consistently as you will not be able to resubmit after the deadline.
Also either: Write a user's guide document to the game, including screenshots of the game in play.
Or: Produce a 2-3 minute video demonstrating each of the user stories. (Do not submit a file, only submit a link to your video)
As always in the class, start each file with the mandatory code comment header, see: Java Source Code Comment Header.

Note: the deadline is a deadline!
