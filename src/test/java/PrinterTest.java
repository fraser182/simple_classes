import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(500);
    }

    @Test
    public void paperLeft(){
        assertEquals(500, printer.getNumberOfSheetsOfPaper());
    }

    @Test
    public void canPrintIfEnoughPaper(){
        assertEquals(300, printer.print(100, 2 ));
    }

    @Test
    public void cantPrintIfNotEnoughPaper(){
        assertEquals(500, printer.print(300, 3));
    }

    @Test
    public void refillPaper(){
        printer.print(100, 2);
        assertEquals(300, printer.getNumberOfSheetsOfPaper());
        assertEquals(500, printer.refill());
    }

    @Test
    public void tonerCheck(){
        assertEquals(600, printer.print(200, 1));
    }
}

