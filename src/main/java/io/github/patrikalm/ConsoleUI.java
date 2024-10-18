package io.github.patrikalm;

public class ConsoleUI {
    public static void start() {

        int choice = 0;

        boolean isActive = true;
        while (isActive) {

            MenuDisplay.menuDisplay();

            try {

                choice = Integer.parseInt(InputHandler.valueInput());
                switch (choice) {

                    case 0:
                        isActive = false;
                        break;
                    case 1:
                        System.out.println("Enter a number: ");
                        System.out.println(CurrencyConversionOperation.sekUsd(Double.parseDouble(InputHandler.valueInput())));
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println();
                        System.out.println("You have to enter a number from the Menu.");
                        System.out.println("Please try again!");
                        System.out.println();

                }
            } catch (NumberFormatException e) {
                System.out.println();
                System.out.println("Ooops! Something went very wrong! Did you really use a number from the menu?");
                System.out.println("Please start the program again!");
                System.out.println();
            }


        }
    }
}