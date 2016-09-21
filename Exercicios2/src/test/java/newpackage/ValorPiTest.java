package newpackage;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hyago Vieira de Souza
 */
public class ValorPiTest {

    /**
     * Test of confereValores method, of class ValorPi.
     */
    @Test
    public void testConfereValores() {
        System.out.println("confereValores");
    }

    /**
     * Test of acharPi method, of class ValorPi.
     */
    @Test
    public void testAcharPi() {
        System.out.println("acharPi");
        int n = 1;
        double expResult = 4.0;
        double result = ValorPi.acharPi(n);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of acharPi method, of class ValorPi.
     */
    @Test
    public void testAcharPi2() {
        System.out.println("acharPi");
        int n = 2;
        double expResult = 2.666666626930237;
        double result = ValorPi.acharPi(n);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of acharPi method, of class ValorPi.
     */
    @Test
    public void testAcharPi3() {
        System.out.println("acharPi");
        int n = 3;
        double expResult = 3.4666666388511658;
        double result = ValorPi.acharPi(n);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of acharPi method, of class ValorPi.
     */
    @Test
    public void testAcharPi4() {
        System.out.println("acharPi");
        int n = 5;
        double expResult = 3.33968248963356;
        double result = ValorPi.acharPi(n);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of acharPi method, of class ValorPi.
     */
    @Test
    public void testAcharPi5() {
        System.out.println("acharPi");
        int n = 10;
        double expResult = 3.0418395549058914;
        double result = ValorPi.acharPi(n);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of acharPi method, of class ValorPi.
     */
    @Test
    public void testAcharPi6() {
        System.out.println("acharPi");
        int n = 50;
        double expResult = 3.121594585478306;
        double result = ValorPi.acharPi(n);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of acharPi method, of class ValorPi.
     */
    @Test
    public void testAcharPi7() {
        System.out.println("acharPi");
        int n = 25;
        double expResult = 3.1815766245126724;
        double result = ValorPi.acharPi(n);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of acharPi method, of class ValorPi.
     */
    @Test
    public void testAcharPi8() {
        System.out.println("acharPi");
        int n = 99;
        double expResult = 3.151693342253566;
        double result = ValorPi.acharPi(n);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of main method, of class ValorPi.
     */
    @Test
    public void testMain() {
        System.out.println("main");
    }
    
}
