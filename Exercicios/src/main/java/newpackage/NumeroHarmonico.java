package newpackage;
import java.util.Scanner;
/**
 * @author Hyago Vieira de Souza
 * @version 1.0
 * @since Relase 01 da aplicação
 */
public class NumeroHarmonico {

    /**Metodo para ler valor(es) e verificar o néssimo número harmônico.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param args String
     */
    public static void main(String[] args) {
        int n = confereValores("Entre com o número:");
        System.out.print("O " + n + "º número harmônico é: ");
        System.out.println(numHarmonico(n));
    }
    
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
        if (resultado < 1 ) {
            System.out.println("Digite um valor que seja maior/igual a 1.");
            return confereValores(frase);
        } else {
        return resultado;
        }
    }
    
    /**Metodo para achar o valor do néssimo número harmônico
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param n int
     * @return float - s - valor do número harmônico em certa posição
     */
    public static float numHarmonico(int n) {
        float i = 2;
        float s = 1;
        while(i <= n) {
            s = s + 1 / i;
            i = i + 1;
        }
        return s;
    }
}