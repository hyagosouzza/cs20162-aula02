package newpackage;
import java.util.Scanner;
/**
 * @author Hyago Vieira de Souza
 * @version 1.0
 * @since Relase 01 da aplicação
 */
public class SomatorioElementar {
    
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
    
    /**Metodo para retornar a somatória envolvendo números naturais.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param n int
     * @return double - s - soma
     */ 
    public static double somaNaturais(int n) {
        float i = 1;
        double s = 0;
        float d;
        while(i <= n) {
            d = 1 + i * i;
            s = s + 1/d;
            i = i + i;
        }
        return s;
    }
    
    /**Metodo para ler valor(es) e verificar o somatório elementar.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param args String
     */
    public static void main (String [] args) {
        int n = confereValores("Entre com o número:");
        System.out.println("O somatório é: " + somaNaturais(n) + ".");
        
    }
}
