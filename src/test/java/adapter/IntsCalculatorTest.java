package adapter;

import org.junit.jupiter.api.Test;
import ru.example.adapter.IntsCalculator;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntsCalculatorTest {
    IntsCalculator calculator = new IntsCalculator();
    @Test
    void sumTest(){
        int answer = calculator.sum(103, 203);
        assertEquals(306, answer);
    }
    @Test
    void multTest(){
        int answer = calculator.mult(3, 33);
        assertEquals(99, answer);
    }
    @Test
    void powTest(){
        int answer = calculator.pow(2, 11);
        assertEquals(2048, answer);
    }

}
