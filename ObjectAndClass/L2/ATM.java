//package com.ObjectAndClass.L2;
//
//import java.util.Scanner;
//
//public class ATM {
//    String accountHolder;
//    int accountNumber;
//    double balance;
//
//    void deposit(double amount) {
//        balance += amount;
//        System.out.println("Deposited: " + amount);
//    }
//
//    void withdraw(double amount) {
//        if (amount <= balance) {
//            balance -= amount;
//            System.out.println("Withdrawn: " + amount);
//        } else {
//            System.out.println("Insufficient balance.");
//        }
//    }
//
//    void displayBalance() {
//        System.out.println("Current Balance: " + balance);
//    }
//}
//
//public class ATM {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        ATM acc = new ATM();
//
//        System.out.print("Enter Account Holder Name: ");
//        acc.accountHolder = sc.nextLine();
//
//        System.out.print("Enter Account Number: ");
//        acc.accountNumber = sc.nextInt();
//
//        System.out.print("Enter Initial Balance: ");
//        acc.balance = sc.nextDouble();
//
//        int choice;
//
//        do {
//            System.out.println("\n1. Deposit");
//            System.out.println("2. Withdraw");
//            System.out.println("3. Display Balance");
//            System.out.println("4. Exit");
//
//            System.out.print("Enter choice: ");
//            choice = sc.nextInt();
//
//            switch (choice) {
//
//                case 1:
//                    System.out.print("Enter deposit amount: ");
//                    double d = sc.nextDouble();
//                    acc.deposit(d);
//                    break;
//
//                case 2:
//                    System.out.print("Enter withdraw amount: ");
//                    double w = sc.nextDouble();
//                    acc.withdraw(w);
//                    break;
//
//                case 3:
//                    acc.displayBalance();
//                    break;
//
//                case 4:
//                    System.out.println("Thank you for using ATM.");
//                    break;
//
//                default:
//                    System.out.println("Invalid choice.");
//            }
//
//        } while (choice != 4);
//    }
//}
