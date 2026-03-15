package com.ObjectAndClass.L2;

import java.util.Scanner;

public class Cart {
    String itemName;
    double price;
    int quantity;
    void display() {
        double total=price*quantity;

        System.out.println("Item: "+ itemName);
        System.out.println("Price: "+ price);
        System.out.println("Quantity: "+ quantity);
        System.out.println("Total Cost: "+ total);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Cart c=new Cart();
        System.out.print("Enter item name: ");
        c.itemName=sc.nextLine();
        System.out.print("Enter item price: ");
        c.price=sc.nextDouble();
        System.out.print("Enter quantity: ");
        int q=sc.nextInt();
        System.out.print("Enter quantity to remove: ");
        int r=sc.nextInt();
        c.quantity=q-r;
        c.display();
    }
}
