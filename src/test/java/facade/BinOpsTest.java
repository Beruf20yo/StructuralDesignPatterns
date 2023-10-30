package facade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.example.facade.BinOps;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinOpsTest {
    BinOps binOps = new BinOps();
    @Test
    void sumTest(){
        String answer = binOps.sum("1100100","11001000");
        assertEquals("100101100", answer);
    }

    @Test
    void multTest() {
        String answer = binOps.mult("1100100","11001000");
        assertEquals("100111000100000", answer);
    }
}
