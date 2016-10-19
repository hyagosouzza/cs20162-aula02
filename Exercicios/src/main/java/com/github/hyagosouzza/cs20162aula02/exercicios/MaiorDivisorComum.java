/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.hyagosouzza.cs20162aula02.exercicios;

/**
 * Classe para utilizar o método maiorDivisorComum.
 * @version 1.0
 */
public class MaiorDivisorComum
{
    /**
     * Metodo para achar o maior divisor comum entre estes dois números.
     * @param a final int
     * @param b final int
     * @return int - a - maior divisor comum
     */
    public final int maiorDivisorComum(final int a, final int b) {
        int aa = a;
        int bb = b;
        while (bb != 0) {
            int m = aa % bb;
            aa = bb;
            bb = m;
        }
        return aa;
    }
}
