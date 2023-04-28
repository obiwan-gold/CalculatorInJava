package com.obingold.menu;

import java.util.Scanner;

public class Menu {
    private final MenuValidator menuValidator;

    public Menu(){
        this.menuValidator = new MenuValidator();
    }

    public int setChoice(Scanner scan, String prompt) {
        System.out.println(prompt);
        return scan.nextInt();
    }


}
