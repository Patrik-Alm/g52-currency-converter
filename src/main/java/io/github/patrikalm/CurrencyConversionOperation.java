package io.github.patrikalm;

public class CurrencyConversionOperation {
    static double amount = 0;
    static String valuta = null;

    static double exchangeRateSekUsd = 0.1; //Källa Di.se/valutor per 24-10-16
    static double exchangeRateUsdSek = 10.44; //Källa Di.se/valutor per 24-10-16
    static double exchangeRateSekEur = 0.09; //Källa Di.se/valutor per 24-10-16
    static double exchangeRateEurSek = 11.36; //Källa Di.se/valutor per 24-10-16


    public static double sekUsd(double amount) {
        return amount * exchangeRateSekUsd;
    }


}
