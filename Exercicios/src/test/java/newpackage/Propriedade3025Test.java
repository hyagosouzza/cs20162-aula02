package newpackage;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hyago Vieira de Souza
 */
public class Propriedade3025Test {
    
    public Propriedade3025Test() {
    }

    /**
     * Test of main method, of class Propriedade3025.
     */
    @Test
    public void testMain() {
        System.out.println("main");
    }

    /**
     * Test of confereValores method, of class Propriedade3025.
     */
    @Test
    public void testConfereValores() {
        System.out.println("confereValores");
    }

    /**
     * Test of propriedade method, of class Propriedade3025.
     */
    @Test
    public void testPropriedade() {
        System.out.println("propriedade");
        int n = 2;
        boolean expResult = false;
        boolean result = Propriedade3025.propriedade(n);
        assertEquals(expResult, result);

    }
    /**
     * Test of propriedade method, of class Propriedade3025.
     */
    @Test
    public void testPropriedade2() {
        System.out.println("propriedade");
        int n = 0;
        boolean expResult = true;
        boolean result = Propriedade3025.propriedade(n);
        assertEquals(expResult, result);

    }
    /**
     * Test of propriedade method, of class Propriedade3025.
     */
    @Test
    public void testPropriedade3() {
        System.out.println("propriedade");
        int n = 1;
        boolean expResult = true;
        boolean result = Propriedade3025.propriedade(n);
        assertEquals(expResult, result);

    }
    /**
     * Test of propriedade method, of class Propriedade3025.
     */
    @Test
    public void testPropriedade4() {
        System.out.println("propriedade");
        int n = 3025;
        boolean expResult = true;
        boolean result = Propriedade3025.propriedade(n);
        assertEquals(expResult, result);

    }
    /**
     * Test of propriedade method, of class Propriedade3025.
     */
    @Test
    public void testPropriedade5() {
        System.out.println("propriedade");
        int n = 10;
        boolean expResult = false;
        boolean result = Propriedade3025.propriedade(n);
        assertEquals(expResult, result);

    }
    /**
     * Test of propriedade method, of class Propriedade3025.
     */
    @Test
    public void testPropriedade6() {
        System.out.println("propriedade");
        int n = 25;
        boolean expResult = false;
        boolean result = Propriedade3025.propriedade(n);
        assertEquals(expResult, result);

    }
    
}
