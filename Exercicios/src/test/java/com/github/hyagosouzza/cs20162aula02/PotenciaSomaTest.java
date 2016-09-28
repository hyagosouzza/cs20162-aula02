package com.github.hyagosouzza.cs20162aula02;

import com.github.hyagosouzza.cs20162aula02.PotenciaSoma;
import org.junit.Test;
import static org.junit.Assert.*;

public class PotenciaSomaTest {

    @Test
    public void testPotenciaSoma() {
        int x = 0;
        int y = 1;
        int expResult = 0;
        int result = PotenciaSoma.potenciaSoma(x, y);
        assertEquals(expResult, result);
    }

    @Test
    public void testPotenciaSoma2() {
        int x = 1;
        int y = 0;
        int expResult = 1;
        int result = PotenciaSoma.potenciaSoma(x, y);
        assertEquals(expResult, result);
    }

    @Test
    public void testPotenciaSoma3() {
        int x = 5;
        int y = 1;
        int expResult = 5;
        int result = PotenciaSoma.potenciaSoma(x, y);
        assertEquals(expResult, result);
    }

    @Test
    public void testPotenciaSoma4() {
        int x = 7;
        int y = 0;
        int expResult = 1;
        int result = PotenciaSoma.potenciaSoma(x, y);
        assertEquals(expResult, result);
    }

    @Test
    public void testPotenciaSoma5() {
        int x = 10;
        int y = 2;
        int expResult = 100;
        int result = PotenciaSoma.potenciaSoma(x, y);
        assertEquals(expResult, result);
    }

    @Test
    public void testPotenciaSoma6() {
        int x = 3;
        int y = 3;
        int expResult = 27;
        int result = PotenciaSoma.potenciaSoma(x, y);
        assertEquals(expResult, result);
    }

    @Test
    public void testPotenciaSoma7() {
        int x = 5;
        int y = 3;
        int expResult = 125;
        int result = PotenciaSoma.potenciaSoma(x, y);
        assertEquals(expResult, result);
    }
    
}
