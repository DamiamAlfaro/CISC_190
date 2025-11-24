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

// Import necessary packages
import javax.swing.*;
import java.awt.*;

// Create a class called CarView that inherits from JFrame and aggregates the following GUI elements:
public class CarView extends JFrame {

    // method to call the Car class
    private Car car;

    // A label and text field showing the modelYear of a car
    // A label and text field showing the make of a car
    // A label and text field showing the speed of a car
    private JLabel modelYearLabel;
    private JLabel makeLabel;
    private JLabel speedLabel;
    private JTextField modelYearField;
    private JTextField makeField;
    private JTextField speedField;

    // A button that accelerates the car and updates the speed field with the new speed
    private JButton accelerateButton;
    
    // A button that brakes the car and updates the speed field with the new speed
    private JButton brakeButton;

    // Main constructor that calls the class itself
    public CarView(Car car) {
        this.car = car;

        // start the class
        modelYearLabel = new JLabel("Model Year:");
        makeLabel = new JLabel("Make:");
        speedLabel = new JLabel("Speed:");

        // assign the text fields
        modelYearField = new JTextField(String.valueOf(car.getYearModel()), 10);
        makeField = new JTextField(car.getMake(), 10);
        speedField = new JTextField(String.valueOf(car.getSpeed()), 10);

        // assign the fields as read only
        modelYearField.setEditable(false);
        makeField.setEditable(false);
        speedField.setEditable(false);

        // assign the buttons
        accelerateButton = new JButton("Accelerate");
        brakeButton = new JButton("Brake");

        // assign a new layout as explained in chapter 12.3 
        setLayout(new GridLayout(4, 2, 10, 10));

        // add the new components
        add(modelYearLabel);
        add(modelYearField);
        add(makeLabel);
        add(makeField);
        add(speedLabel);
        add(speedField);
        add(accelerateButton);
        add(brakeButton);

        // attach listeners for the acceleration button
        accelerateButton.addActionListener(new AccelerateListener(this, car));
        
        // attach listeners for the break button
        brakeButton.addActionListener(new BrakeListener(this, car));

        // assign the frames
        setTitle("Car Speed Controller");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // method to update the speed display
    public void updateSpeedDisplay() {
        speedField.setText(String.valueOf(car.getSpeed()));
    }

    // testing the method
    public static void main(String[] args) {
        new CarView(new Car(2017, "Mitsubishi"));
    }
}

