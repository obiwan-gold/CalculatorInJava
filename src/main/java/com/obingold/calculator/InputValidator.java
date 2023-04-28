package com.obingold.calculator;

public class InputValidator {

    public boolean validateInput(String input){
        // First check if input is blank
        if (isInputEmpty(input)) {
            return false;
        }
        // Second check if input is an integer
        return isInputValidInteger(input);
    }

    public Boolean isInputEmpty(String input){
        // Empty string check
        return input.isEmpty();
    }
    public boolean isInputValidInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}
