public class Calculator {


    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        InputHandler inputHandler = new InputHandler();

        int a = inputHandler.readInt("Enter first number: ");
        int b = inputHandler.readInt("Enter second number: ");

        inputHandler.handleSelection("Type the number to select the method: \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n");

    }
}
