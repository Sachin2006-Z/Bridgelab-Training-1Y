package com.CreatingOfMethod.L1;

import java.util.Scanner;

public class numberOfStudents {
    public static void Handshake(int n){
        int a=(n * (n - 1)) / 2;
        System.out.println("Total Number of hand Sake "+a);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Handshake(n);
    }
}
