package unitTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    int a = 5;
    int b = 3;
    Calculator calculator = new Calculator();

    @Test
    void sum() {
        var expected = 8;
        assertEquals(expected, calculator.sum(a, b));
    }

    @Test
    void diff() {
        var expected = 2;
        assertEquals(expected, calculator.diff(a, b));
    }

    @Test
    void multiply() {
        var expected = 15;
        assertEquals(expected, calculator.multiply(a, b));
    }

    @Test
    void div() {
        var expected = 1.6666666666666667;
        assertEquals(expected, calculator.div(a, b));
    }
}