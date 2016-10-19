/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.hyagosouzza.cs20162aula02.exercicios;

/**
 * Classe para utilizar o método produtoIntSomando.
 * @version 1.0
 */
public class ProdutoIntSoma {

    /**
     * Metodo para buscar o resultado de "x" elevado a "y" (somando).
     * @param a final int
     * @param b final int
     * @return int - s - resultado do produto somando
     */
    public final int produtoIntSomando(final int a, final int b) {
        int totalParcelas = a;
        int parcela = b;

        if (b < a) {
            totalParcelas = b;
            parcela = a;
        }
        int i = 1;
        int s = 0;
        while (i <= totalParcelas) {
            s = s + parcela;
            i = i + 1;
        }
        return s;
    }
}
