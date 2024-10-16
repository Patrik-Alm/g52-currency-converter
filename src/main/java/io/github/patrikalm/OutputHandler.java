package io.github.patrikalm;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class OutputHandler {


    public static void output(double amount, String valuta) {

        LocalDateTime now = LocalDateTime.now();

        String date = now.format(DateTimeFormatter.ofPattern("eeee dd MMMM YYYY", Locale.UK));
        String time = now.format(DateTimeFormatter.ofPattern("kk:mm"));

        System.out.println();
        System.out.print("Today " + date + " at " + time + " ");
        System.out.print("that amount corresponds to ");
        System.out.print(new DecimalFormat("###,###.##").format(amount));
        System.out.print(" " + valuta);
        System.out.println();

    }
}
