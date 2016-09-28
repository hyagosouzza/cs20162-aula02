/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.hyagosouzza.cs20162aula02;
import java.util.Scanner;

/**Classe para dizer se o número é primo.
 * @author Hyago Vieira de Souza
 * @version 1.0
 */
public class Primo {

    /**Metodo para ler valor(es) e verificar se o número é primo.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param args String
     */
    public static void main(String[] args) {
        int n = confereValores("Entre com o número:");
        
        if (primo(n)) {
            System.out.println("Verdadeiro para " + n + ".");
        } else {
            System.out.println("Falso para " + n + ".");
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
        if (resultado <= 1) {
            System.out.println("Digite um valor que seja maior que 1.");
            return confereValores(frase);
        } else {
        return resultado;
        }
    }
    
     /**Metodo para verificar se o número é primo
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param n int
     * @return boolean - j
     */
    public static boolean primo(int n) {
        int i = 2;
        int j = 0;
        if(n == 1){
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
