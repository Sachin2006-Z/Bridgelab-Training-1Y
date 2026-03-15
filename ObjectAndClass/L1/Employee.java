package com.ObjectAndClass.L1;

import java.util.Scanner;

public class Employee {
    String name;
    int id;
    double salary;

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Employee e1 = new Employee();

        e1.name = "XYZ";
        e1.id = 101;
        e1.salary = 50000;

        e1.displayDetails();
    }

}