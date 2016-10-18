package com.github.hyagosouzza.cs20162aula02.exercicios;

import org.junit.Test;

import static org.junit.Assert.*;

public class Propriedade153Test {
    
    @Test
    public void testPropriedade() {
        int n = 0;
        boolean expResult = true;
        Propriedade153 instance = new Propriedade153();
        boolean result = instance.propriedade(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPropriedade2() {
        int n = 1;
        boolean expResult = true;
        Propriedade153 instance = new Propriedade153();
        boolean result = instance.propriedade(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPropriedade3() {
        int n = 9999;
        boolean expResult = false;
        Propriedade153 instance = new Propriedade153();
        boolean result = instance.propriedade(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPropriedade4() {
        int n = 10;
        boolean expResult = false;
        Propriedade153 instance = new Propriedade153();
        boolean result = instance.propriedade(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPropriedade5() {
        int n = 153;
        boolean expResult = true;
        Propriedade153 instance = new Propriedade153();
        boolean result = instance.propriedade(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPropriedade6() {
        int n = 1001;
        boolean expResult = true;
        Propriedade153 instance = new Propriedade153();
        boolean result = instance.propriedade(n);
        assertEquals(expResult, result);
    }
}
