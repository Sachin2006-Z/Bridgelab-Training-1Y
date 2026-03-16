package com.Packages.College;
import com.Packages.College.student.Student;
import com.Packages.College.faculty.Faculty;
public class Main {
    public static void main(String[] args) {

        Student s = new Student("Sachin", 101);
        Faculty f = new Faculty("Dr. Sharma", "Computer Science");

        s.displayStudent();
        f.displayFaculty();
    }
}
