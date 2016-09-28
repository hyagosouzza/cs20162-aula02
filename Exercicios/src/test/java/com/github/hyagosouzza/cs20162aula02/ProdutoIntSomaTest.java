package com.github.hyagosouzza.cs20162aula02;

import com.github.hyagosouzza.cs20162aula02.ProdutoIntSoma;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoIntSomaTest {

    @Test
    public void testProdutoIntSomando() {
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = ProdutoIntSoma.produtoIntSomando(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testProdutoIntSomando2() {
        int a = 1;
        int b = 1;
        int expResult = 1;
        int result = ProdutoIntSoma.produtoIntSomando(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testProdutoIntSomando3() {
        int a = 7;
        int b = 3;
        int expResult = 21;
        int result = ProdutoIntSoma.produtoIntSomando(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testProdutoIntSomando4() {
        int a = 9;
        int b = 5;
        int expResult = 45;
        int result = ProdutoIntSoma.produtoIntSomando(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testProdutoIntSomando5() {
        int a = 10;
        int b = 10;
        int expResult = 100;
        int result = ProdutoIntSoma.produtoIntSomando(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testProdutoIntSomando6() {
        int a = 2;
        int b = 5;
        int expResult = 10;
        int result = ProdutoIntSoma.produtoIntSomando(a, b);
        assertEquals(expResult, result);
    }
    
}
