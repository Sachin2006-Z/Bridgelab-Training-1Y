package com.CreatingOfMethod.L1;

import java.util.Scanner;

public class SumOfn {
    public static void Sum(int n){
        int c=0;
        for(int i=1; i<=n; i++){
            c+=i;
        }
        System.out.println("Sum of n Natural number:- "+c);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        Sum(n);
    }
}
