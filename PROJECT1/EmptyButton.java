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
 * Version: December 7, 2025
 */ 

import javax.swing.*;
import java.awt.*;

// A treasure game empty button class
public class EmptyButton extends JButton {

    // A treasure game has a boolean to indicate if a button is clicked
    private boolean clicked;

    // A treasure game has an empty button constructor to indicate the status of eahc button
    public EmptyButton() {
        super("?");
        this.clicked = false;

        setFont(new Font("SansSerif", Font.BOLD, 18));
        setBackground(Color.LIGHT_GRAY);
        setFocusPainted(false);
    }

    // A treasure game has a constructor to indicate the button reveal when clicked
    public void reveal() {
        if (!clicked) {
            clicked = true;
            setText("O");
            setFont(new Font("SansSerif", Font.BOLD, 22));
            setEnabled(false);
        }
    }


    // A treasure game has a consstructor to check if a button is a treasure
    public boolean isTreasure() {
        return false;
    }

    // A treasure game has a constructor to check if a button has been clicked
    public boolean hasBeenClicked() {
        return clicked;
    }
}
