
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
    calculator = new Calculator();
    }

    @Test
    public void doesAddition(){
        assertEquals(12, calculator.addition(5, 7));
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
        assertEquals(0.71, calculator.division(5, 7), 0.01);

    }

}

