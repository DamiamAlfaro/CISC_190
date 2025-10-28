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

// The main method that demonstrates the functionality of each of the classes above
public class Main {
    
    // Test the classes using the void main functionality per Canvas instructions
    public static void main(String[] args) {
        
        // 1. Create “San Diego Favorite College” with an address that you decide.
        College college = new College("San Diego Mesa College", "123 Street, San Diego, CA");

        // 2. Create course “Java Programming” with a CRN that you decide.
        Course javaProgrammingCourse = new Course("CISC 190 - Java Programming", "10562");
        
        // 3. Add the Java Programming class to the college.
        college.addCourseToCollege(javaProgrammingCourse);
        
        // 4. Create class “Introduction to Computer Science”
        Course computerScienceCourse = new Course("Introduction to Computer Science", "12345");
        
        // 5. Add the computer science class to the college.
        college.addCourseToCollege(javaProgrammingCourse);
        
        // 6. Create yourself as a student.
        Student damiamAlfaro = new Student("Damiam", "Alfaro", "0005736649");
        
        // 7. Add yourself to the Java Programming course.
        javaProgrammingCourse.addStudentToClass(damiamAlfaro);
        
        // 8. Create Lisa Simpson as a student.
        Student lisaSimpson = new Student("Lisa", "Simpson", "0001233345");
        
        // 9. Add Lisa Simpson to the Java Programming course.
        javaProgrammingCourse.addStudentToClass(lisaSimpson);
        
        // 10. Create Bart Simpson as a student.
        Student bartSimpson = new Student("Bart", "Simpson", "0001243445");

        // 11. Add Bart Simpson to the Computer Science course.
        computerScienceCourse.addStudentToClass(bartSimpson);
        
        // 12. Add yourself to the Computer Science course.
        computerScienceCourse.addStudentToClass(damiamAlfaro);
        
        // 13. Create a "COBOL Programming" course
        Course cobolProgrammingCourse = new Course("COBOL Programming Course", "10111");
        
        // 14 Add the COBOL course to the college.
        college.addCourseToCollege(cobolProgrammingCourse);
        
        // 15. Print a report of each course.
        javaProgrammingCourse.report();
        computerScienceCourse.report();
        cobolProgrammingCourse.report();

        // 16 Print a report of the college.
        college.collegeReport();
    }
}