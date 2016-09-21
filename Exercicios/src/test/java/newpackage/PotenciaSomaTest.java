package newpackage;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hyago Vieira de Souza
 */
public class PotenciaSomaTest {
    
    public PotenciaSomaTest() {
    }
    
    /**
     * Test of main method, of class PotenciaSoma.
     */
    @Test
    public void testMain() {
        System.out.println("main");
    }

    /**
     * Test of confereValores method, of class PotenciaSoma.
     */
    @Test
    public void testConfereValores() {
        System.out.println("confereValores");
    }

    /**
     * Test of potenciaSoma method, of class PotenciaSoma.
     */
    @Test
    public void testPotenciaSoma() {
        System.out.println("potenciaSoma");
        int x = 0;
        int y = 1;
        int expResult = 0;
        int result = PotenciaSoma.potenciaSoma(x, y);
        assertEquals(expResult, result);
    }
    /**
     * Test of potenciaSoma method, of class PotenciaSoma.
     */
    @Test
    public void testPotenciaSoma2() {
        System.out.println("potenciaSoma");
        int x = 1;
        int y = 0;
        int expResult = 1;
        int result = PotenciaSoma.potenciaSoma(x, y);
        assertEquals(expResult, result);
    }
    /**
     * Test of potenciaSoma method, of class PotenciaSoma.
     */
    @Test
    public void testPotenciaSoma3() {
        System.out.println("potenciaSoma");
        int x = 5;
        int y = 1;
        int expResult = 5;
        int result = PotenciaSoma.potenciaSoma(x, y);
        assertEquals(expResult, result);
    }
    /**
     * Test of potenciaSoma method, of class PotenciaSoma.
     */
    @Test
    public void testPotenciaSoma4() {
        System.out.println("potenciaSoma");
        int x = 7;
        int y = 0;
        int expResult = 1;
        int result = PotenciaSoma.potenciaSoma(x, y);
        assertEquals(expResult, result);
    }
    /**
     * Test of potenciaSoma method, of class PotenciaSoma.
     */
    @Test
    public void testPotenciaSoma5() {
        System.out.println("potenciaSoma");
        int x = 10;
        int y = 2;
        int expResult = 100;
        int result = PotenciaSoma.potenciaSoma(x, y);
        assertEquals(expResult, result);
    }
    /**
     * Test of potenciaSoma method, of class PotenciaSoma.
     */
    @Test
    public void testPotenciaSoma6() {
        System.out.println("potenciaSoma");
        int x = 3;
        int y = 3;
        int expResult = 27;
        int result = PotenciaSoma.potenciaSoma(x, y);
        assertEquals(expResult, result);
    }
    /**
     * Test of potenciaSoma method, of class PotenciaSoma.
     */
    @Test
    public void testPotenciaSoma7() {
        System.out.println("potenciaSoma");
        int x = 5;
        int y = 3;
        int expResult = 125;
        int result = PotenciaSoma.potenciaSoma(x, y);
        assertEquals(expResult, result);
    }
    
}
