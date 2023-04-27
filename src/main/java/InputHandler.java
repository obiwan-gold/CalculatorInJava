import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {
    Scanner scan = new Scanner(System.in);
    int result;
    public int readInt(String prompt) {
        System.out.println(prompt);
        return scan.nextInt();
    }

    public void readSelection(String prompt, int a, int b) {

        System.out.println(prompt);
        try {
            int selection = Integer.parseInt(String.valueOf(scan.nextInt()));
            handleSelection(selection, a, b);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. bvcnProvide an integer please");
            scan.nextLine();
            readSelection(prompt, a, b);
        }
    }

    public void handleSelection(int selection, int a, int b) {
        switch (selection) {
            case 1:
                System.out.println(Calculator.add(a, b));
                break;
            case 2:
                System.out.println(Calculator.subtract(a, b));
                break;
            case 3:
                System.out.println(Calculator.multiply(a, b));
                break;
            case 4:
                System.out.println(Calculator.divide(a, b));
                break;
            default:
                System.out.println("Invalid selection.");
                break;
        }
    }
}
