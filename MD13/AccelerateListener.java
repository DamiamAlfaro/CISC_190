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

// This class will be used to execute an event in the CarView GUI, an action listener that
// will display the acceleration functionality. We will import this listener into CarView
// later on.
import java.awt.event.*;

public class AccelerateListener implements ActionListener {

    // We will be using the class car for functionality and the
    // class CarView for display, GUI display
    // an actionListener has a CarView and Car class instance
    private CarView view;
    private Car car;

    // Implement a method to execute the functionality to the called Car and
    // CarView class; the following method will be the method imported into the CarView
    public AccelerateListener(CarView view, Car car) {
        this.view = view;
        this.car = car;
    }

    // Actually execute the functionality, not only import it, and in order to execute it we need
    // to utilize the accelerate() functionality from Car class and the updateSpeedDisplay()
    // functionality from CarView class
    @Override
    public void actionPerformed(ActionEvent e) {
        car.accelerate();
        view.updateSpeedDisplay();
    }
}
