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
 * Version: November 23, 2025
 */ 

// MD13: Import the color functionality from awt
import java.awt.Color;


public class Car {

    // private variables for each of the car classes
    // car has a year model
    private int yearModel;
    
    // A car has a make type
    private String make;
    
    // a car has a speed value
    private double speed;
    
    // MD13: Let's change the aesthetics of this GUI by adding a color
    // car has a color
    private Color color;

    // constructor that initiates the class Car when called with inhereted variables
    // MD13: Add the color as a new inhereted variable in the constructor
    public Car(int yearModel, String make, Color color) {
        
        // the three private variables from the top being used within the constructor
        // car has a year model assigned in constructor
        this.yearModel = yearModel;
        
        // car has a make assigned in constructor
        this.make = make;
        
        // car has a speed assigned in constructor, starting at 0
        this.speed = 0; 
        
        // MD13: add the color, a car has a color
        this.color = color;
    }

    // Accessor for year model private variable above
    public int getYearModel() {
        return yearModel;
    }

    // Accessor for make private variable above
    public String getMake() {
        return make;
    }

    // Accessor for speed private variable above
    public double getSpeed() {
        return speed;
    }

    // method for acceleration, increasing the speed by 12 mph
    public void accelerate() {
        
        // MD13: Prevent the car from going faster than 55.
        // Keep the speed at 55 if we are at 55 mph limit
        if (speed + 12 > 55) {
           speed = 55; 
           
        // else, keep speeding up
        } else {
            speed += 12;
        }
        
    }
    
    // MD13: Add an accessor and mutator to the Car class (simple getter and setter, do not use an GUI elements)
    public Color getColor() {
        return color;
    }
    
    // MD13: Mutator
    public void setColor(Color color) {
        this.color = color;
    }

    
    // method for breaking, decreasing the speed by 6 mph
    public void brake() {
        speed -= 6;
        
        //MD13: Prevent the car from going backwards when breaking
        if (speed < 0) speed = 0;
    }
}
