import java.util.Scanner;

class Student {
    // Private data members
    private String studentID;
    private String name;
    private String grade;
    private String section;

    // Parameterized constructor to initialize student details
    public Student(String studentID, String name, String grade, String section) {
        this.studentID = studentID;
        this.name = name;
        this.grade = grade;
        this.section = section;
    }

    // Getter and Setter methods
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    // Member method to change the grade
    public void changeGrade(String updatedGrade) {
        this.grade = updatedGrade;
        System.out.println("Grade updated for student " + this.studentID + " to " + updatedGrade);
    }

    // Member method to "remove" the student record.
    // Here, we simulate deletion by clearing the data.
    public void removeStudent() {
        this.studentID = null;
        this.name = null;
        this.grade = null;
        this.section = null;
        System.out.println("Student record removed.");
    }

    // Member method to display the student's complete record
    public void showStudentInfo() {
        // Check if the student data exists
        if (this.studentID == null) {
            System.out.println("Record not found. Student has been removed.");
        } else {
            System.out.println("Student ID: " + studentID);
            System.out.println("Name      : " + name);
            System.out.println("Grade     : " + grade);
            System.out.println("Section   : " + section);
            System.out.println("--------------------------");
        }
    }
}

public class students {
    public static void main(String[] args) {
        // Create a fixed-size array of Student objects (here size 10)

//        Scanner obj = new Scanner(System.in);
//
//        int size;
//        System.out.println("enter the total no of students = ");
//        size = obj.nextInt();

        Student[] studentRecords = new Student[4];
        int count = 0; // To keep track of how many students are registered
        Scanner sc = new Scanner(System.in);

        // 1. Register students using hardcoded data
        Student s1 = new Student("S101", "Alice", "A", "A");
        Student s2 = new Student("S102", "Bob", "C", "B");
        studentRecords[count++] = s1;
        studentRecords[count++] = s2;

        // 2. Register a student using user-defined data
        System.out.println("Enter new student details:");
        System.out.print("Student ID: ");
        String id = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Grade: ");
        String grade = sc.nextLine();
        sc.nextLine();  // Consume the newline
        System.out.print("Section: ");
        String section = sc.nextLine();
        Student s3 = new Student(id, name, grade, section);
        studentRecords[count++] = s3;

        // Display all student records
        System.out.println("\n--- Student Records ---");
        for (int i = 0; i < count; i++) {
            studentRecords[i].showStudentInfo();
        }

        // 3. Modify the academic grade of a student
        System.out.print("\nEnter Student ID to update grade: ");
        String searchId = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            // Ensure that the student record exists before comparing IDs
            if (studentRecords[i].getStudentID() != null && studentRecords[i].getStudentID().equals(searchId)) {
                System.out.print("Enter new grade: ");
                String newGrade = sc.nextLine();
                studentRecords[i].changeGrade(newGrade);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + searchId + " not found.");
        }
        sc.nextLine();  // Consume the newline

        // 4. Remove a student record from the system
        System.out.print("\nEnter Student ID to remove: ");
        String removeId = sc.nextLine();
        found = false;
        for (int i = 0; i < count; i++) {
            if (studentRecords[i].getStudentID() != null && studentRecords[i].getStudentID().equals(removeId)) {
                studentRecords[i].removeStudent();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + removeId + " not found.");
        }

        // Final display of all student records after updates and removals
        System.out.println("\n--- Updated Student Records ---");
        for (int i = 0; i < count; i++) {
            studentRecords[i].showStudentInfo();
        }

        sc.close();
    }
}
