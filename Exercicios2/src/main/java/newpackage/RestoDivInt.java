package newpackage;
import java.util.Scanner;
/**
 * @author Hyago Vieira de Souza
 * @version 1.0
 * @since Relase 01 da aplicação
 */
public class RestoDivInt {
    
    /**Metodo para retornar o resto da divisão a/b.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param a int
     * @param b int
     * @return int - s
     */
    public static int mod(int a, int b) {
        int s = a;
        while(b <= s){
            s -= b;
        }
        return s;
    }
    
    /**Metodo para ler valor(es) e retornar o resta da divisão dos mesmos.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param args String
     */
    public static void main(String [] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com o número:");
        int a = ler.nextInt();
        while(a < 1) {
            System.out.println("Digite um número maior que 0.");
            a = ler.nextInt();
        }
        System.out.println("Entre com outro número:");
        int b = ler.nextInt();
        while(b <= 0) {
            System.out.println("Digite um número maior que 0.");
            b = ler.nextInt();
        }
        System.out.println("Resto: " + mod(a, b) + ".");
    }
}
