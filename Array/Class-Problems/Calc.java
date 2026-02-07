package com.gla;

import java.util.Scanner;

public class calc {
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b) {
        return a * b;
    }
    public int div(int a,int b){
        return a/b;
    }

    public static void main(String[] args) {
        calc c=new calc();
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("1-Addition");
        System.out.println("2-Subtraction");
        System.out.println("3-Multiplication");
        System.out.println("4-Division");

        int e;

        int d=s.nextInt();
        switch(d) {
            case 1:
                e = c.add(a, b);
                System.out.println("Sum=" + e);
                break;
            case 2:
                e=c.sub(a,b);
                System.out.println("Sum="+e);
                break;
            case 3:
                e = c.mul(a, b);
                System.out.println("Sum=" + e);
                break;
            case 4:
                e=c.div(a,b);
                System.out.println("Sum="+e);
                break;
        }
    }

}
