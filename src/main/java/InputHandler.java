import java.util.Scanner;

public class InputHandler {
    Scanner scan = new Scanner(System.in);
    public int readInt(String prompt){
        System.out.println(prompt);
        return scan.nextInt();
    }

    public int readSelection(String prompt){
        System.out.println(prompt);
        int selection = scan.nextInt();
        return selection;
    }

    public void handleSelection(int selection) {
    }
}
