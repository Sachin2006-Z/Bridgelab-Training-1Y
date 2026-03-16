package com.Packages;
import static java.lang.Math.*;
public class StaticImportDemo {

    public static void main(String[] args) {

        int a = 16;
        int b = -25;

        // sqrt()
        System.out.println("Square Root of 16 = " + sqrt(a));

        // pow()
        System.out.println("2 raised to power 3 = " + pow(2, 3));

        // max()
        System.out.println("Maximum of 10 and 20 = " + max(10, 20));

        // min()
        System.out.println("Minimum of 10 and 20 = " + min(10, 20));

        // abs()
        System.out.println("Absolute value of -25 = " + abs(b));
    }
}
