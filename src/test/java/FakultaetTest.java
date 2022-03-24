import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakultaetTest {

    @org.junit.jupiter.api.Test
    void fact_I0_O1() {
        assertEquals(1,Fakultaet.fact(0));
    }
    @Test
    void fact_I1_O1() {
        assertEquals(1,Fakultaet.fact(1));
    }

    @Test
    void fact_I2_O2() {
        assertEquals(2,Fakultaet.fact(2));
    }

    @Test
    void fact_I3_O6() {
        assertEquals(6,Fakultaet.fact(3));
    }

}