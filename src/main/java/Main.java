import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputHandler inputHandler = new InputHandler();

        int a = inputHandler.getInput("Enter first number: ");
        int b = inputHandler.getInput("Enter second number: ");

        inputHandler.readSelection("Type the number to select the method: \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n", a, b);

        scanner.close();
    }
}
