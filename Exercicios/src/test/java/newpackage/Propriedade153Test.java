package newpackage;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Inclusão 2
 */
public class Propriedade153Test {
    
    public Propriedade153Test() {
    }

    /**
     * Test of main method, of class Propriedade153.
     */
    @Test
    public void testMain() {
        System.out.println("main");
    }

    /**
     * Test of confereValores method, of class Propriedade153.
     */
    @Test
    public void testConfereValores() {
        System.out.println("confereValores");
    }

    /**
     * Test of propriedade method, of class Propriedade153.
     */
    @Test
    public void testPropriedade() {
        System.out.println("propriedade");
        int n = 0;
        boolean expResult = true;
        boolean result = Propriedade153.propriedade(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of propriedade method, of class Propriedade153.
     */
    @Test
    public void testPropriedade2() {
        System.out.println("propriedade");
        int n = 1;
        boolean expResult = true;
        boolean result = Propriedade153.propriedade(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of propriedade method, of class Propriedade153.
     */
    @Test
    public void testPropriedade3() {
        System.out.println("propriedade");
        int n = 9999;
        boolean expResult = false;
        boolean result = Propriedade153.propriedade(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of propriedade method, of class Propriedade153.
     */
    @Test
    public void testPropriedade4() {
        System.out.println("propriedade");
        int n = 10;
        boolean expResult = false;
        boolean result = Propriedade153.propriedade(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of propriedade method, of class Propriedade153.
     */
    @Test
    public void testPropriedade5() {
        System.out.println("propriedade");
        int n = 153;
        boolean expResult = true;
        boolean result = Propriedade153.propriedade(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of propriedade method, of class Propriedade153.
     */
    @Test
    public void testPropriedade6() {
        System.out.println("propriedade");
        int n = 1001;
        boolean expResult = true;
        boolean result = Propriedade153.propriedade(n);
        assertEquals(expResult, result);
    }
    
}
