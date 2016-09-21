package newpackage;
import java.util.Scanner;
/**
 * @author Hyago Vieira de Souza
 * @version 1.0
 * @since Relase 01 da aplicação
 */
public class QuadradoPerfeito {
    
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
     
    /**Metodo para retornar se o número é um quadrado perfeito.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param n int
     * @return boolean - true
     */
     public static boolean quadPer(int n) {
         int i = 1;
         int q = 1;
         while(q < n) {
             i = i + 2;
             q = q + i;
         }
         return q == n;
     }
     
    /**Metodo para ler valor(es) e retornar se o número é um quadrado perfeito.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param args String
     */
    public static void main (String [] args) {
        int n = confereValores("Entre com o número:");
        if(quadPer(n)) {
            System.out.println(n + " é um quadrado perfeito.");
        }else {
            System.out.println(n + " não é um quadrado perfeito.");
        } 
    }
}
