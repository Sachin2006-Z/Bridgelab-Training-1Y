package com.CreatingOfMethod.L1;

import java.util.Scanner;

public class RemAndQuti {
    public static void RAndQ(int r,int d){
        double qu=r/d;
        int re=r%d;
        System.out.println(("Reminder : " +re+ " Quotient: "+qu));
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int d=s.nextInt();
        RAndQ(r,d);
    }
}
