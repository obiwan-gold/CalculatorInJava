package com.obingold.menu;

import java.util.Scanner;

public class Menu {
    private final MenuValidator menuValidator;

    public Menu(){
        this.menuValidator = new MenuValidator();
    }

    public int getChoice(Scanner scan) {
        System.out.println("Type the number to select the method: \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n");
        return scan.nextInt();
    }


}
