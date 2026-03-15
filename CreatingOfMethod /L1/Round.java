package com.CreatingOfMethod.L1;

import java.util.Scanner;

public class Round {
    public static void NoOfRound(int d1,int d2,int d3){
        int td=d1+d2+d3;
        double a=(td)/5000;
        System.out.println("Total Rounds="+a);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d1=sc.nextInt();
        int d2=sc.nextInt();
        int d3=sc.nextInt();
        NoOfRound(d1,d2,d3);
    }
}
