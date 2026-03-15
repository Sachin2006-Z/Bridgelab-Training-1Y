package com.CreatingOfMethod.L2;

import java.util.Scanner;

public class SumOfn {
    public static int formulaSum(int n) {
        int a = n * (n + 1) / 2;
        return a;
    }
    public static int Sum(int n){
        int c=0;
        for(int i=0; i<=n; i++){
            c+=i;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if (formulaSum(n) == Sum(n)) {
            System.out.println("Both results are correct and equal.");
        }
        else {
            System.out.println("Results are different. ");
        }
    }
}
