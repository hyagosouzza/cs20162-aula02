package newpackage;
import java.util.Scanner;
/**
 * @author Hyago Vieira de Souza
 * @version 1.0
 * @since Relase 01 da aplicação
 */
public class ValorPi {
    
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
    
    /**Metodo para retornar o valor de PI.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param n int
     * @return double - p - PI
     */ 
    public static double acharPi(int n) {
        float i = 1;
        float s = -1;
        float d = -1;
        double p = 0;
        while(i <= n) {
            d = d + 2;
            s = -1 * s;
            p = p + 4 * s / d;
            i = i + 1;
        }
        return p;
    }
     
    /**Metodo para ler valor(es) e calcular o valor de PI.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param args String
     */
    public static void main (String [] args) {
        int n = confereValores("Entre com o número:");
        System.out.println("O PI é: " + acharPi(n) + ".");
        
    }
}
