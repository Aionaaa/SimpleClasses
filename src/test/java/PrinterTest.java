import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(10, 10);
    }

    @Test
    public void hasPaper(){
        assertEquals(10, printer.hasPaper());
    }

    @Test
    public void print(){
        assertEquals(true, printer.print(1, 2));
    }

    @Test
    public void cantPrint(){
        assertEquals(false, printer.print(10, 3));
    }
}
