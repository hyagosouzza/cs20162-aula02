/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.hyagosouzza.cs20162aula02.exercicios;

/**
 * Classe para utilizar o método potenciaSoma.
 * @version 1.0
 */
public class PotenciaSoma
{
    /**
     * Metodo para buscar o resultado de "x" elevado a "y" (somando).
     * @param x final int
     * @param y final int
     * @return int - potencia - resultado da potenciação
     */
    public final int potenciaSoma(final int x, final int y) {
        int potencia = 1;
        int i = 1;
        while (i <= y) {
            potencia = potencia * x;
            i = i + 1;
        }
        return potencia;
    }
}
