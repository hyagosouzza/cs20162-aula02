package com.github.hyagosouzza.cs20162aula02.exercicios;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
public class CrivoEratostenesTest {
    @Test
    public void testCrivoEratostenes() {
        int VALOR_LIMITE = 4;
        CrivoEratostenes instance = new CrivoEratostenes();
        List<Integer> lista = new ArrayList();
        lista.add(2);
        List expResult = lista;
        List result = instance.crivoEratostenes(VALOR_LIMITE);
        assertEquals(expResult, result);
    }
    @Test
    public void testCrivoEratostenes2() {
        int VALOR_LIMITE = 9;
        CrivoEratostenes instance = new CrivoEratostenes();
        List<Integer> lista = new ArrayList();
        lista.add(2);
        lista.add(3);
        List expResult = lista;
        List result = instance.crivoEratostenes(VALOR_LIMITE);
        assertEquals(expResult, result);
    }
    @Test
    public void testCrivoEratostenes3() {
        int VALOR_LIMITE = 16;
        CrivoEratostenes instance = new CrivoEratostenes();
        List<Integer> lista = new ArrayList();
        lista.add(2);
        lista.add(3);
        List expResult = lista;
        List result = instance.crivoEratostenes(VALOR_LIMITE);
        assertEquals(expResult, result);
    }
    @Test
    public void testCrivoEratostenes4() {
        int VALOR_LIMITE = 25;
        CrivoEratostenes instance = new CrivoEratostenes();
        List<Integer> lista = new ArrayList();
        lista.add(2);
        lista.add(3);
        lista.add(5);
        List expResult = lista;
        List result = instance.crivoEratostenes(VALOR_LIMITE);
        assertEquals(expResult, result);
    }
    @Test
    public void testCrivoEratostenes5() {
        int VALOR_LIMITE = 60;
        CrivoEratostenes instance = new CrivoEratostenes();
        List<Integer> lista = new ArrayList();
        lista.add(2);
        lista.add(3);
        lista.add(5);
        lista.add(7);
        List expResult = lista;
        List result = instance.crivoEratostenes(VALOR_LIMITE);
        assertEquals(expResult, result);
    }
    @Test
    public void testCrivoEratostenes6() {
        int VALOR_LIMITE = 0;
        CrivoEratostenes instance = new CrivoEratostenes();
        List<Integer> lista = new ArrayList();
        List expResult = lista;
        List result = instance.crivoEratostenes(VALOR_LIMITE);
        assertEquals(expResult, result);
    }
    @Test
    public void testCrivoEratostenes7() {
        int VALOR_LIMITE = 1;
        CrivoEratostenes instance = new CrivoEratostenes();
        List<Integer> lista = new ArrayList();
        List expResult = lista;
        List result = instance.crivoEratostenes(VALOR_LIMITE);
        assertEquals(expResult, result);
    }
    @Test
    public void testCrivoEratostenes8() {
        int VALOR_LIMITE = 2;
        CrivoEratostenes instance = new CrivoEratostenes();
        List<Integer> lista = new ArrayList();
        List expResult = lista;
        List result = instance.crivoEratostenes(VALOR_LIMITE);
        assertEquals(expResult, result);
    }
}
