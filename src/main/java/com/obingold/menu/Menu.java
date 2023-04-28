package com.obingold.calculator;

import java.util.Scanner;

public class Menu {
    public int setChoice(Scanner scan, String prompt) {
        System.out.println(prompt);
        return scan.nextInt();
    }

    public 

    public int handleChoice(int selection, int a, int b) {
        int result = 0;
        switch (selection) {
            case 1 ->  result = Calculator.add(a, b);
            case 2 ->  result = Calculator.subtract(a, b);
            case 3 ->  result = Calculator.multiply(a, b);
            case 4 ->  result = Calculator.divide(a, b);
            default -> System.out.println("Invalid selection.");
        }
        return result;
    }
}
