package com.obingold.calculator;

import java.util.Scanner;

public class InputHandler {
    private final InputValidator inputValidator;
    public InputHandler(){
        this.inputValidator = new InputValidator();
    }
    // Redirects good input or bad input
    public int getInput(Scanner scan, String promptMessage) {
        for (int i = 0; i < 3; i++){
            System.out.print(promptMessage);
            String input = setInput(scan);
            if (inputValidator.validateInput(input)){
                return Integer.parseInt(input);
            } else {
                handleInvalidInput(i == 2);
            }
        }
        return 0;
    }
    private String setInput(Scanner scan) {
        return scan.nextLine();
    }
    private void handleInvalidInput(boolean shouldExit) {
        if (shouldExit) {
            System.out.println("You have exceeded the maximum number of tries. Exiting...");
            System.exit(0);
        } else {
            System.out.println("Please provide a valid integer");
        }
    }

    public void printResult(int result) {
        System.out.println("Result: " + result);
    }
}
