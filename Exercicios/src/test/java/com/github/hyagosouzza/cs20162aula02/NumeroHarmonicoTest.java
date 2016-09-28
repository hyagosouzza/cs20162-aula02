package com.github.hyagosouzza.cs20162aula02;

import com.github.hyagosouzza.cs20162aula02.NumeroHarmonico;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumeroHarmonicoTest {

    @Test
    public void testNumHarmonico() {
        int n = 1;
        float expResult = 1.0F;
        float result = NumeroHarmonico.numHarmonico(n);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testNumHarmonico2() {
        int n = 2;
        float expResult = 1.5F;
        float result = NumeroHarmonico.numHarmonico(n);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testNumHarmonico3() {
        int n = 3;
        float expResult = 1.8333334F;
        float result = NumeroHarmonico.numHarmonico(n);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testNumHarmonico4() {
        int n = 5;
        float expResult = 2.2833335F;
        float result = NumeroHarmonico.numHarmonico(n);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testNumHarmonico5() {
        int n = 7;
        float expResult = 2.5928574F;
        float result = NumeroHarmonico.numHarmonico(n);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testNumHarmonico6() {
        int n = 10;
        float expResult = 2.9289684F;
        float result = NumeroHarmonico.numHarmonico(n);
        assertEquals(expResult, result, 0.0);
    }
    
}
