import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {
    @Test
    public void shouldConvertWithinRanges() {
        ConverterIf month1 = new ConverterIf();
        ConverterIf day1 = new ConverterIf();
        assertEquals("ConverterIf: August", month1.convertMonth(8));
        assertEquals("ConverterIf: Saturday", day1.convertDay(7));
    }
    @Test
    public void shouldReturnErrorOutsideRanges() {
        ConverterIf month1 = new ConverterIf();
        ConverterIf day1 = new ConverterIf();
        assertEquals("ConverterIf: The number you entered does not correspond to a month of the year.", month1.convertMonth(33));
        assertEquals("ConverterIf: The number you entered does not correspond to a day of the week.", day1.convertDay(12));
    }

}