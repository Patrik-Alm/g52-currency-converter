package io.github.patrikalm;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

    int choice = 0;
    double amount = 0;

        do {

            MenuDisplay.menuDisplay();

            choice = InputHandler.menuChoice();

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



            }

        } while (choice != 0);
    }
}