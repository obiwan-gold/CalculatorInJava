public class Main {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();

        int a = inputHandler.readInt("Enter first number: ");
        int b = inputHandler.readInt("Enter second number: ");

        inputHandler.readSelection("Type the number to select the method: \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n", a, b);

    }
}
