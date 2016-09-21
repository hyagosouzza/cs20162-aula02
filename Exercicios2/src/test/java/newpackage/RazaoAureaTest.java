package newpackage;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hyago Vieira de Souza
 */
public class RazaoAureaTest {
    
    /**
     * Test of razaoAurea method, of class RazaoAurea.
     */
    @Test
    public void testRazaoAurea() {
        System.out.println("razaoAurea");
        int x = 0;
        int y = 1;
        int z = 1;
        double expResult = 1.0;
        double result = RazaoAurea.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of razaoAurea method, of class RazaoAurea.
     */
    @Test
    public void testRazaoAurea2() {
        System.out.println("razaoAurea");
        int x = 0;
        int y = 1;
        int z = 2;
        double expResult = 2.0;
        double result = RazaoAurea.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of razaoAurea method, of class RazaoAurea.
     */
    @Test
    public void testRazaoAurea3() {
        System.out.println("razaoAurea");
        int x = 1;
        int y = 2;
        int z = 3;
        double expResult = 1.6;
        double result = RazaoAurea.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of razaoAurea method, of class RazaoAurea.
     */
    @Test
    public void testRazaoAurea4() {
        System.out.println("razaoAurea");
        int x = 1;
        int y = 2;
        int z = 2;
        double expResult = 1.6666666666666667;
        double result = RazaoAurea.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of razaoAurea method, of class RazaoAurea.
     */
    @Test
    public void testRazaoAurea5() {
        System.out.println("razaoAurea");
        int x = 0;
        int y = 5;
        int z = 5;
        double expResult = 1.6;
        double result = RazaoAurea.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of razaoAurea method, of class RazaoAurea.
     */
    @Test
    public void testRazaoAurea6() {
        System.out.println("razaoAurea");
        int x = 0;
        int y = 10;
        int z = 15;
        double expResult = 1.618032786885246;
        double result = RazaoAurea.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of razaoAurea method, of class RazaoAurea.
     */
    @Test
    public void testRazaoAurea7() {
        System.out.println("razaoAurea");
        int x = 6;
        int y = 9;
        int z = 10;
        double expResult = 1.6180257510729614;
        double result = RazaoAurea.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of razaoAurea method, of class RazaoAurea.
     */
    @Test
    public void testRazaoAurea8() {
        System.out.println("razaoAurea");
        int x = 2;
        int y = 4;
        int z = 8;
        double expResult = 1.6181818181818182;
        double result = RazaoAurea.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of razaoAurea method, of class RazaoAurea.
     */
    @Test
    public void testRazaoAurea9() {
        System.out.println("razaoAurea");
        int x = 64;
        int y = 99;
        int z = 1;
        double expResult = 1.6464646464646464;
        double result = RazaoAurea.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of main method, of class RazaoAurea.
     */
    @Test
    public void testMain() {
        System.out.println("main");
    }
    
}
