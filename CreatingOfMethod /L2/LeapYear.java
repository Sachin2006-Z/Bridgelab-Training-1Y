package com.CreatingOfMethod.L2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the leap year:-");
        int a=s.nextInt();
        year(a);
    }
    public static void year(int a){
        if((a%4==0 && a%10!=0)||(a%400==0)){
            System.out.println("Its a leap year");
        }
        else{
            System.out.println("Its not a leap year");
        }
    }
}
