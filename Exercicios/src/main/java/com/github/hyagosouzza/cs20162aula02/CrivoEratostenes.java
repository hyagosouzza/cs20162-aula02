/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.hyagosouzza.cs20162aula02;
import java.util.Scanner;

/**Classe para usar o Crivo de Eratostenes.
 * @author Hyago Vieira de Souza
 * @version 1.0
 */
public class CrivoEratostenes {

    /**Metodo para ler valor(es) e verificar os números primos até um certo 
     * valor limite.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param args String
     */
    public static void main(String[] args) {
        int i, j, raiz;
        int vetor[] = new int[1000000];
        
        int n = confereValores("Digite o valor limite:");
        
        raiz = (int)Math.sqrt(n);
        
        for (i = 2; i <= n; i++) {
            vetor[i] = i;
        }
        
        for (i = 2; i <= raiz; i++) {
            if (vetor[i] == i) {
                System.out.println(i + " é primo!");
                for (j = i + i; j <= n; j+=i) {
                    vetor[j] = 0;
                }
            }
        }
    }
    
    /**Metodo para conferir se o valor de entrada dado pelo usuário é aceito.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param frase String - frase lida pelo usuário
     * @return int - resultado
     */
    public static int confereValores(String frase) {
        System.out.println(frase);
        Scanner ler = new Scanner(System.in);
        int resultado = ler.nextInt();
        if (resultado < 2 ) {
            System.out.println("Digite um valor que seja maior que 1.");
            return confereValores(frase);
        } else {
        return resultado;
        }
    }
}