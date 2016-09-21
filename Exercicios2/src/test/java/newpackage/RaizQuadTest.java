package newpackage;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hyago Vieira de Souza
 */
public class RaizQuadTest {

    /**
     * Test of raizQuadrada method, of class RaizQuad.
     */
    @Test
    public void testRaizQuadrada() {
        System.out.println("raizQuadrada");
        int n = 0;
        int i = 1;
        double expResult = 0.25;
        double result = RaizQuad.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of raizQuadrada method, of class RaizQuad.
     */
    @Test
    public void testRaizQuadrada2() {
        System.out.println("raizQuadrada");
        int n = 7;
        int i = 7;
        double expResult = 2.6457513110645907;
        double result = RaizQuad.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of raizQuadrada method, of class RaizQuad.
     */
    @Test
    public void testRaizQuadrada3() {
        System.out.println("raizQuadrada");
        int n = 81;
        int i = 4;
        double expResult = 9.014272376994608;
        double result = RaizQuad.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of raizQuadrada method, of class RaizQuad.
     */
    @Test
    public void testRaizQuadrada4() {
        System.out.println("raizQuadrada");
        int n = 49;
        int i = 7;
        double expResult = 7.0;
        double result = RaizQuad.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of raizQuadrada method, of class RaizQuad.
     */
    @Test
    public void testRaizQuadrada5() {
        System.out.println("raizQuadrada");
        int n = 25;
        int i = 3;
        double expResult = 5.015247601944898;
        double result = RaizQuad.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of raizQuadrada method, of class RaizQuad.
     */
    @Test
    public void testRaizQuadrada6() {
        System.out.println("raizQuadrada");
        int n = 9;
        int i = 2;
        double expResult = 3.023529411764706;
        double result = RaizQuad.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of raizQuadrada method, of class RaizQuad.
     */
    @Test
    public void testRaizQuadrada7() {
        System.out.println("raizQuadrada");
        int n = 9;
        int i = 5;
        double expResult = 3.0;
        double result = RaizQuad.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of raizQuadrada method, of class RaizQuad.
     */
    @Test
    public void testRaizQuadrada8() {
        System.out.println("raizQuadrada");
        int n = 2;
        int i = 1;
        double expResult = 1.4166666666666665;
        double result = RaizQuad.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of raizQuadrada method, of class RaizQuad.
     */
    @Test
    public void testRaizQuadrada9() {
        System.out.println("raizQuadrada");
        int n = 2;
        int i = 3;
        double expResult = 1.4142135623746899;
        double result = RaizQuad.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of main method, of class RaizQuad.
     */
    @Test
    public void testMain() {
        System.out.println("main");
    }
    
}
