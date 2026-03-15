package com.CreatingOfMethod.L2;

import java.util.*;

public class Vote {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr=new int[10];
        char[] t = {'A','B','C','D','E','F','G','H','I','J'};
        System.out.println("Enter the Age of Students");
        for(int i=0; i<10; i++) {
            System.out.println("Enter the age of "+t[i]);
            arr[i]= s.nextInt();
        }
        age(arr);
    }

    public static void age(int[] arr) {
        char a='A';
        for(int i=0; i<10; i++) {
            if(arr[i]>=18){
                System.out.println((char)(a+i)+" is eligible for voting");
            }
        }
    }
}
