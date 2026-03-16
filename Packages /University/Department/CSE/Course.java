package com.Packages.University.Department.CSE;

public class Course {
    String courseName;
    int courseCode;

    public Course(String name, int code) {
        courseName = name;
        courseCode = code;
    }

    public void displayCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }
}
