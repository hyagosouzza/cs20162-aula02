package newpackage;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hyago Vieira de Souza
 */
public class LogaritmoNaturalTest {

    /**
     * Test of fatorial method, of class LogaritmoNatural.
     */
    @Test
    public void testFatorial() {
        System.out.println("fatorial");
        float n = 0;
        float expResult = 1;
        float result = LogaritmoNatural.fatorial(n);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of fatorial method, of class LogaritmoNatural.
     */
    @Test
    public void testFatorial2() {
        System.out.println("fatorial");
        float n = 1;
        float expResult = 1;
        float result = LogaritmoNatural.fatorial(n);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of potencia method, of class LogaritmoNatural.
     */
    @Test
    public void testPotencia() {
        System.out.println("potencia");
        float n = 1;
        float m = 2;
        float expResult = 1;
        float result = LogaritmoNatural.potencia(n, m);
        assertEquals(expResult, result, 0.0);

    }
    /**
     * Test of potencia method, of class LogaritmoNatural.
     */
    @Test
    public void testPotencia2() {
        System.out.println("potencia");
        float n = 2;
        float m = 2;
        float expResult = 4;
        float result = LogaritmoNatural.potencia(n, m);
        assertEquals(expResult, result, 0.0);

    }
    /**
     * Test of potencia method, of class LogaritmoNatural.
     */
    @Test
    public void testPotencia3() {
        System.out.println("potencia");
        float n = 2;
        float m = 0;
        float expResult = 1;
        float result = LogaritmoNatural.potencia(n, m);
        assertEquals(expResult, result, 0.0);

    }
    /**
     * Test of potencia method, of class LogaritmoNatural.
     */
    @Test
    public void testPotencia4() {
        System.out.println("potencia");
        float n = 2;
        float m = 1;
        float expResult = 2;
        float result = LogaritmoNatural.potencia(n, m);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of logNat method, of class LogaritmoNatural.
     */
    @Test
    public void testLogNat() {
        System.out.println("logNat");
        float a = 1;
        float b = 2;
        float expResult = 2.5f;
        float result = LogaritmoNatural.logNat(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of main method, of class LogaritmoNatural.
     */
    @Test
    public void testMain() {
        System.out.println("main");
    }
    
}
