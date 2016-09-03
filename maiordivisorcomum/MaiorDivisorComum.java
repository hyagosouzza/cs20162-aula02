package maiordivisorcomum;
import java.util.Scanner;
/**
 *
 * @author Hyago Vieira de Souza
 */
public class MaiorDivisorComum {


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
    
    public static int maiorDivisorComum(int a, int b) {
        while (b != 0) {
            int m = a % b;
            a = b;
            b = m;
        }
        return a;
    }
    
}
