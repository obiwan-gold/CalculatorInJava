package com.obingold.calculator;

import java.util.Scanner;

public class InputHandler {
    private final InputValidator inputValidator;

    public InputHandler(){
        this.inputValidator = new InputValidator();
    }
    public int getInput(Scanner scan, String promptMessage) {
        while (true) {
            System.out.print(promptMessage);
            String input = setInput(scan);
            if (inputValidator.validateInput(input)){
                return Integer.parseInt(input);
            } else {
                System.out.println("Please provide a valid integer.");
            }
        }
    }

    private String setInput(Scanner scan) {
        return scan.nextLine();
    }

    private boolean handleInvalidInput() {
        System.out.println("Please provide a valid integer.");
        return false;
    }

    public int setChoice(Scanner scan, String prompt) {
        System.out.println(prompt);
        return scan.nextInt();
    }

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

    public void printResult(int result) {
        System.out.println("Result: " + result);
    }
}
