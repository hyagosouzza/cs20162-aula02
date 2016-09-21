package newpackage;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hyago Vieira de Souza
 */
public class SomatorioElementarTest {
    
    /**
     * Test of confereValores method, of class SomatorioElementar.
     */
    @Test
    public void testConfereValores() {
        System.out.println("confereValores");
    }

    /**
     * Test of somaNaturais method, of class SomatorioElementar.
     */
    @Test
    public void testSomaNaturais() {
        System.out.println("somaNaturais");
        int n = 1;
        double expResult = 0.5;
        double result = SomatorioElementar.somaNaturais(n);
        assertEquals(expResult, result, 0.0);

    }
    /**
     * Test of somaNaturais method, of class SomatorioElementar.
     */
    @Test
    public void testSomaNaturais2() {
        System.out.println("somaNaturais");
        int n = 2;
        double expResult = 0.7000000029802322;
        double result = SomatorioElementar.somaNaturais(n);
        assertEquals(expResult, result, 0.0);

    }
    /**
     * Test of somaNaturais method, of class SomatorioElementar.
     */
    @Test
    public void testSomaNaturais3() {
        System.out.println("somaNaturais");
        int n = 3;
        double expResult = 0.7000000029802322;
        double result = SomatorioElementar.somaNaturais(n);
        assertEquals(expResult, result, 0.0);

    }
    /**
     * Test of somaNaturais method, of class SomatorioElementar.
     */
    @Test
    public void testSomaNaturais4() {
        System.out.println("somaNaturais");
        int n = 9;
        double expResult = 0.7742081480100751;
        double result = SomatorioElementar.somaNaturais(n);
        assertEquals(expResult, result, 0.0);

    }
    /**
     * Test of somaNaturais method, of class SomatorioElementar.
     */
    @Test
    public void testSomaNaturais5() {
        System.out.println("somaNaturais");
        int n = 10;
        double expResult = 0.7742081480100751;
        double result = SomatorioElementar.somaNaturais(n);
        assertEquals(expResult, result, 0.0);

    }
    /**
     * Test of somaNaturais method, of class SomatorioElementar.
     */
    @Test
    public void testSomaNaturais6() {
        System.out.println("somaNaturais");
        int n = 21;
        double expResult = 0.7780991985928267;
        double result = SomatorioElementar.somaNaturais(n);
        assertEquals(expResult, result, 0.0);

    }
    /**
     * Test of somaNaturais method, of class SomatorioElementar.
     */
    @Test
    public void testSomaNaturais7() {
        System.out.println("somaNaturais");
        int n = 100;
        double expResult = 0.77931888938474;
        double result = SomatorioElementar.somaNaturais(n);
        assertEquals(expResult, result, 0.0);

    }
    /**
     * Test of somaNaturais method, of class SomatorioElementar.
     */
    @Test
    public void testSomaNaturais8() {
        System.out.println("somaNaturais");
        int n = 50;
        double expResult = 0.7790748083498329;
        double result = SomatorioElementar.somaNaturais(n);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of main method, of class SomatorioElementar.
     */
    @Test
    public void testMain() {
        System.out.println("main");
    }
    
}
