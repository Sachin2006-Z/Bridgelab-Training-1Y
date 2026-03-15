package com.ObjectAndClass.L1;

public class MobilePhone {
    String brand;
    String model;
    double price;

    public void detail() {
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Mobile Model: " + model);
        System.out.println("Item Price: " + price);
    }

    public static void main(String[] args) {
        MobilePhone m = new MobilePhone();
        m.brand = "Samsung";
        m.model = "S24";
        m.price = 40000;
    }
    }