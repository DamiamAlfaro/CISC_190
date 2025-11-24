Copyright Allan Schougaard. All rights reserved.

Write a class named Car that has the following fields:

yearModel. The yearModel field is an integer that holds the car’s model year.
make. The make field references a String object that holds the make of the car.
speed. The speed field is an double that holds the car’s current speed.
In addition, the class should have the following constructor and other methods:

Constructor. The constructor should accept the car’s year model and make as arguments. These values should be assigned to the object’s modelYear and make fields. The constructor should also assign 0 to the speed field.
Accessors. Appropriate accessor methods should get the values stored in an object’s modelYear, make, and speed fields.
Create a method called accelerate. The accelerate method should add 12 to the speed each time it is called.
Create a method called brake. The brake method should subtract 6 from the speed each time it is called.
2. Create a class called CarView that inherits from JFrame and aggregates the following GUI elements:

A label and text field showing the modelYear of a car
A label and text field showing the make of a car
A label and text field showing the speed of a car
A button that accelerates the car and updates the speed field with the new speed
A button that brakes the car and updates the speed field with the new speed
Give each GUI widget a meaningful name, such as modelYearLabel and modelYearField.
Implement the GUI in a separate class called CarView which takes a car in it's constructor and holds the car in an instance variable.  The CarView should be started in a static main with:

new CarView(new Car(...));

Implement the ActionListeners for the buttons either as separate public classes or as anonymous inner classes (see chapter 10 section 10). Use setTextLinks to an external site. to update the contents of the text fields. Do not use ActionEvents; they make the program difficult to understand.

You class structure may look like this:

CarViewLIsteners.png

 

As always in the class, start each file with the mandatory code comment header, see: Java Source Code Comment Header.

Submit a jar file of the entire project directory and a screenshot of the application running.

