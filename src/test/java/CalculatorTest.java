import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(10, calculator.Add(3, 7));
    }

    @Test
    public void canSubtract() {
        assertEquals(5, calculator.Subtract(10, 5));
    }

    @Test
    public void canMultiply() {
        assertEquals(12, calculator.Multiply(4, 3));
    }

    @Test
    public void canDivide() {
        assertEquals(10, calculator.Divide(20, 2), 0.01);
    }
}

