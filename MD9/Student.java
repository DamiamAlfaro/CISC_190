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
 * Version: October 26, 2025
 */ 

// The Student class represents a student entity within a college system.
// It is declared public so that it can be accessed by other classes.
public class Student {
    
    // A Student has a first name and a last name
    private String firstName;
    private String lastName;
    
    // A Student has a CSID number
    // CSID is stored as a String to preserve leading zeros in the ID
    private String CSID;
    
    // A Student has a constructor that initializes their first name, last name, and CSID number
    public Student(String firstName, String lastName, String CSID) {
        
        // The constructor assigns the provided values to the Student’s attributes
        this.firstName = firstName;
        this.lastName = lastName;
        this.CSID = CSID;
    }
    
    // A Student has the ability to return their full name
    public String combineNames() {
        return firstName + " " + lastName;
    }
    
    // A Student has the ability to return their CSID number
    public String returnCSID() {
        return CSID;
    }
    
    // A Student has a string representation that includes their full name and CSID
    public String toString() {
        
        // Uses combineNames() to get the full name, then appends the CSID in brackets
        return combineNames() + " [" + CSID + "]";
    }
}
