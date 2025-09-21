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
 * Version: September 21, 2025
 */ 
// Import necessary Packages
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Create the class
public class ReadingAndPrintingFile {
    
    // Use IOException in order to avoid errors and indicated in the canvas module
    public static void main(String[] args) throws IOException {
        // Assign the variable for the file to read
        String fileToRead = "TheRiceAndChessStoryFirstProgram.java";
        
        // Creates an instance of BufferedReader in order to access the file
        BufferedReader reader = new BufferedReader(new FileReader(fileToRead));

        // Assign a variable of an empty string to add to it as the while loop progresses
        String initialLineSentence;
        
        // Assign a variable to mark the outset of the reading process within the while loop
        int currentLineNumber = 1;

        // Using a while loop, and the instance of BufferReader, print each of the lines of the file
        // until the end of the file is reached
        while ((initialLineSentence = reader.readLine()) != null) {
            
            // As indicated in the canvas module, allocate the line number and a colon to each
            // line of the file and print it without indentation
            System.out.println(currentLineNumber + ": " + initialLineSentence);
            
            // Iterate to the next sentence
            currentLineNumber++;
        }

        // Stop the program
        reader.close();
        
        

        

    }
}
    
