package newpackage;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hyago Vieira de Souza
 */
public class QuadradoPerfeitoTest {

    /**
     * Test of confereValores method, of class QuadradoPerfeito.
     */
    @Test
    public void testConfereValores() {
        System.out.println("confereValores");
    }

    /**
     * Test of quadPer method, of class QuadradoPerfeito.
     */
    @Test
    public void testQuadPer() {
        System.out.println("quadPer");
        int n = 1;
        boolean expResult = true;
        boolean result = QuadradoPerfeito.quadPer(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of quadPer method, of class QuadradoPerfeito.
     */
    @Test
    public void testQuadPer2() {
        System.out.println("quadPer");
        int n = 10;
        boolean expResult = false;
        boolean result = QuadradoPerfeito.quadPer(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of quadPer method, of class QuadradoPerfeito.
     */
    @Test
    public void testQuadPer3() {
        System.out.println("quadPer");
        int n = 144;
        boolean expResult = true;
        boolean result = QuadradoPerfeito.quadPer(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of quadPer method, of class QuadradoPerfeito.
     */
    @Test
    public void testQuadPer4() {
        System.out.println("quadPer");
        int n = 64;
        boolean expResult = true;
        boolean result = QuadradoPerfeito.quadPer(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of quadPer method, of class QuadradoPerfeito.
     */
    @Test
    public void testQuadPer5() {
        System.out.println("quadPer");
        int n = 2;
        boolean expResult = false;
        boolean result = QuadradoPerfeito.quadPer(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of quadPer method, of class QuadradoPerfeito.
     */
    @Test
    public void testQuadPer6() {
        System.out.println("quadPer");
        int n = 9;
        boolean expResult = true;
        boolean result = QuadradoPerfeito.quadPer(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of quadPer method, of class QuadradoPerfeito.
     */
    @Test
    public void testQuadPer7() {
        System.out.println("quadPer");
        int n = 3;
        boolean expResult = false;
        boolean result = QuadradoPerfeito.quadPer(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of quadPer method, of class QuadradoPerfeito.
     */
    @Test
    public void testQuadPer8() {
        System.out.println("quadPer");
        int n = 25;
        boolean expResult = true;
        boolean result = QuadradoPerfeito.quadPer(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class QuadradoPerfeito.
     */
    @Test
    public void testMain() {
        System.out.println("main");
    }
    
}
