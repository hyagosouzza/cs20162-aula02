package newpackage;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hyago Vieira de Souza
 */
public class SomaNaturaisTest {
    
    public SomaNaturaisTest() {
    }

    /**
     * Test of soma method, of class SomaNaturais.
     */
    @Test
    public void testSoma() {
        System.out.println("soma");
        int n = 1;
        int expResult = 1;
        int result = SomaNaturais.soma(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of soma method, of class SomaNaturais.
     */
    @Test
    public void testSoma2() {
        System.out.println("soma");
        int n = 2;
        int expResult = 3;
        int result = SomaNaturais.soma(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of soma method, of class SomaNaturais.
     */
    @Test
    public void testSoma3() {
        System.out.println("soma");
        int n = 3;
        int expResult = 6;
        int result = SomaNaturais.soma(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of soma method, of class SomaNaturais.
     */
    @Test
    public void testSoma4() {
        System.out.println("soma");
        int n = 4;
        int expResult = 10;
        int result = SomaNaturais.soma(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of soma method, of class SomaNaturais.
     */
    @Test
    public void testSoma5() {
        System.out.println("soma");
        int n = 5;
        int expResult = 15;
        int result = SomaNaturais.soma(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of soma method, of class SomaNaturais.
     */
    @Test
    public void testSoma6() {
        System.out.println("soma");
        int n = 6;
        int expResult = 21;
        int result = SomaNaturais.soma(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of soma method, of class SomaNaturais.
     */
    @Test
    public void testSoma7() {
        System.out.println("soma");
        int n = 7;
        int expResult = 28;
        int result = SomaNaturais.soma(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class SomaNaturais.
     */
    @Test
    public void testMain() {
        System.out.println("main");
    }
    
}
