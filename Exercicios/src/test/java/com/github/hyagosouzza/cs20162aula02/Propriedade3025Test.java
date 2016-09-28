package com.github.hyagosouzza.cs20162aula02;

import com.github.hyagosouzza.cs20162aula02.Propriedade3025;
import org.junit.Test;
import static org.junit.Assert.*;

public class Propriedade3025Test {

    @Test
    public void testPropriedade() {
        int n = 2;
        boolean expResult = false;
        boolean result = Propriedade3025.propriedade(n);
        assertEquals(expResult, result);

    }

    @Test
    public void testPropriedade2() {
        int n = 0;
        boolean expResult = true;
        boolean result = Propriedade3025.propriedade(n);
        assertEquals(expResult, result);

    }

    @Test
    public void testPropriedade3() {
        int n = 1;
        boolean expResult = true;
        boolean result = Propriedade3025.propriedade(n);
        assertEquals(expResult, result);

    }

    @Test
    public void testPropriedade4() {
        int n = 3025;
        boolean expResult = true;
        boolean result = Propriedade3025.propriedade(n);
        assertEquals(expResult, result);

    }

    @Test
    public void testPropriedade5() {
        int n = 10;
        boolean expResult = false;
        boolean result = Propriedade3025.propriedade(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPropriedade6() {
        int n = 25;
        boolean expResult = false;
        boolean result = Propriedade3025.propriedade(n);
        assertEquals(expResult, result);

    }
    
}
