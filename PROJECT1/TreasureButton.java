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

import java.awt.*;

// A treasure game class to implement the buttons containing treasures
public class TreasureButton extends EmptyButton {

    // A treasure game constructor to keep the initial apparence of a button
    public TreasureButton() {
        super();
        // Keep the same initial appearance as EmptyButton (e.g. "?")
    }

    // A treasure game constructor to reveal the treasure if indeed the button in question
    // contains a treasure
    @Override
    public void reveal() {
        if (!hasBeenClicked()) {
            setText("$");
            setFont(new Font("SansSerif", Font.BOLD, 22));
            setForeground(Color.BLACK);
            setEnabled(false);
        }
    }


    // A treasure game constructor to turn true if the button has a treasure
    @Override
    public boolean isTreasure() {
        return true;
    }
}
