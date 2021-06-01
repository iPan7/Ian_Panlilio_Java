import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterSwitchTest {
    @Test
    public void shouldConnectWithinRanges() {
        ConverterSwitch month2 = new ConverterSwitch();
        ConverterSwitch day2 = new ConverterSwitch();
        assertEquals("ConverterSwitch: March", month2.convertMonth(3));
        assertEquals("ConverterSwitch: Monday", day2.convertDay(2));
    }
    @Test
    public void shouldReturnErrorOutsideRanges() {
        ConverterSwitch month2 = new ConverterSwitch();
        ConverterSwitch day2 = new ConverterSwitch();
        assertEquals("ConverterSwitch: The number you entered does not correspond to a month of the year.", month2.convertMonth(152));
        assertEquals("ConverterSwitch: The number you entered does not correspond to a day of the week.", day2.convertDay(-1));
    }
}