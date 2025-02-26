import static org.junit.jupiter.api.Assertions.*;


public class SumNumbersTest {
    @org.junit.jupiter.api.Test
    void ifEvenTest1() {
        SumNumbers sumNumbers = new SumNumbers();
        int result = sumNumbers.sumIsEven(1,1);
        assertEquals(1, result);
    }

    @org.junit.jupiter.api.Test
    void ifEvenTest2() {
        SumNumbers sumNumbers = new SumNumbers();
        int result = sumNumbers.sumIsEven(1,2);
        assertEquals(0, result);
    }
}
