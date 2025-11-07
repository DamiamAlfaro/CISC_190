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

// Import the entire pacakge
import java.io.*;

// Start the class
public class ScoreboardManager {

    // Name the final
    private static final String FILENAME = "scoreboard.ser";

    //  Create method save functionality 
    public static void save() {
        
        // Creates a Scoreboard with five GameScores.
        GameScore[] players = {
            
            //Prints out the name of each player with their score.
            new GameScore("Alice", 120),
            new GameScore("Bob", 150),
            new GameScore("Carol", 180),
            new GameScore("Dave", 90),
            new GameScore("Eve", 200)
        };

        Scoreboard board = new Scoreboard(players);

        System.out.println("Saving scoreboard...");
        System.out.println(board);

        // Saves the Scoreboard to disk using Serialization.
        // Prevents the program from crashing by placing the serialization in a try...catch-block.
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            out.writeObject(board);
            System.out.println("Scoreboard saved to disk successfully.\n");
        } catch (IOException e) {
            System.out.println("Error saving scoreboard: " + e.getMessage());
        }
    }

    // Reads in a file created with the save method.
    public static void load() {
        
        // Prevents the program from crashing by placing the deserialization in a try...catch-block.
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILENAME))) {
            Scoreboard board = (Scoreboard) in.readObject();
            System.out.println("Loaded scoreboard:");
            System.out.println(board);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading scoreboard: " + e.getMessage());
        }
    }

    // Prints out the name of each player with their score.
    public static void main(String[] args) {
        save();
        load();
    }
}
