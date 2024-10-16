package io.github.patrikalm;

import java.util.Scanner;

public class InputHandler {

    static Scanner scanner = new Scanner(System.in);

    public static int menuChoice(){

        return scanner.nextInt();

    }

    public static double valueInput() {

        return scanner.nextDouble();

    }


}
