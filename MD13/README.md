Based on last week's work:

Be sure to rework your code from last week if you received feedback before you continue
Refactor Links to an external site.your code to have (if you have not already):
One Car class implementing the car and all its features, in a separate file.
One CarView class implementing the GUI, in a separate file.
The CarView should be started in a static main with new CarView(new Car(...));
Rewrite the UI to use a GridLayout arranged in two columns.
Hint: in CarView use pack() to layout and resize the window, instead of setSize(...).
Make text fields read-only.
Prevent the car from going faster than 55.
Hint: this is a feature of the car so implement the change in the Car class.
Prevent the car from going backwards when breaking.
Show the speed on a slider with a range of 0 to 100, instead or in addition to a text field.
Add a color field:
Use Color from the java.awt package
Add an accessor and mutator to the Car class (simple getter and setter, do not use an GUI elements)
Change the static main should contain:
new CarView(new Car(..., ..., Color.RED));
Create a button where you can select the car's color, and show the color on a label.
Hint: use a JColorChooser. The color chooser should start by showing the car's current color.
Create a menu with an Exit item that shuts down the program.
Extra/Optional: Put images on the buttons.
Feel free to create your own images or find some online. Be sure to include the images in the BlueJ project by copying them to the project folder.
Write one comment for each line of code within a method (not { or } lines), for each method and for each class.
We have reached the level where programs are becoming so big that indentation and comments are important. Correct consistent indentation is necessary to read the code, and meaningful comments are needed in order to understand how the programs work. Therefore, inconsistent indentation or insufficient comments will result in zero points being awarded.

Include and fill in the usual required code header.

Submit a jar file of the entire BlueJ project folder, including graphics files, and a screenshot of the application running.

