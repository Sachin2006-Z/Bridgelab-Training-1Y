package com.ObjectAndClass.L1;

import java.util.Scanner;

public class Circle {
    double r;
    double Area(){
        double ar=Math.PI*r*r;
        return ar;
    }
    double Circu() {
        return Math.PI*2*r;
    }
    public void display() {
        System.out.println("Radius: " + r);
        System.out.println("Area: " + Area());
        System.out.println("Circumference: " + Circu());
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Circle c=new Circle();
        System.out.print("Enter radius: ");
        c.r=s.nextDouble();
        c.display();
    }
}
