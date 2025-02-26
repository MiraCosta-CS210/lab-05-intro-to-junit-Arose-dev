import static org.junit.jupiter.api.Assertions.*;

public class TipCalculatorTest {
    @org.junit.jupiter.api.Test
    void tipTest1() {
        TipCalculator tipCalculator = new TipCalculator();
        double result = tipCalculator.calculateTip(100.00,20);
        assertEquals(20.00, result);
    }

    @org.junit.jupiter.api.Test
    void tipTest2() {
        TipCalculator tipCalculator = new TipCalculator();
        double result = tipCalculator.calculateTip(25.00,25);
        assertEquals(6.25, result);
    }
}
