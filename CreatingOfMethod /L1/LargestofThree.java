package com.CreatingOfMethod.L1;

import java.util.Scanner;

public class LargestofThree {
    public static void Greatest(int a,int b,int c){
        if(a>b && a>c){
            System.out.println(a + " is largest");
        }
        else if(b>a && b>c){
            System.out.println(b + " is largest ");

        }
        else if(c>a && b<c){
            System.out.println(c + " is largest ");

        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        Greatest(a,b,c);
    }
}
