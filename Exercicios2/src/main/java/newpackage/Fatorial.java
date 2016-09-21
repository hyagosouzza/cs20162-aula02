package newpackage;
import java.util.Scanner;
/**
 * @author Hyago Vieira de Souza
 * @version 1.0
 * @since Relase 01 da aplicação
 */
public class Fatorial {
    
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
        if (resultado < 1) {
            System.out.println("Digite um valor que seja maior que 0.");
            return confereValores(frase);
        } else {
        return resultado;
        }
    }
     
    /**Metodo para retornar o fatorial de n.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param n int
     * @return int - f - fatorial
     */ 
    public static int fatorial(int n) {
        int i = 2;
        int f = 1;
        while(i <= n) {
            f = f * i;
            i = i + 1;
        }
        return f;
    }
    
    /**Metodo para ler valor(es) e retornar o fatorial.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param args String
     */
    public static void main (String [] args) {
        int n = confereValores("Entre com o número:");
        System.out.println("O fatorial de " + n + " é: " + fatorial(n) + ".");
        
    }
}
