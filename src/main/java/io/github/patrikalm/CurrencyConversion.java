package io.github.patrikalm;

public class CurrencyConversion {
    static double amount = 0;
    static String valuta = null;

     static double exchangeRateSekUsd = 0.1; //Källa Di.se/valutor per 24-10-16
    static double exchangeRateUsdSek = 10.44; //Källa Di.se/valutor per 24-10-16
    static double exchangeRateSekEur = 0.09; //Källa Di.se/valutor per 24-10-16
    static double exchangeRateEurSek = 11.36; //Källa Di.se/valutor per 24-10-16



    public static void sekUsd() {

        System.out.println();
        System.out.print("Enter the value in SEK to be converted to USD: ");
        amount = InputHandler.valueInput();

        amount = amount * exchangeRateSekUsd;

        valuta = "USD";

        OutputHandler.output(amount, valuta);

    }
    public static void usdSek() {

        System.out.println();
        System.out.print("Enter the value in USD to be converted to SEK: ");
        amount = InputHandler.valueInput();

        amount = amount * exchangeRateUsdSek;

        valuta = "SEK";

        OutputHandler.output(amount, valuta);

    }
    public static void sekEur() {

        System.out.println();
        System.out.print("Enter the value in SEK to be converted to EUR: ");
        amount = InputHandler.valueInput();

        amount = amount * exchangeRateSekEur;

        valuta = "EUR";

        OutputHandler.output(amount, valuta);

    }
    public static void eurSek() {

        System.out.println();
        System.out.print("Enter the value in EUR to be converted to SEK: ");
        amount = InputHandler.valueInput();

        amount = amount * exchangeRateEurSek;

        valuta = "SEK";

        OutputHandler.output(amount, valuta);

    }

}
