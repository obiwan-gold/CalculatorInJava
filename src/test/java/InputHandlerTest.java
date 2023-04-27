import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class InputHandlerTest {

    @Test
    public void inputShouldBeInteger() {
        Scanner scanMock = mock(Scanner.class);
        InputHandler inputHandler = new InputHandler();

        // Inject the mock Scanner object
        inputHandler.setScanner(scanMock);

        // Set the expected input value
        when(scanMock.nextInt()).thenReturn(5);

        int value = inputHandler.readInt("Enter a number: ");

        assertEquals(5, value, "Value read does not match input, value given: " + value);
    }

    @Test
    public void selectedOptionShouldBeCorrect() {
        InputHandler inputHandler = new InputHandler();
        int a = 4;
        int b = 5;
        inputHandler.handleSelection(1, a, b);
        inputHandler.handleSelection(2, a, b);
        inputHandler.handleSelection(3, a, b);
        inputHandler.handleSelection(4, a, b);
        inputHandler.handleSelection(5, a, b);
    }

}