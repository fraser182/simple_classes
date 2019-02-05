import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(500, 800);
    }

    @Test
    public void paperLeft(){
        assertEquals(500, printer.getNumberOfSheetsOfPaper());
    }

    @Test
    public void canPrintIfEnoughPaper(){
        printer.print(100,2);
        assertEquals(300, printer.getNumberOfSheetsOfPaper());
    }

    @Test
    public void canRefillPaper(){
        printer.print(100, 2);
        printer.refill();
        assertEquals(500, printer.getNumberOfSheetsOfPaper());

    }

//    @Test
//    public void reducesTonerBYOneWhenPrintingEachPage(){
//        printer.print(5, 10);
//        assertEquals(750, printer.getToner());
//    }
}

