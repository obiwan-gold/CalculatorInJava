import java.util.Scanner;

public class InputHandler {

    private String setInput(Scanner scan) {
        return scan.nextLine();
    }

    public boolean isInputValidInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void handleInvalidInput() {
        System.out.println("Please provide a valid integer.");
    }

    public int getInput(Scanner scan, String promptMessage) {
        while (true) {
            System.out.print(promptMessage);
            String input = setInput(scan);
            if (!isInputValidInteger(input)) {
                handleInvalidInput();
            } else {
                return Integer.parseInt(input);
            }
        }
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
