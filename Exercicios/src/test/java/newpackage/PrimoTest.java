package newpackage;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hyago Vieira de Souza
 */
public class PrimoTest {
    
    public PrimoTest() {
    }

    /**
     * Test of main method, of class Primo.
     */
    @Test
    public void testMain() {
        System.out.println("main");
    }

    /**
     * Test of confereValores method, of class Primo.
     */
    @Test
    public void testConfereValores() {
        System.out.println("confereValores");
    }

    /**
     * Test of primo method, of class Primo.
     */
    @Test
    public void testPrimo() {
        System.out.println("primo");
        int n = 1;
        boolean expResult = false;
        boolean result = Primo.primo(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of primo method, of class Primo.
     */
    @Test
    public void testPrimo2() {
        System.out.println("primo");
        int n = 11;
        boolean expResult = true;
        boolean result = Primo.primo(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of primo method, of class Primo.
     */
    @Test
    public void testPrimo3() {
        System.out.println("primo");
        int n = 15;
        boolean expResult = false;
        boolean result = Primo.primo(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of primo method, of class Primo.
     */
    @Test
    public void testPrimo4() {
        System.out.println("primo");
        int n = 9;
        boolean expResult = false;
        boolean result = Primo.primo(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of primo method, of class Primo.
     */
    @Test
    public void testPrimo5() {
        System.out.println("primo");
        int n = 5;
        boolean expResult = true;
        boolean result = Primo.primo(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of primo method, of class Primo.
     */
    @Test
    public void testPrimo6() {
        System.out.println("primo");
        int n = 10;
        boolean expResult = false;
        boolean result = Primo.primo(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of primo method, of class Primo.
     */
    @Test
    public void testPrimo7() {
        System.out.println("primo");
        int n = 3;
        boolean expResult = true;
        boolean result = Primo.primo(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of primo method, of class Primo.
     */
    @Test
    public void testPrimo8() {
        System.out.println("primo");
        int n = 2;
        boolean expResult = true;
        boolean result = Primo.primo(n);
        assertEquals(expResult, result);
    }
    
}
