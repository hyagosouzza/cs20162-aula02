/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.hyagosouzza.cs20162aula02.exercicios;

/**
 * Classe para utilizar o método a propriedade3025.
 * @version 1.0
 */
public class Propriedade3025
{
    /**
     * Metodo para verificar se o número recebido tem a "propriedade 3025".
     * @param n final int
     * @return boolean
     */
    public final boolean propriedade(final int n) {
        final int cem = 100;
        final int dois = 2;
        int i = n / cem;
        int j = n % cem;
        return (Math.pow((i + j), dois)) == n;
    }
}
