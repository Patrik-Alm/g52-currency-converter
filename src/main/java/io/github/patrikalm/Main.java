package io.github.patrikalm;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

    int choice = 0;
    double amount = 0;

        do {

            MenuDisplay.menuDisplay();
            try {
                choice = InputHandler.menuChoice();

            } catch (Exception e) {
                System.out.println();
                System.out.println("Ooops! Something went very wrong! Did you really use a number from the menu?");
                System.out.println("Please start the program again!");
                System.out.println();
                break;

                }

            switch (choice) {

                case 1:
                    CurrencyConversion.sekUsd();
                    break;
                case 2:
                    CurrencyConversion.usdSek();
                    break;
                case 3:
                    CurrencyConversion.sekEur();
                    break;
                case 4:
                    CurrencyConversion.eurSek();
                    break;
                default:
                    System.out.println();
                    System.out.println("You have to enter a number from the Menu.");
                    System.out.println("Please try again!");
                    System.out.println();

            }

        } while (choice != 0);
    }
}