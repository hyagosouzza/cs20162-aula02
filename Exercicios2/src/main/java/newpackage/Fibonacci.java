package newpackage;
import java.util.Scanner;
/**
 * @author Hyago Vieira de Souza
 * @version 1.0
 * @since Relase 01 da aplicação
 */
public class Fibonacci {
    
    /**Metodo para obtenção do n-ésimo número de Fibonacci.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param n int
     * @return int - c
     */ 
    public static int fibo(int n) {
        int a = 0;
        int c = 1;
        if (n == 0 || n == 1) {
            return n;
        } else {
            int i = 2;
            while(i <= n) {
                int t = c;
                c = c + a;
                a = t;
                i = i + 1;
            }
            return c;
        }        
    }
    
    /**Metodo para ler valor(es) e retornar a raiz quadrada.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param args String
     */
    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com o número:");
        int a = ler.nextInt();
        while(a < 0) {
            System.out.println("Digite um número maior/igual a 0.");
            a = ler.nextInt();
        }
        
        System.out.println("O " + a + "º número de Fibonacci é " + fibo(a));
    }
}
