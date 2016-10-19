/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.hyagosouzza.cs20162aula02.exercicios;

/**
 * Classe para utilizar o método primo.
 * @version 1.0
 */
public class Primo {
     
     /**
     * Metodo para verificar se o número é primo.
     * @param n final int
     * @return boolean - j
     */
    public final boolean primo(final int n) {
        int i = 2;
        int j = 0;
        if (n == 1) {
            return false;
        } else {
            while (i <= (n - 1)) {
                if (n % i == 0) {
                    j++;
                }
                i++;
            }
        }
        return j == 0;
    }
}
