import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {

    private Scanner scanner;

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getInput(String prompt) {
        System.out.println(prompt);
        return checkInputIsInt(scanner.nextInt());
    }

    public int checkInputIsInt(int value){

    }

    public void readSelection(String prompt, int a, int b) {

        System.out.println(prompt);
        try {
            int selection = Integer.parseInt(String.valueOf(scanner.nextInt()));
            handleSelection(selection, a, b);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Provide an integer please");
            scanner.nextLine();
            readSelection(prompt, a, b);
        }
    }

    public void handleSelection(int selection, int a, int b) {
        switch (selection) {
            case 1:
                System.out.println("Result: " + Calculator.add(a, b));
                break;
            case 2:
                System.out.println("Result: " + Calculator.subtract(a, b));
                break;
            case 3:
                System.out.println("Result: " + Calculator.multiply(a, b));
                break;
            case 4:
                System.out.println("Result: " + Calculator.divide(a, b));
                break;
            default:
                System.out.println("Invalid selection.");
                break;
        }
    }
}
