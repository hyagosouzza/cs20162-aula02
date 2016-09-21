package newpackage;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hyago Vieira de Souza
 */
public class MaiorDivisorComumTest {
    
    public MaiorDivisorComumTest() {
    }
    
    /**
     * Test of main method, of class MaiorDivisorComum.
     */
    @Test
    public void testMain() {
        System.out.println("main");
    }

    /**
     * Test of maiorDivisorComum method, of class MaiorDivisorComum.
     */
    @Test
    public void testMaiorDivisorComum() {
        System.out.println("maiorDivisorComum");
        int a = 1;
        int b = 1;
        int expResult = 1;
        int result = MaiorDivisorComum.maiorDivisorComum(a, b);
        assertEquals(expResult, result);
    }
    /**
     * Test of maiorDivisorComum method, of class MaiorDivisorComum.
     */
    @Test
    public void testMaiorDivisorComum2() {
        System.out.println("maiorDivisorComum");
        int a = 2;
        int b = 2;
        int expResult = 2;
        int result = MaiorDivisorComum.maiorDivisorComum(a, b);
        assertEquals(expResult, result);
    }
    /**
     * Test of maiorDivisorComum method, of class MaiorDivisorComum.
     */
    @Test
    public void testMaiorDivisorComum3() {
        System.out.println("maiorDivisorComum");
        int a = 0;
        int b = 4;
        int expResult = 4;
        int result = MaiorDivisorComum.maiorDivisorComum(a, b);
        assertEquals(expResult, result);
    }
    /**
     * Test of maiorDivisorComum method, of class MaiorDivisorComum.
     */
    @Test
    public void testMaiorDivisorComum4() {
        System.out.println("maiorDivisorComum");
        int a = 7;
        int b = 0;
        int expResult = 7;
        int result = MaiorDivisorComum.maiorDivisorComum(a, b);
        assertEquals(expResult, result);
    }
    /**
     * Test of maiorDivisorComum method, of class MaiorDivisorComum.
     */
    @Test
    public void testMaiorDivisorComum5() {
        System.out.println("maiorDivisorComum");
        int a = 10;
        int b = 5;
        int expResult = 5;
        int result = MaiorDivisorComum.maiorDivisorComum(a, b);
        assertEquals(expResult, result);
    }
    /**
     * Test of maiorDivisorComum method, of class MaiorDivisorComum.
     */
    @Test
    public void testMaiorDivisorComum6() {
        System.out.println("maiorDivisorComum");
        int a = 16;
        int b = 12;
        int expResult = 4;
        int result = MaiorDivisorComum.maiorDivisorComum(a, b);
        assertEquals(expResult, result);
    }
    /**
     * Test of maiorDivisorComum method, of class MaiorDivisorComum.
     */
    @Test
    public void testMaiorDivisorComum7() {
        System.out.println("maiorDivisorComum");
        int a = 27;
        int b = 25;
        int expResult = 1;
        int result = MaiorDivisorComum.maiorDivisorComum(a, b);
        assertEquals(expResult, result);
    }
    
}
