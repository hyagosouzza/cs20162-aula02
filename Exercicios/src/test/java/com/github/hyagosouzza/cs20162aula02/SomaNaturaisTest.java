package com.github.hyagosouzza.cs20162aula02;

import com.github.hyagosouzza.cs20162aula02.SomaNaturais;
import org.junit.Test;
import static org.junit.Assert.*;

public class SomaNaturaisTest {

    @Test
    public void testSoma() {
        int n = 1;
        int expResult = 1;
        int result = SomaNaturais.soma(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testSoma2() {
        int n = 2;
        int expResult = 3;
        int result = SomaNaturais.soma(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testSoma3() {
        int n = 3;
        int expResult = 6;
        int result = SomaNaturais.soma(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testSoma4() {
        int n = 4;
        int expResult = 10;
        int result = SomaNaturais.soma(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testSoma5() {
        int n = 5;
        int expResult = 15;
        int result = SomaNaturais.soma(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testSoma6() {
        int n = 6;
        int expResult = 21;
        int result = SomaNaturais.soma(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testSoma7() {
        int n = 7;
        int expResult = 28;
        int result = SomaNaturais.soma(n);
        assertEquals(expResult, result);
    }
    
}
