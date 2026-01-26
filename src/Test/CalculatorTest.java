package Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calc;

    @BeforeEach
    void init() {
        calc = new Calculator();
    }

    @Test
    void testAddFunction() {
        int result = calc.add(10, 20);
        // assertThat(result).isEqualsTo(30);
    }

    @Test
    void testAddFunctionToBeCorrect() {
        int result = calc.add(10, 20);
        assertEquals(30, result);
    }

    @Test
    void testAddFunctionToBeNotCorrect() {
        int result = calc.add(10, 20);
        assertNotEquals(25, result);
    }


}
