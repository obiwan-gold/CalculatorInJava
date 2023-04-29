package com.obingold.menu;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter @Setter
public class Menu {
    private String choice;

    private final MenuValidator menuValidator;

    public Menu(){
        this.menuValidator = new MenuValidator();
    }

    public int handleChoice(Scanner scan) {
        System.out.println("Type the number to select the method: \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n");
        return scan.nextInt();
    }


}
