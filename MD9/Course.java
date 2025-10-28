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

// The Course class represents a college course that has a title, a CRN, and a list of enrolled students.
// Declared public so that it can be accessed by other classes such as College or Main.
public class Course {
    
    // A Course has a title
    private String classTitle;
    
    // A Course has a CRN (Course Reference Number)
    // Stored as a String to preserve any leading zeros
    private String classCRN;
    
    // A Course has an array of Students who are enrolled in it
    private Student[] students;
    
    // A Course has a count of how many students are currently enrolled
    private int studentsEnrolled;
    
    // A Course has a constructor that initializes its title and CRN
    public Course(String classTitle, String classCRN) {
        
        // The constructor assigns the provided values to the Course’s attributes
        this.classTitle = classTitle;
        this.classCRN = classCRN;
        
        // A Course has an initial list (array) of up to 10 Students
        // It also starts with zero students enrolled
        this.students = new Student[10];
        this.studentsEnrolled = 0;
    }
    
    // A Course can add a Student to its list of enrolled Students
    public void addStudentToClass(Student student) {
        students[studentsEnrolled] = student;
        studentsEnrolled++;
    }
    
    // A Course can return the number of Students currently enrolled
    public int returnStudentsEnrolled() {
        return studentsEnrolled;
    }
    
    // A Course has a string representation that includes its title, CRN, and total enrollment
    public String toString() {
        return classTitle + " " + classCRN + " " + "Total Students: " + returnStudentsEnrolled();
    }
    
    // A Course can print a detailed report of its information and enrolled Students
    public void report() {
        
        // Print the Course title and CRN
        System.out.println("Course Title: " + classTitle);
        System.out.println("Course CRN: " + classCRN);
        System.out.println("Total students enrolled: " + studentsEnrolled);
        
        // Print each Student’s information
        for (int index = 0; index < studentsEnrolled; index++) {
            System.out.println(students[index].toString());
        }
    }
}
