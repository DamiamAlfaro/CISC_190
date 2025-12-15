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
 * Version: December 14, 2025
 */

import java.awt.*;

// A TREASURE GAME CLASS TO IMPLEMENT THE BUTTONS CONTAINING TROLLS
public class TrollButton extends EmptyButton {

    // A TREASURE GAME CONSTRUCTOR TO KEEP THE INITIAL APPEARANCE OF A TROLL BUTTON
    public TrollButton() {
        super();
    }

    // A TREASURE GAME CONSTRUCTOR TO REVEAL THE TROLL WHEN THE BUTTON IS CLICKED
    @Override
    public void reveal() {
        if (!hasBeenClicked()) {
            setText("T");
            setFont(new Font("SansSerif", Font.BOLD, 22));
            setBackground(Color.PINK);
            setEnabled(false);

            // NEW CODE: MARK THE TROLL BUTTON AS CLICKED
            markClicked();
        }
    }

    // A TREASURE GAME CONSTRUCTOR TO INDICATE THIS BUTTON IS A TROLL
    @Override
    public boolean isTroll() {
        return true;
    }
}
