/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.hyagosouzza.cs20162aula02.exercicios;

/**
 * Classe para utilizar o método soma.
 * @version 1.0
 */
public class SomaNaturais {

    /**
     * Metodo somar os "n" primeiros números naturais.
     * @param n final int
     * @return int - s - soma dos naturais
     */
    public final int soma(final int n) {
        int s = 1, i = 2;
        while (n >= i) {
            s = s + i;
            i = i + 1;
        }
        return s;
    }
}
