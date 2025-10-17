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
 * Version: October 19, 2025
 */ 

// Import the necessary packages
import java.util.Random;

// Create a class for the Coin Toss functionality
class Coin {
    
    // The private instance variable/field that will store the side of the coin
    private String sideUp;
    
    // Assign the access constructor of the object within the class in order to be initialized
    public Coin() {
        
        // When the object is created in the future, it will automatically toss the coin using the other object
        toss();
        
    }
    
    // Assign another object that tosses the coin
    public void toss() {
        
        // Assign a variable to generate either 0 (heads) or 1 (tails)
        int randomNumber = new Random().nextInt(2);
        
        // Check the result with an if statement, if it is 0...
        if (randomNumber == 0) {
            
            // this is used to reference the current object we are working with, in this case sideUp, we assign "Heads" if random number is 0
            this.sideUp = "Heads";
        } else {
            
            // this is used to reference the current object we are working with, in this case sideUp, we assign "Tails" if random number is 1
            this.sideUp = "Tails";
        }
    }
    
    // Assign an accessor to get the sideUp string publicly
    public String getSideUp() {
        
        // return the current object's side (current state of sideUp)
        return this.sideUp;
    }
}

// Now create the class to check the tosses statistics
public class coinTossStatistics {
    
    // Since we are going to output results, we just need a static void main
    public static void main(String[] args) {
        
        // Declare a variable Coin to create a new object instance of the class Coin, which runs toss() in it
        Coin myCoin = new Coin();
        
        // Assign varibales to the total head count
        int totalHeadCount = 0;
        
        // Assign variable to the total tail count
        int totalTailCount = 0;
        
        // Produce 100 tosses of the coin using the class Coin() and a for loop with limit of a 100
        for (int index = 0; index < 100; index++) {
            
            // Call the object that tosses the coin itself
            myCoin.toss();
            
            // Once tossed, using the accessor (getter), get the sideUp using getSideUp accessor from the class Coin()
            String sideOfTheCoin = myCoin.getSideUp();
            
            // Check if it is head or heads, and add to the respective count
            if (sideOfTheCoin.equals("Heads")) {
                
                // Increase the count
                totalHeadCount += 1;
                
            } else {
                
                // Increase the count
                totalTailCount += 1;
            }
        }
        
        System.out.println("Total Heads " + totalHeadCount);
        System.out.println("Total Tails " + totalTailCount);

        
    }
    
}

