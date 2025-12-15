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

// A TREASURE GAME CLASS TO IMPLEMENT AN ACTION LISTENER FOR TROLL BUTTONS
public class TrollButtonListener implements ActionListener {

    // A TREASURE GAME HAS A VARIABLE FOR THE GAME ITSELF
    private TreasureGame game;

    // A TREASURE GAME HAS A VARIABLE FOR THE TROLL BUTTON
    private TrollButton button;

    // A TREASURE GAME CONSTRUCTOR TO STORE LISTENER FOR EACH TROLL BUTTON INSTANCE
    public TrollButtonListener(TreasureGame game, TrollButton button) {
        this.game = game;
        this.button = button;
    }

    // A TREASURE GAME HAS A CONSTRUCTOR FOR EACH ACTION PERFORMED
    @Override
    public void actionPerformed(ActionEvent e) {

        // A TREASURE GAME HAS AN ACTION TO END THE GAME IF IT IS ALREADY OVER
        if (game.isGameOver()) {
            return;
        }

        // A TREASURE GAME HAS AN ACTION TO IGNORE ALREADY CLICKED BUTTONS
        if (button.hasBeenClicked()) {
            return;
        }

        // A TREASURE GAME HAS AN ACTION TO REVEAL THE TROLL
        button.reveal();

        // A TREASURE GAME HAS AN ACTION TO REDUCE THE NUMBER OF TRIES
        game.reduceNumberOfTries();

        // A TREASURE GAME HAS AN ACTION TO REMOVE ALL TREASURE PROGRESS
        game.foundTroll();
    }
}
