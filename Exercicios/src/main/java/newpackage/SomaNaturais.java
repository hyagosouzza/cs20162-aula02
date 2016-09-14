package newpackage;
import java.util.Scanner;
/**
 * @author Hyago Vieira de Souza
 * @version 1.0
 * @since Relase 01 da aplicação
 */
public class SomaNaturais {
    
    /**Metodo somar os "n" primeiros números naturais.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param n int
     * @return int - s - soma dos naturais 
     */
    public static int soma(int n) {
        int s = 1, i = 2;
        while(n >= i) {
            s += i;
            i += 1;            
        }
        return s;
    }

    /**Metodo para ler valor(es) e mostrar a soma dos "n" primeiros números
     * naturais.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param args String
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número:");
        int número = ler.nextInt();
        
        System.out.println("A soma dos " + número + " primeiros naturais é: "
                + soma(número));
    }
}