/** 
 * Lead Author(s): 
 * Damiam Alfaro; dalfaro@student.sdccd.edu 
 * <<Add additional lead authors here>> 
 * 
 * Other Contributors: 
 * Full name; student ID or contact information if not in class 
 * <<Add additional contributors (mentors, tutors, friends) here, with contact information>> 
 * 
 * References: 
 * Gaddis, T. (2023). Starting out with Java: From control structures through objects. Pearson. 
 * <<Add more references here>> 
 * 
 * Version: November 16, 2025
 */ 

// Write a class named Car
public class Car {

    //yearModel. The yearModel field is an integer that holds the car’s model year.
    //make. The make field references a String object that holds the make of the car.
    //speed. The speed field is an double that holds the car’s current speed.
    private int yearModel;
    private String make;
    private double speed;

    // Constructor. The constructor should accept the car’s year model and make as arguments. 
    // These values should be assigned to the object’s modelYear and make fields. 
    // The constructor should also assign 0 to the speed field.
    public Car(int yearModel, String make) {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0;
    }

    // Appropriate accessor methods should get the values stored in an object’s modelYear, make, and speed fields.
    public int getYearModel() {
        return yearModel;
    }
    
    // Appropriate accessor methods should get the values stored in an object’s modelYear, make, and speed fields.
    public String getMake() {
        return make;
    }

    // Appropriate accessor methods should get the values stored in an object’s modelYear, make, and speed fields.
    public double getSpeed() {
        return speed;
    }

    // Create a method called accelerate. The accelerate method should add 12 to the speed each time it is called.
    public void accelerate() {
        speed += 12;
    }

    // Create a method called brake. The brake method should subtract 6 from the speed each time it is called.
    public void brake() {
        speed -= 6;
        if (speed < 0) speed = 0; // prevent negative speed
    }
}

