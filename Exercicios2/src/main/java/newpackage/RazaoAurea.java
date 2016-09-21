package newpackage;
import java.util.Scanner;
/**
 * @author Hyago Vieira de Souza
 * @version 1.0
 * @since Relase 01 da aplicação
 */
public class RazaoAurea {
    
    /**Metodo para retornar a razão áurea.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param x int
     * @param y int
     * @param z int
     * @return double - c/a
     */
    public static double razaoAurea(int x, int y, int z) {
        int c = y;
        int a = x;
        int i = 1;
        while(i <= z) {
            int t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }
        return (double)c / a;
    }
    
    /**Metodo para ler valor(es) e retornar a razão áurea.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param args String
     */
    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com o número:");
        int x = ler.nextInt();
        while(x < 0) {
            System.out.println("Digite um número maior ou igual a 0.");
            x = ler.nextInt();
        }
        System.out.println("Entre com um número menor do que o primeiro:");
        int y = ler.nextInt();
        while(x >= y) {
            System.out.println("Digite um número menor do que o primeiro.");
            y = ler.nextInt();
        }
        System.out.println("Entre com um número maior do que 0:");
        int z = ler.nextInt();
        while(z <= 0) {
            System.out.println("Digite um número maior que 0.");
            z = ler.nextInt();
        }
        System.out.println("A razão Áurea é: " + razaoAurea(x, y, z) 
                + ".");
        
    }
    
}
