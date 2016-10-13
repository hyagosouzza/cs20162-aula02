/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.hyagosouzza.cs20162aula02.exercicios;
/**Classe para utilizar o método numHarmonico.
 * @author Hyago Vieira de Souza
 * @version 1.0
 */
public class NumeroHarmonico {
    /**Metodo para achar o valor do néssimo número harmônico.
     * @author Hyago Vieira de Souza
     * @since Release 01 da aplicação
     * @param n final int
     * @return float - s - valor do número harmônico em certa posição
     */
    public final float numHarmonico(final int n) {
        float i = 2;
        float s = 1;
        while (i <= n) {
            s = s + 1 / i;
            i = i + 1;
        }
        return s;
    }
}
