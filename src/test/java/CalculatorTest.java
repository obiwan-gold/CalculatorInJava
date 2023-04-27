import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void add() {
        int result = Calculator.add(1, 2);
        assertEquals(3, result);
    }

    @Test
    public void subtract() {
        int result = Calculator.subtract(1, 2);
        assertEquals(-1, result, "Addition failed: expected 5, but got " + result);
    }

    @Test
    public void multiply() {
        int result = Calculator.multiply(1, 2);
        assertEquals(2, result, "Multiplication failed: expected 2, but got " + result);
    }

    @Test
    public void divide() {
        int result = Calculator.divide(4, 2);
        assertEquals(2, result, "Division failed: expected 2, but got " + result);
    }
}