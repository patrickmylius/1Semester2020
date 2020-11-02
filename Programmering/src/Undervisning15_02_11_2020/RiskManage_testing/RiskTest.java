package Undervisning15_02_11_2020.RiskManage_testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RiskTest {

    @Test
    void hello() {
        Risk risk = new Risk();
        assertEquals("Hello", risk.hello());
    }


}