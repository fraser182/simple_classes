
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
    calculator = new Calculator(5, 7);
    }

    @Test
    public void doesAddition(){
        assertEquals(12, calculator.addition());
    }

    @Test
    public void doesSubtraction(){
        assertEquals(-2, calculator.subtraction());
    }

    @Test
    public void doesMultiplication(){
        assertEquals(35, calculator.multiplication());
    }

    @Test
    public void doesDivision(){
        assertEquals(0.71, calculator.division(), 0.01);

    }

}

