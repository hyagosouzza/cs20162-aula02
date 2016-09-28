package com.github.hyagosouzza.cs20162aula02;

import com.github.hyagosouzza.cs20162aula02.MaiorDivisorComum;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaiorDivisorComumTest {

    @Test
    public void testMaiorDivisorComum() {
        int a = 1;
        int b = 1;
        int expResult = 1;
        int result = MaiorDivisorComum.maiorDivisorComum(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMaiorDivisorComum2() {
        int a = 2;
        int b = 2;
        int expResult = 2;
        int result = MaiorDivisorComum.maiorDivisorComum(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMaiorDivisorComum3() {
        int a = 0;
        int b = 4;
        int expResult = 4;
        int result = MaiorDivisorComum.maiorDivisorComum(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMaiorDivisorComum4() {
        int a = 7;
        int b = 0;
        int expResult = 7;
        int result = MaiorDivisorComum.maiorDivisorComum(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMaiorDivisorComum5() {
        int a = 10;
        int b = 5;
        int expResult = 5;
        int result = MaiorDivisorComum.maiorDivisorComum(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMaiorDivisorComum6() {
        int a = 16;
        int b = 12;
        int expResult = 4;
        int result = MaiorDivisorComum.maiorDivisorComum(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMaiorDivisorComum7() {
        int a = 27;
        int b = 25;
        int expResult = 1;
        int result = MaiorDivisorComum.maiorDivisorComum(a, b);
        assertEquals(expResult, result);
    }
    
}
