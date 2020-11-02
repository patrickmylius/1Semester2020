package Undervisning15_02_11_2020.RiskManage_testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RiskTest {

    //Testing Risk Constructor
    @Test
    void RiskConstructorTest() {
        Risk risk1 = new Risk();
        assertEquals(0.01, risk1.getProbabilityPercent());
    }

    //Testing String
    @Test
    void hello() {
        Risk risk = new Risk();
        assertEquals("Hello", risk.hello());
    }

    //Testing with var set and get
    @Test
    void TestItAll() {
        //Testing risk for burned MB
        Risk risk = new Risk();

        risk.setDescription("Motherboard in PC, doesnt work");
        risk.setConsequence("Todays class is cancelled");
        risk.setProbabilityLevel(Probability.LOW);

        assertEquals("Motherboard in PC, doesnt work", risk.getDescription());
        assertEquals("Todays class is cancelled", risk.getConsequence());
        assertEquals(Probability.LOW, risk.getProbabilityLevel());
        assertEquals(0.01, risk.getProbabilityPercent());
    }


}