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

// import necessary packages
import java.awt.event.*;

// Implement the ActionListeners for the buttons
public class AccelerateListener implements ActionListener {
    
    // variables for each of the classes
    private CarView view;
    private Car car;

    // action listener
    public AccelerateListener(CarView view, Car car) {
        this.view = view;
        this.car = car;
    }

    // each time an action is performed
    @Override
    public void actionPerformed(ActionEvent e) {
        car.accelerate();
        view.updateSpeedDisplay();
    }
}

