package com.bridgelabz;

import java.util.Scanner;

public class StockManagement {
    private static Scanner scanner = new Scanner(System.in);
    private static Stock stock = new Stock();

    public static void main(String[] args) {
        System.out.println("Enter the Number of Stock");
        stock.setNumberofStock(scanner.nextInt());
        int value = 0;
        int totalvalue = 0;
        for (int i = 0; i < stock.getNumberofStock(); i++) {
            System.out.println(addStock());
            value = stock.getNumberofShare() * stock.getSharePrice();
            System.out.println("Investing Value of " + stock.getShareName() + " is " + value);
            totalvalue += value;
        }
        System.out.println("Total Investing value of all Stock is " + totalvalue);
    }

    public static Stock addStock() {
        System.out.println("Enter the Name of Stock");
        stock.setShareName(scanner.next());
        System.out.println("Enter the Number of Share");
        stock.setNumberofShare(scanner.nextInt());
        System.out.println("Enter the Share Price");
        stock.setSharePrice(scanner.nextInt());
        return stock;
    }
}
