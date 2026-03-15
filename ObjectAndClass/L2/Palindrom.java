package com.ObjectAndClass.L2;

import java.util.Scanner;

public class Palindrom {
    String text;
    public void checker(){
        String rev=new StringBuilder(text).reverse().toString();
        if(text.equals(rev)) System.out.println("Its Palindrom");
        else System.out.println("Its not Palindrom");
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Palindrom p=new Palindrom();
        p.text=s.nextLine();
        p.checker();
    }
}
