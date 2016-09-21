package newpackage;
import java.util.Scanner;
/**
 * @author Hyago Vieira de Souza
 * @version 1.0
 * @since Relase 01 da aplicação
 */
public class RaizQuad {
    
    /**Metodo para retornar a raiz quadrada.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param n int
     * @param i int
     * @return double - r
     */ 
    public static double raizQuadrada(int n, int i) {
        double r = 1;
        while(0 <= i) {
            r = (r + n / r) / 2;
            i = i - 1;
        }
        return r;
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
        System.out.println("Entre com o valor de i. Quanto" +
                "maior o valor de i maior é a aproximação da raiz desejada.:");
        int b = ler.nextInt();
        System.out.println("A raiz quadrada do número é " + raizQuadrada(a, b));
    }    
}
