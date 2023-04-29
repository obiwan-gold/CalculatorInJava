import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class InputHandlerTest {

    InputHandler inputHandler;

    @BeforeEach
    public void setUp() {
        inputHandler = new InputHandler();
    }

    @Test
    @DisplayName("Input should be an integer")
    public void whenInputIsInteger() {
        assertEquals(123, inputHandler.isInputValidInteger("123"));
    }

    @Test
    @DisplayName("Non Integer input should return with a recalled message")
    public void whenInputIsNotInteger(){
        assertFalse(inputHandler.isInputValidInteger("abc"));
    }
}