package com.obingold.menu;

import com.obingold.calculator.Calculator;
public class MenuValidator {
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
