Scenario
In this challenge you are going to design a set of classes that together allows you to join a class at your favorite college.
Design and implement the following classes, each in its own file:

Student, which:
has a first name, last name and a CSID.
implements a constructor that takes values for all the instance variables/fields.
can get the full name (first and last name as one string) and get the CSID. Meaning: create a method that returns the full name and a method that returns CSID.
implements the toString method to return all contained data as a String.
Course, which:
has a title, a CRN, and has many students; assume that there can be maximum of 26 students in a class (hint: use an array)
implements a constructor that takes values for the title and CRN.
can get the number of students enrolled (hint: requires that the class has a counter of students enrolled)
can add a student to the course (hint: use public void addStudent(Student student)).
implements to the toString method to return title, CRN and number of students enrolled as a String.
can print a report containing title, CRN and each of the students in the class.
College, which:
has a name and an address, and has many college courses; assume that a college can have a maximum of 1000 courses.
implements a constructor that takes values for the name and address.
can get the number of courses running.
can add a course to the college.
implements to the toString method to return name and address as a String
can print a report containing name and address, and each of the courses with the number of students enrolled in each course.
Then create a static main method which:

Create “San Diego Favorite College” with an address that you decide.
Create course “Java Programming” with a CRN that you decide.
Add the Java Programming class to the college.
Create class “Introduction to Computer Science”
Add the computer science class to the college.
Create yourself as a student.
Add yourself to the Java Programming course.
Create Lisa Simpson as a student.
Add Lisa Simpson to the Java Programming course.
Create Bart Simpson as a student.
Add Bart Simpson to the Computer Science course.
Add yourself to the Computer Science course.
Create a "COBOL Programming" course
Add the COBOL course to the college.
Print a report of each course.
Print a report of the college.
The output may look similar to:

Course: Java Programming CRN: 12345
Name               CSID
Your Self          001
Lisa Simpson       002

Course: Introduction to Computer Science CRN: 54321
Name              CSID
Bart Simpson      002
Your Self         001

San Diego Favorite College
123 Main st, San Diego CA 92123
Course                           CRN        Students
Java Programming                 12345      2
Introduction to Computer Science 54321      2
COBOL Programming                00001      0
You have complete creative freedom for the layout as long as it displays all the information correctly. You can use "\t" in Strings for tab to indent to columns.


Technical implementation
Use private instance variables/fields for all has-a relationships.
Use private array instance variables/fields for all has-many relationships.
Comment each instance variable/field with a has-a/has-many comment; example: A student has-a name.
Implement can as methods.
Comment each method with purpose. The full recipe examples are not required.
Use a counter to keep track of at which index new objects should be stored in a given array.
