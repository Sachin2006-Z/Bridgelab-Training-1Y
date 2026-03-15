package com.ObjectAndClass.L2;

;

public class Student {
    String name;
    int rollNumber;
    double marks;

    String Grade() {

        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 40) return "D";
        else return "F";
    }

    // Method to display details
    void Details() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + Grade());
    }

    public static void main(String[] args) {
        Student m=new Student();
        m.name="Sachin";
        m.rollNumber=44;
        m.marks=75;
        m.Details();
    }
}
