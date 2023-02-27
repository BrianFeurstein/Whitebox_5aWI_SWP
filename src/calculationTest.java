import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class calculationTest {
    private calculation c1;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        c1 = new calculation();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void addition() {
        double result = c1.addition(4,3);
        Assertions.assertEquals(7, result);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        try{
            double result = c1.divide(4,0);
            Assertions.assertTrue(false);
        }catch (Exception ex){
            Assertions.assertTrue(true);
        }
    }
}