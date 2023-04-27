import java.util.Scanner;

public class InputHandler {
    Scanner scan = new Scanner(System.in);

    public int readInt(String prompt) {
        System.out.println(prompt);
        return scan.nextInt();
    }

    public void handleSelection(String prompt) {

        System.out.println(prompt);

        try {
            int selection = Integer.parseInt(String.valueOf(scan.nextInt()));
            System.out.println(selection);
        } catch (Exception e) {
            System.out.println("Provide an integer please");
        }
    }
}
