/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package somadosnaturais;
import java.util.Scanner;

/**
 *
 * @author Hyago Vieira de Souza
 */
public class SomaDosNaturais {
    
    public static int soma(int n) {
        int s = 1, i = 2;
        while(n >= i) {
            s += i;
            i += 1;            
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número:");
        int número = ler.nextInt();
        
        System.out.println("A soma dos " + número + " primeiros naturais é: "
                + soma(número));
    }
}
