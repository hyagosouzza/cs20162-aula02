package newpackage;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hyago Vieira de Souza
 */
public class FibonacciTest {

    /**
     * Test of fibo method, of class Fibonacci.
     */
    @Test
    public void testFibo() {
        System.out.println("fibo");
        int n = 0;
        int expResult = 0;
        int result = Fibonacci.fibo(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of fibo method, of class Fibonacci.
     */
    @Test
    public void testFibo2() {
        System.out.println("fibo");
        int n = 1;
        int expResult = 1;
        int result = Fibonacci.fibo(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of fibo method, of class Fibonacci.
     */
    @Test
    public void testFibo3() {
        System.out.println("fibo");
        int n = 2;
        int expResult = 1;
        int result = Fibonacci.fibo(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of fibo method, of class Fibonacci.
     */
    @Test
    public void testFibo4() {
        System.out.println("fibo");
        int n = 3;
        int expResult = 2;
        int result = Fibonacci.fibo(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of fibo method, of class Fibonacci.
     */
    @Test
    public void testFibo5() {
        System.out.println("fibo");
        int n = 4;
        int expResult = 3;
        int result = Fibonacci.fibo(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of fibo method, of class Fibonacci.
     */
    @Test
    public void testFibo6() {
        System.out.println("fibo");
        int n = 5;
        int expResult = 5;
        int result = Fibonacci.fibo(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of fibo method, of class Fibonacci.
     */
    @Test
    public void testFibo7() {
        System.out.println("fibo");
        int n = 6;
        int expResult = 8;
        int result = Fibonacci.fibo(n);
        assertEquals(expResult, result);
    }
    /**
     * Test of fibo method, of class Fibonacci.
     */
    @Test
    public void testFibo8() {
        System.out.println("fibo");
        int n = 7;
        int expResult = 13;
        int result = Fibonacci.fibo(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class Fibonacci.
     */
    @Test
    public void testMain() {
        System.out.println("main");
    }
    
}
