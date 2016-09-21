package newpackage;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hyago Vieira de Souza
 */
public class NumeroHarmonicoTest {
    
    public NumeroHarmonicoTest() {
    }

    /**
     * Test of main method, of class NumeroHarmonico.
     */
    @Test
    public void testMain() {
        System.out.println("main");
    }

    /**
     * Test of confereValores method, of class NumeroHarmonico.
     */
    @Test
    public void testConfereValores() {
        System.out.println("confereValores");
    }

    /**
     * Test of numHarmonico method, of class NumeroHarmonico.
     */
    @Test
    public void testNumHarmonico() {
        System.out.println("numHarmonico");
        int n = 1;
        float expResult = 1.0F;
        float result = NumeroHarmonico.numHarmonico(n);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of numHarmonico method, of class NumeroHarmonico.
     */
    @Test
    public void testNumHarmonico2() {
        System.out.println("numHarmonico");
        int n = 2;
        float expResult = 1.5F;
        float result = NumeroHarmonico.numHarmonico(n);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of numHarmonico method, of class NumeroHarmonico.
     */
    @Test
    public void testNumHarmonico3() {
        System.out.println("numHarmonico");
        int n = 3;
        float expResult = 1.8333334F;
        float result = NumeroHarmonico.numHarmonico(n);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of numHarmonico method, of class NumeroHarmonico.
     */
    @Test
    public void testNumHarmonico4() {
        System.out.println("numHarmonico");
        int n = 5;
        float expResult = 2.2833335F;
        float result = NumeroHarmonico.numHarmonico(n);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of numHarmonico method, of class NumeroHarmonico.
     */
    @Test
    public void testNumHarmonico5() {
        System.out.println("numHarmonico");
        int n = 7;
        float expResult = 2.5928574F;
        float result = NumeroHarmonico.numHarmonico(n);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of numHarmonico method, of class NumeroHarmonico.
     */
    @Test
    public void testNumHarmonico6() {
        System.out.println("numHarmonico");
        int n = 10;
        float expResult = 2.9289684F;
        float result = NumeroHarmonico.numHarmonico(n);
        assertEquals(expResult, result, 0.0);
    }
    
}
