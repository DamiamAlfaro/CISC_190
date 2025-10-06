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

public class numberArrays {
    
    // Purpose: Count the length of an array
    // Input/output: input array, return length of array
    // Examples:
    // getCount({1, 5, 19, 2}) return 4
    // getCount({}) return 0
    public static int getCount(int[] array) {
        
        // Return the length of the array using the .length property from chapter 7 examples
        return array.length;
        
    }
    
    // Purpose: Count the length of an array
    // Input/output: input array, return the index of the highest number within the array
    // Examples:
    // getHighestIndex({1, 5, 19, 2}) return 2
    // getCount({1}) return 0
    public static int getHighestIndex(int[] array) {
        
        // Use the length of the array as a termination point for the upcoming for loop (just as chapter 7)
        int lengthOfArray = array.length;
        
        // Assign variable for highestNumber used for future reference within the loop
        int highestNumber = array[0];
        
        // Assign variable of the highest index based on the highestNumber
        int highestIndex = 0;
        
        // Loop through the array 
        for (int index = 0; index < lengthOfArray; index++) {
            
            // If the number is higher than the previous number in the array...
            if (array[index] > highestNumber) {
                
                // ...assign the varibale to the new highest number and ...
                highestNumber = array[index];
                
                // ...assign the variable to the new highest index
                highestIndex = index;
            }
            
        }
        
        // Return the highest index after the loop ends
        return highestIndex;
    }
    
    // Purpose: Get last element of an array
    // Input/output: input array, return last element of an array
    // Examples:
    // getLastElement({1, 5, 19, 2}) return 2
    // getLastElement({1, 8}) return 8
    public static int getLastElement(int[] array) {
        
        // Assign a variable for the last index base on the array's length
        int lastElementIndex = array.length - 1;     
        
        // Return the array based on the last index
        return array[lastElementIndex];
    
    }

    // Purpose: Add the sum of the elements of an array
    // Input/output: input array, return sum of elements
    // Examples:
    // calculateSum({1, 5, 19, 2}) return 27
    // calculateSum({1, 8}) return 9
    public static int calculateSum(int[] array) {
        
        // Assign variable to the number that we will keep adding to, initially
        // zero as no numbers have been added
        int sumOfElements = 0;
        
        // Loop through the array and ...
        for (int index = 0; index < array.length; index++) {
            
            // ... add the element number to the sum of elements. Do it
            // until the end of the loop, or in other words, throughout
            // the length of the array
            sumOfElements += array[index];
            
        }
        
        // Return sum of elements
        return sumOfElements;
    }
    
    // Purpose: Calculate the average of the elements in an array
    // Input/output: input array, return average of elements
    // Examples:
    // calculateAverage({1, 5, 19, 2}) return 6.75
    // calculateAverage({1, 8}) return 4.5
    public static double calculateAverage(int[] array) {
        
        // Assign variable to the number that we will keep adding to, initially
        // zero as no numbers have been added
        double sumOfElements = 0;
        
        // Loop through the array and ...
        for (int index = 0; index < array.length; index++) {
            
            // ... add the element number to the sum of elements. Do it
            // until the end of the loop, or in other words, throughout
            // the length of the array
            sumOfElements += array[index];
            
        }
        
        // Once you have the sum, divide by the total number
        // of elements, or in other words, the array's lenght
        double averageOfElements = sumOfElements / array.length;
        
        // Return sum of elements
        return averageOfElements;
    }
    
    // Purpose: Find maximum element number in an array
    // Input/output: input array, return maximum element number
    // Examples:
    // findMaximum({1, 5, 19, 2}) return 19
    // findMaximum({1, 8}) return 8
    public static int findMaximum(int[] array) {
        
        // Use the length of the array as a termination point for the upcoming for loop (just as chapter 7)
        int lengthOfArray = array.length;
        
        // Assign variable for maximum used for future reference within the loop
        int maximum = array[0];
        
        // Loop through the array 
        for (int index = 0; index < lengthOfArray; index++) {
            
            // If the number is higher than the previous number in the array...
            if (array[index] > maximum) {
                
                // ...assign the varibale to the new maximum number
                maximum = array[index];

            }
            
        }
        
        // Return the maximum number after the loop ends
        return maximum;
    }
    
    // Purpose: Find minimum element number in an array
    // Input/output: input array, return minimum element number
    // Examples:
    // findMinimum({1, 5, 19, 2}) return 1
    // findMinimum({3, 8, 7}) return 3
    public static int findMinimum(int[] array) {
        
        // Use the length of the array as a termination point for the upcoming for loop (just as chapter 7)
        int lengthOfArray = array.length;
        
        // Assign variable for minimum used for future reference within the loop
        int minimum = array[0];
        
        // Loop through the array 
        for (int index = 0; index < lengthOfArray; index++) {
            
            // If the number is higher than the previous number in the array...
            if (array[index] < minimum) {
                
                // ...assign the varibale to the new minimum number
                minimum = array[index];

            }
            
        }
        
        // Return the minimum number after the loop ends
        return minimum;
    }
}
    
    
