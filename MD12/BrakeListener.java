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
import java.awt.event.*;

// Implement the ActionListeners for the buttons
public class BrakeListener implements ActionListener {
    
    // variables for each of the classes
    private CarView view;
    private Car car;

    // main method that imports the class
    public BrakeListener(CarView view, Car car) {
        this.view = view;
        this.car = car;
    }

    // action performed method
    @Override
    public void actionPerformed(ActionEvent e) {
        car.brake();
        view.updateSpeedDisplay();
    }
}

