
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    Calculator calculator; // defined here so it can be seen in all the tests

    @Before
    public void before(){
    calculator = new Calculator();
    }

    // cmd + n to generate a test method
    @Test
    public void doesAddition(){
        int result = calculator.addition(5,7);
        assertEquals(12, result);
    }

    @Test
    public void doesSubtraction(){
        assertEquals(-2, calculator.subtraction(5, 7));
    }

    @Test
    public void doesMultiplication(){
        assertEquals(35, calculator.multiplication(5, 7));
    }

    @Test
    public void doesDivision(){
        assertEquals(2, calculator.division(10, 5));

    }

}

