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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// A treasure game class to implement an action listener for the main classes
public class TreasureButtonListener implements ActionListener {

    // A treasure game has a variable for the game itself
    private TreasureGame game;
    
    // A treasure game has a variable for the empty button
    private TreasureButton button;

    // A treasure game has a constructor to store listener for each game instance
    public TreasureButtonListener(TreasureGame game, TreasureButton button) {
        this.game = game;
        this.button = button;
    }

    // A treasure game has a constructor for each action performed
    @Override
    public void actionPerformed(ActionEvent e) {
        
        // A treasure game has an action to end the game
        if (game.isGameOver()) {
            return;
        }

        // A treasure game has an action to return the status of a button
        if (button.hasBeenClicked()) {
            // Already clicked, do nothing
            return;
        }

        // A treasure game has an action to reveal the button
        button.reveal();
        game.reduceNumberOfTries();
        game.foundTreasure();
    }
}