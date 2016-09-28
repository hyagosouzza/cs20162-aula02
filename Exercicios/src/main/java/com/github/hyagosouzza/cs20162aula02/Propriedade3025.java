/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */


package com.github.hyagosouzza.cs20162aula02;
import java.util.Scanner;

/**Classe para dizer se certo número tem a propriedade3025.
 * @author Hyago Vieira de Souza
 * @version 1.0
 */
public class Propriedade3025 {

    /**Metodo para ler valor(es) e verificar se o número possui a
     * "propriedade 3025".
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param args String
     */
    public static void main(String[] args) {
        int n = confereValores("Entre com o número:");
        
        if (propriedade(n)) {
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
        if (resultado < 0 || resultado > 9999) {
            System.out.println("Digite um valor que seja maior ou igual a 0 e"
                    + " menor ou igual a 9999.");
            return confereValores(frase);
        } else {
        return resultado;
        }
    }
    
    /**Metodo para verificar se o número recebido tem a "propriedade 3025"
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param n int
     * @return boolean
     */
    public static boolean propriedade(int n) {
        int i = n / 100;
        int j = n % 100;
        return (Math.pow((i + j),2)) == n;
    }
}