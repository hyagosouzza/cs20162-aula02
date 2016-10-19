/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.hyagosouzza.cs20162aula02.exercicios;

import java.util.ArrayList;

import java.util.List;

/**
 * Classe para utilizar o método crivoEratostenes.
 * @version 1.0
 */
public class CrivoEratostenes {
    
    /**
     * Metodo para achar os números primos até um certo valor limite.
     * @param valorLimite final int
     * @return List
     */
    public final List crivoEratostenes(final int valorLimite) {
        final int tamanho = 1000000;
        int cont1, cont2, raiz;
        int[]vetor = new int[tamanho];
        List<Integer> listaPrimos = new ArrayList();
        raiz = (int) Math.sqrt(valorLimite);
        for (cont1 = 2; cont1 <= valorLimite; cont1++) {
            vetor[cont1] = cont1;
        }
        for (cont1 = 2; cont1 <= raiz; cont1++) {
            if (vetor[cont1] == cont1) {
                listaPrimos.add(cont1);
                for (cont2 = cont1 + cont1; cont2 <= valorLimite;
                        cont2 = cont2 + cont1) {
                    vetor[cont2] = 0;
                }
            }
        }
        return listaPrimos;
    }
}
