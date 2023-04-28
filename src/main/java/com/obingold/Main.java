package com.obingold;

import com.obingold.input.InputHandler;
import com.obingold.menu.Menu;
import com.obingold.calculator.Calculator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        InputHandler inputHandler = new InputHandler();
        Menu menu = new Menu();
        Calculator calculator = new Calculator();

        // Get & Process User Inputs
        int a = inputHandler.getInput(scan, "Provide the first number: ");
        int b = inputHandler.getInput(scan, "Provide the second number: ");

        // Choose Menu Option
        int choice = menu.getChoice(scan);

        // Calculate Result
        int result = calculator.calculate(a, b, choice);

        // Print Result
        calculator.printResult(result);

    }
}
