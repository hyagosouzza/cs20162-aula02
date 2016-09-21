package newpackage;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hyago Vieira de Souza
 */
public class FatorialTest {
    
    /**
     * Test of fatorial method, of class Fatorial.
     */
    @Test
    public void testFatorial() {
        System.out.println("fatorial");
        int n = 0;
        int expResult = 1;
        int result = Fatorial.fatorial(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of fatorial method, of class Fatorial.
     */
    @Test
    public void testFatorial2() {
        System.out.println("fatorial");
        int n = 1;
        int expResult = 1;
        int result = Fatorial.fatorial(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of fatorial method, of class Fatorial.
     */
    @Test
    public void testFatorial3() {
        System.out.println("fatorial");
        int n = 2;
        int expResult = 2;
        int result = Fatorial.fatorial(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of fatorial method, of class Fatorial.
     */
    @Test
    public void testFatorial4() {
        System.out.println("fatorial");
        int n = 3;
        int expResult = 6;
        int result = Fatorial.fatorial(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of fatorial method, of class Fatorial.
     */
    @Test
    public void testFatorial5() {
        System.out.println("fatorial");
        int n = 4;
        int expResult = 24;
        int result = Fatorial.fatorial(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of fatorial method, of class Fatorial.
     */
    @Test
    public void testFatorial6() {
        System.out.println("fatorial");
        int n = 5;
        int expResult = 120;
        int result = Fatorial.fatorial(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of fatorial method, of class Fatorial.
     */
    @Test
    public void testFatorial7() {
        System.out.println("fatorial");
        int n = 6;
        int expResult = 720;
        int result = Fatorial.fatorial(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of fatorial method, of class Fatorial.
     */
    @Test
    public void testFatorial8() {
        System.out.println("fatorial");
        int n = 7;
        int expResult = 5040;
        int result = Fatorial.fatorial(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of confereValores method, of class Fatorial.
     */
    @Test
    public void testConfereValores() {
        System.out.println("confereValores");
    }

    /**
     * Test of main method, of class Fatorial.
     */
    @Test
    public void testMain() {
        System.out.println("main");
    }
    
}
