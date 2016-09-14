package newpackage;
import java.util.Scanner;
/**
 * @author Hyago Vieira de Souza
 * @version 1.0
 * @since Relase 01 da aplicação
 */
public class MaiorDivisorComum {

    /**Metodo para ler valor(es) e verificar o maior divisor comum entre 
     * dois números.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param args String
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número:");
        int a = ler.nextInt();
        System.out.println("Digite outro número menor ou igual ao primeiro:");
        int b = ler.nextInt();
        while (b > a) {
            System.out.println("Este número não é menor ou igual ao primeiro,"
                    + " tente novamente:");
            b = ler.nextInt();
        }
        System.out.println("O maior divisor comum entre " + a + " e " + b 
                + " é " + maiorDivisorComum(a, b) + ".");
                
    }
    
    /**Metodo para achar o maior divisor comum entre estes dois números
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param a int
     * @param b int
     * @return int - a - maior divisor comum
     */
    public static int maiorDivisorComum(int a, int b) {
        while (b != 0) {
            int m = a % b;
            a = b;
            b = m;
        }
        return a;
    }
    
}
