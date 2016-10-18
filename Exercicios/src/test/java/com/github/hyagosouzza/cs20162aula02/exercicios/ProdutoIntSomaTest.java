package com.github.hyagosouzza.cs20162aula02.exercicios;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProdutoIntSomaTest {
    
    @Test
    public void testProdutoIntSomando() {
        int a = 0;
        int b = 0;
        int expResult = 0;
        ProdutoIntSoma instance = new ProdutoIntSoma();
        int result = instance.produtoIntSomando(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testProdutoIntSomando2() {
        int a = 1;
        int b = 1;
        int expResult = 1;
        ProdutoIntSoma instance = new ProdutoIntSoma();
        int result = instance.produtoIntSomando(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testProdutoIntSomando3() {
        int a = 7;
        int b = 3;
        int expResult = 21;
        ProdutoIntSoma instance = new ProdutoIntSoma();
        int result = instance.produtoIntSomando(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testProdutoIntSomando4() {
        int a = 9;
        int b = 5;
        int expResult = 45;
        ProdutoIntSoma instance = new ProdutoIntSoma();
        int result = instance.produtoIntSomando(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testProdutoIntSomando5() {
        int a = 10;
        int b = 10;
        int expResult = 100;
        ProdutoIntSoma instance = new ProdutoIntSoma();
        int result = instance.produtoIntSomando(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testProdutoIntSomando6() {
        int a = 2;
        int b = 5;
        int expResult = 10;
        ProdutoIntSoma instance = new ProdutoIntSoma();
        int result = instance.produtoIntSomando(a, b);
        assertEquals(expResult, result);
    }
}
