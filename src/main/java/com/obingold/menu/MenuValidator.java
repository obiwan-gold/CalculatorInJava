package com.obingold.menu;

import com.obingold.calculator.Calculator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class MenuValidator {
    private int selection;
    private Calculator calculator = new Calculator();

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
