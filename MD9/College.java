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

// "public" class because this class has to be visible to other public classes on 
// other files
public class College {
    
    // A College has a name and an address
    private String collegeName;
    private String collegeAddress;
    
    // A College has an array of Courses
    private Course[] collegeCourses;
    
    // A College has a count of how many Courses are currently running
    private int courceCount;
    
    public College(String collegeName, String collegeAddress) {
        this.collegeName = collegeName;
        this.collegeAddress = collegeAddress;
        
        // A College starts with space for 10 Courses
        this.collegeCourses = new Course[10];
        this.courceCount = 0;
    }
    
    // A College can tell how many Courses are currently running
    public int getCoursesRunning() {
        return courceCount;
    }
    
    // A College can add a Course
    public void addCourseToCollege(Course course) {
        collegeCourses[courceCount] = course;
        courceCount++;
    }
    
    // A College can return its name and address as a single String
    public String toString() {
        return collegeName + " " + collegeAddress;
    }
    
    // A College can print a report with its name, address, and all its Courses
    public void collegeReport() {
        System.out.println(toString());
        for (int index = 0; index < courceCount; index++) {
            System.out.println(collegeCourses[index].toString());
        }
    }
}

