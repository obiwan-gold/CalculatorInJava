package com.obingold.menu;

import com.obingold.calculator.Calculator;
public class MenuValidator {
    private int selection;

    public int getSelection() {
        return selection;
    }

    public void setSelection(int selection) {
        this.selection = selection;
    }

    private final Calculator calculator;
    public MenuValidator(){
        this.calculator = new Calculator();
    }
    public int handleChoice(int selection, int a, int b) {
        int result = 0;
        switch (selection) {
            case 1 ->  result = calculator.add(a, b);
            case 2 ->  result = calculator.subtract(a, b);
            case 3 ->  result = calculator.multiply(a, b);
            case 4 ->  result = calculator.divide(a, b);
            default -> System.out.println("Invalid selection.");
        }
        return result;
    }
}
