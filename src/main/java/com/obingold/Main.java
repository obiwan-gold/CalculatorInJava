package com.obingold.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        InputHandler inputHandler = new InputHandler();
        Menu menu = new Menu();

        int a = inputHandler.getInput(scan, "Provide the first number: ");
        int b = inputHandler.getInput(scan, "Provide the second number: ");

        int choice = menu.setChoice(scan, "Type the number to select the method: \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n");

        int result = menu.handleChoice(choice, a, b);
        inputHandler.printResult(result);
    }
}
