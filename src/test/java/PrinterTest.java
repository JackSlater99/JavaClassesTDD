import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;
    @Before
    public void before() {
        printer = new Printer(200, 100);
    }

    @Test
    public void hasPaper() {
        assertEquals(200, printer.getPaper());
    }

    @Test
    public void hasToner() {
        assertEquals(100, printer.getToner());
    }

    @Test
    public void canPrintAndRemovePaper() {
        printer.print(3,5);
        assertEquals(185, printer.getPaper());
    }

    @Test
    public void canPrintAndRemoveToner() {
        printer.print(3,5);
        assertEquals(85, printer.getToner());
    }

    @Test
    public void notAllowPrintWhenPaperLowerThanRequired() {
        printer.print(10,30);
        assertEquals(200, printer.getPaper());
    }

    @Test
    public void notAllowPrintWhenTonerLowerThanRequired() {
        printer.print(10,30);
        assertEquals(100, printer.getToner());
    }
}
