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

// Import the functionality of serialization
import java.io.Serializable;

// Create a class called GameScore which has-a player name and game score for that player.
public class GameScore implements Serializable {

    // Assign the variables needed
    private String playerName;
    private int score;         

    // Implement a constructor that takes a GameScores array.
    public GameScore(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;
    }
    
    // Implement toString in Scoreboard to return the GameScores as a String. Hint: See the Lottery challenge.
    public String getPlayerName() { return playerName; }
    public int getScore() { return score; }

    // Implement toString in GameScore to return the player name and score as a String.
    @Override
    public String toString() {
        return playerName + ": " + score;
    }
}
