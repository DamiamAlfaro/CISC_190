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
 * Version: October 5, 2025
 */ 

// Import the random number generator class
import java.util.Random;
import java.util.Scanner;


public class Lottery {
    
    public static void main(String[] args) {
        
        // Generate the winning numbers
        int[] winningNumbers = pickWinningNumbers();
        
        // Get the user's numbers
        int[] userNumbers = inputUserNumbers();

        System.out.println("\nWinning numbers: " + stringify(winningNumbers));
        System.out.println("Your numbers:    " + stringify(userNumbers));
        
        // Check if user is a winner
        boolean winner = isWinner(userNumbers, winningNumbers);
        
        // Print the result
        if (winner) {
            System.out.println("You won. Winning numbers: " + stringify(winningNumbers));
        } else {
            System.out.println("You lost");
        }
    }
    
    // Purpose: Check if a number is within an array
    // Input/output: input array and a number, return boolean value confirming or denying the presense of the number
    // Examples:
    // contain({1, 5, 2}, 2) return true
    // contain({1, 5, 4}, 2) return false
    public static boolean contain(int[] array, int chosenNumber) {
        
        // Get the length of the array to loop in it
        int lengthOfArray = array.length;
        
        // Assign false as default
        boolean numberInArray = false;
        
        // Loop through the array to check if the number is found within
        for (int index = 0; index < lengthOfArray; index++) {
            
            // If the chosen number is within the array... 
            if (chosenNumber == array[index]) {
                
                // ...change the boolean to true
                numberInArray = true;
            }
        }
        
        // Return the array
        return numberInArray;
    }
    
    // Purpose: return an array with 5 unique numbers between 1 and 9
    // Input/output: input none, return array with random numbers
    // Examples:
    // pickWinningNumbers() return {1,2,3,4,5}
    // pickWinningNumbers() return {7,4,3,8,9}
    public static int[] pickWinningNumbers() {
        // Assign variable to array
        int [] chosenNumbers = new int[5];
    
        // Future reference to see the total numbers in the array (a count)
        int totalNumbersInArray = 0; 
        
        // Add random numbers until the length of the array is 5
        while (totalNumbersInArray < chosenNumbers.length) {
            
            // Generate the random number
            int randomNumber = new Random().nextInt(10);
            
            // Boolean to see if a number is within an array
            boolean numberInArray = false;
            
            // Loop through the array to check if a number is repeated therein
            for (int index = 0; index < totalNumbersInArray; index++) {
                
                // If a number is in the array...
                if (chosenNumbers[index] == randomNumber) {
                    
                    // Change the boolean to true
                    numberInArray = true;
                    
                }
            }
            
            // If the number was not in the arrray, add it
            if (!numberInArray) {
                
                // Add the number
                chosenNumbers[totalNumbersInArray] = randomNumber;
                
                // Increate the total numbers (length of array) for reference
                totalNumbersInArray++;
            }
            
        }
        
        // Return the array with numbers
        return chosenNumbers;
        
    }
    
    // Purpose: return an array with user input five numbers
    // Input/output: five numbers, return array with numbers
    // Example: inputUserNumbers() return {7,4,3,8,9}
    // Example: inputUserNumbers() return {1,2,3,4,5}
    public static int[] inputUserNumbers() {
        
        // Scanner to allow user input
        Scanner input = new Scanner(System.in);
        
        // Create the array 
        int[] chosenNumbers = new int[5];
        
        // Future reference to see the total numbers in the array (a count)
        int totalNumbersInArray = 0;

        // Add random numbers until the length of the array is 5
        while (totalNumbersInArray < chosenNumbers.length) {
            
            // Let the user know to choose a number
            System.out.print("Enter a number between 1 and 9: ");
            
            // Allow the user to choose the number
            int userNumber = input.nextInt();

            // Check if the user input a number between 1 and 9 (incl.)
            if (userNumber < 1 || userNumber > 10) {
                System.out.println("Choose between 1-9 (incl.)");
            }

            // Boolean to see if a number is within an array
            boolean numberInArray = false;
            
            // Loop through the array to check if a number is repeated therein
            for (int index = 0; index < totalNumbersInArray; index++) {
                
                // If a number is in the array...
                if (chosenNumbers[index] == userNumber) {
                    
                    // Change the boolean to true
                    numberInArray = true;
                }
            }

            
            // If the number is in the array, let the user know
            if (numberInArray) {
                System.out.println("Number found in array");
                
            // If the number was not in the arrray, add it
            } else {
                chosenNumbers[totalNumbersInArray] = userNumber;
                totalNumbersInArray++;
            }
        }

        // Return the chosen numbers
        return chosenNumbers;
    }

    
    // Purpose: return true if array contain the winning numbers
    // Input/output: input two arrays of five random numbers each, return true or false depending on winner or not
    // Example: isWinner({8, 1, 3, 7, 5}, {8, 3, 5, 7, 9}) return true
    // Example: isWinner({8, 1, 3, 7, 5}, {2, 3, 5, 7, 9}) return false
    public static boolean isWinner(int[] userNumbers, int[] winningNumbers) {

        // Check that every user number exists in the winning array
        for (int index = 0; index < userNumbers.length; index++) {
            
            // Assign variable to the current number
            int firstArrayNumber = userNumbers[index];
            
            // Boolean to indicate whether the number is found in the future
            boolean matchFound = false;

            // Loop in the second array to match numbers
            for (int second_index = 0; second_index < winningNumbers.length; second_index++) {
                
                // If the number from the first array is found un the second...
                if (winningNumbers[second_index] == firstArrayNumber) {
                    
                    // ... change the boolean to true to indicate a match
                    matchFound = true;
                }
            }

            // Check to see if the number was found (= false) to return not a winner
            if (!matchFound) {
                return false;
            }
        }

        // Return the resulting boolean as the winner
        return true;
    }
    
    
    // Purpose: return array in pretty string form
    // Input/output: input array, return array numbers separated by comma
    // Example: stringify({8, 1, 3, 7, 5}) return "8, 1, 3, 7, 5"
    // Example: stringify({2, 3, 5, 7, 9}) return "2, 3, 5, 7, 9"
    public static String stringify(int[] array) {
        
        // If array is empty, return empty string
        if (array.length == 0) {
            return "";
        }
    
        // Assign variable to emtpy string and add the first array element
        String prettyStringForm = "" + array[0];
    
        // Loop through the rest of the array, add the elements and...
        for (int index = 1; index < array.length; index++) {
            
            // ... add strings and separate by commas
            prettyStringForm = prettyStringForm + ", " + array[index];
        }
    
        // Return the pretty string form
        return prettyStringForm;
    }
    
    
    
}
    
    
