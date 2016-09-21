package newpackage;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hyago Vieira de Souza
 */
public class RestoDivIntTest {
    
    /**
     * Test of mod method, of class RestoDivInt.
     */
    @Test
    public void testMod() {
        System.out.println("mod");
        int a = 1;
        int b = 1;
        int expResult = 0;
        int result = RestoDivInt.mod(a, b);
        assertEquals(expResult, result);
    }
    /**
     * Test of mod method, of class RestoDivInt.
     */
    @Test
    public void testMod2() {
        System.out.println("mod");
        int a = 35;
        int b = 7;
        int expResult = 0;
        int result = RestoDivInt.mod(a, b);
        assertEquals(expResult, result);
    }
    /**
     * Test of mod method, of class RestoDivInt.
     */
    @Test
    public void testMod3() {
        System.out.println("mod");
        int a = 9;
        int b = 6;
        int expResult = 3;
        int result = RestoDivInt.mod(a, b);
        assertEquals(expResult, result);
    }
    /**
     * Test of mod method, of class RestoDivInt.
     */
    @Test
    public void testMod4() {
        System.out.println("mod");
        int a = 64;
        int b = 5;
        int expResult = 4;
        int result = RestoDivInt.mod(a, b);
        assertEquals(expResult, result);
    }
    /**
     * Test of mod method, of class RestoDivInt.
     */
    @Test
    public void testMod5() {
        System.out.println("mod");
        int a = 4;
        int b = 3;
        int expResult = 1;
        int result = RestoDivInt.mod(a, b);
        assertEquals(expResult, result);
    }
    /**
     * Test of mod method, of class RestoDivInt.
     */
    @Test
    public void testMod6() {
        System.out.println("mod");
        int a = 10;
        int b = 9;
        int expResult = 1;
        int result = RestoDivInt.mod(a, b);
        assertEquals(expResult, result);
    }
    /**
     * Test of mod method, of class RestoDivInt.
     */
    @Test
    public void testMod7() {
        System.out.println("mod");
        int a = 5;
        int b = 2;
        int expResult = 1;
        int result = RestoDivInt.mod(a, b);
        assertEquals(expResult, result);
    }
    /**
     * Test of mod method, of class RestoDivInt.
     */
    @Test
    public void testMod8() {
        System.out.println("mod");
        int a = 2;
        int b = 5;
        int expResult = 2;
        int result = RestoDivInt.mod(a, b);
        assertEquals(expResult, result);
    }
    /**
     * Test of mod method, of class RestoDivInt.
     */
    @Test
    public void testMod9() {
        System.out.println("mod");
        int a = 1;
        int b = 1;
        int expResult = 0;
        int result = RestoDivInt.mod(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class RestoDivInt.
     */
    @Test
    public void testMain() {
        System.out.println("main");
    }
    
}
