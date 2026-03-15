package com.ObjectAndClass.L1;

public class Item {
    String itemName;
    String itemCode;
    double price;

    public void detail() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Price: " + price);
        System.out.println(("Item Price for 4 quantity:" + price * 4));
    }

    public static void main(String[] args) {
        Item i = new Item();
        i.itemName = "Chair";
        i.itemCode = "#N53W";
        i.price = 1500;
        i.detail();
    }
}
