package newpackage;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hyago Vieira de Souza
 */
public class ProdutoIntSomaTest {
    
    public ProdutoIntSomaTest() {
    }

    /**
     * Test of main method, of class ProdutoIntSoma.
     */
    @Test
    public void testMain() {
        System.out.println("main");
    }

    /**
     * Test of confereValores method, of class ProdutoIntSoma.
     */
    @Test
    public void testConfereValores() {
        System.out.println("confereValores");
    }

    /**
     * Test of produtoIntSomando method, of class ProdutoIntSoma.
     */
    @Test
    public void testProdutoIntSomando() {
        System.out.println("produtoIntSomando");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = ProdutoIntSoma.produtoIntSomando(a, b);
        assertEquals(expResult, result);
    }
    /**
     * Test of produtoIntSomando method, of class ProdutoIntSoma.
     */
    @Test
    public void testProdutoIntSomando2() {
        System.out.println("produtoIntSomando");
        int a = 1;
        int b = 1;
        int expResult = 1;
        int result = ProdutoIntSoma.produtoIntSomando(a, b);
        assertEquals(expResult, result);
    }
    /**
     * Test of produtoIntSomando method, of class ProdutoIntSoma.
     */
    @Test
    public void testProdutoIntSomando3() {
        System.out.println("produtoIntSomando");
        int a = 7;
        int b = 3;
        int expResult = 21;
        int result = ProdutoIntSoma.produtoIntSomando(a, b);
        assertEquals(expResult, result);
    }
    /**
     * Test of produtoIntSomando method, of class ProdutoIntSoma.
     */
    @Test
    public void testProdutoIntSomando4() {
        System.out.println("produtoIntSomando");
        int a = 9;
        int b = 5;
        int expResult = 45;
        int result = ProdutoIntSoma.produtoIntSomando(a, b);
        assertEquals(expResult, result);
    }
    /**
     * Test of produtoIntSomando method, of class ProdutoIntSoma.
     */
    @Test
    public void testProdutoIntSomando5() {
        System.out.println("produtoIntSomando");
        int a = 10;
        int b = 10;
        int expResult = 100;
        int result = ProdutoIntSoma.produtoIntSomando(a, b);
        assertEquals(expResult, result);
    }
    /**
     * Test of produtoIntSomando method, of class ProdutoIntSoma.
     */
    @Test
    public void testProdutoIntSomando6() {
        System.out.println("produtoIntSomando");
        int a = 2;
        int b = 5;
        int expResult = 10;
        int result = ProdutoIntSoma.produtoIntSomando(a, b);
        assertEquals(expResult, result);
    }
    
}
