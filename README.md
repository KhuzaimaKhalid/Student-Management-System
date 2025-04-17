====================================================
            STUDENT MANAGEMENT SYSTEM
====================================================

Author: [Your Name]
File Name: students.java
Language: Java
Project Type: Console-based OOP Application
Date: [Insert Date]

----------------------------------------------------
DESCRIPTION
----------------------------------------------------
This Java application allows basic management of student records. It demonstrates object-oriented programming (OOP) principles like encapsulation, class methods, and arrays of objects.

----------------------------------------------------
FEATURES
----------------------------------------------------
1. Register students (hardcoded and user input)
2. Display all student records
3. Update a student’s academic grade using Student ID
4. Remove (simulate deletion of) a student record
5. View updated student records after changes

----------------------------------------------------
HOW TO COMPILE AND RUN
----------------------------------------------------
1. Open terminal or command prompt
2. Navigate to the directory where "students.java" is saved
3. Compile the file using:
   javac students.java
4. Run the program using:
   java students

----------------------------------------------------
PROGRAM FLOW
----------------------------------------------------
1. Two students are added with pre-defined data.
2. One student is added via user input (ID, Name, Grade, Section).
3. All student records are displayed.
4. The user is prompted to:
   - Update the grade of a specific student by entering their ID.
   - Remove a student record using their ID.
5. The final student list is displayed.

----------------------------------------------------
SAMPLE INPUT/OUTPUT
----------------------------------------------------
> Enter new student details:
> Student ID: S103
> Name: Charlie
> Grade: B
> Section: A

--- Student Records ---
Student ID: S101
Name      : Alice
Grade     : A
Section   : A
...

> Enter Student ID to update grade: S103
> Enter new grade: A+

> Grade updated for student S103 to A+

> Enter Student ID to remove: S102
> Student record removed.

----------------------------------------------------
NOTES
----------------------------------------------------
- If you try to update or remove a non-existent student ID, 
  the program will display an appropriate message.
- The student removal is simulated by nullifying the fields, 
  not actually deleting the object from memory.

----------------------------------------------------
END OF README
====================================================
