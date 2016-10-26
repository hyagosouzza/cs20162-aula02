/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.hyagosouzza.cs20162aula02.exercicios;

/**
 * Classe para utilizar a propriedade153.
 * @version 1.0
 */
public class Propriedade153 {

    /**
     * Metodo para verificar se o número recebido tem a "propriedade 153".
     * @param n final int
     * @return boolean
     */
    public final boolean propriedade(final int n) {
        final int metadeDeSeis = 3;
        final int dobroDeCinco = 10;
        final int dobroDeCinquenta = 100;
        int i = n / dobroDeCinquenta;
        int j = (n - (dobroDeCinquenta * i)) / dobroDeCinco;
        int k = n % dobroDeCinco;
        return ((Math.pow(i, metadeDeSeis)) + (Math.pow(j, metadeDeSeis))
                + (Math.pow(k, metadeDeSeis))) == n;
    }
}
