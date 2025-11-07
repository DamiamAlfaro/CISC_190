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
 * Version: November 9, 2025
 */ 

import java.io.Serializable;
import java.util.Arrays;

// Create a class called Scoreboard that has-many GameScores.

public class Scoreboard implements Serializable {

    // Implement a constructor that takes a GameScores array.

    private GameScore[] scores; // has-many GameScores

    // Implement a constructor that takes a GameScores array.
    public Scoreboard(GameScore[] scores) {
        this.scores = scores;
    }

    // Implement a constructor that takes a GameScores array.
    public GameScore[] getScores() { return scores; }

    // Implement toString in Scoreboard to return the GameScores as a String. Hint: See the Lottery challenge.

    @Override
    public String toString() {
        return Arrays.toString(scores);
    }
}
