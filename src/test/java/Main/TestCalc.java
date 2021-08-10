package Main;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @org.junit.jupiter.api.Test
    void testAddMethod() {
        assertEquals(Calc.add(2,3),5);
    }

    @org.junit.jupiter.api.Test
    void testSubtractMethod() {
        assertEquals(Calc.subtract(5,2),3);
    }
}
