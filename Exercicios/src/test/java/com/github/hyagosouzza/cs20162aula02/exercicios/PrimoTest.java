package com.github.hyagosouzza.cs20162aula02.exercicios;
import org.junit.Test;
import static org.junit.Assert.*;
public class PrimoTest {
    @Test
    public void testPrimo() {
        int n = 1;
        boolean expResult = false;
        Primo instance = new Primo();
        boolean result = instance.primo(n);
        assertEquals(expResult, result);
    }
    @Test
    public void testPrimo2() {
        int n = 11;
        boolean expResult = true;
        Primo instance = new Primo();
        boolean result = instance.primo(n);
        assertEquals(expResult, result);
    }
    @Test
    public void testPrimo3() {
        int n = 15;
        boolean expResult = false;
        Primo instance = new Primo();
        boolean result = instance.primo(n);
        assertEquals(expResult, result);
    }
    @Test
    public void testPrimo4() {
        int n = 9;
        boolean expResult = false;
        Primo instance = new Primo();
        boolean result = instance.primo(n);
        assertEquals(expResult, result);
    }
    @Test
    public void testPrimo5() {
        int n = 5;
        boolean expResult = true;
        Primo instance = new Primo();
        boolean result = instance.primo(n);
        assertEquals(expResult, result);
    }
    @Test
    public void testPrimo6() {
        int n = 10;
        boolean expResult = false;
        Primo instance = new Primo();
        boolean result = instance.primo(n);
        assertEquals(expResult, result);
    }
    @Test
    public void testPrimo7() {
        int n = 3;
        boolean expResult = true;
        Primo instance = new Primo();
        boolean result = instance.primo(n);
        assertEquals(expResult, result);
    }
    @Test
    public void testPrimo8() {
        int n = 2;
        boolean expResult = true;
        Primo instance = new Primo();
        boolean result = instance.primo(n);
        assertEquals(expResult, result);
    } 
}
