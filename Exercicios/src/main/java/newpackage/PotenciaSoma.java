package newpackage;
import java.util.Scanner;
/**
 * @author Hyago Vieira de Souza
 * @version 1.0
 * @since Relase 01 da aplicação
 */
public class PotenciaSoma {

    /**Metodo para ler valor(es) e verificar o resultado da potenciação
     * de "a" elevado a "b".
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param args String
     */
    public static void main(String[] args) {
        int x = confereValores("Entre com o primeiro número:");
        int y = confereValores("Entre com o segundo número:");
        
        System.out.println(potenciaSoma(x, y));
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
        if (resultado < 0) {
            System.out.println("Digite um valor que seja maior ou igual a 0.");
            return confereValores(frase);
        } else {
        return resultado;
        }
    }
    
    /**Metodo para buscar o resultado de "x" elevado a "y" (somando)
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param x int
     * @param y int
     * @return int - potencia - resultado da potenciação
     */
    public static int potenciaSoma(int x, int y) {
        int potencia = 1;
        int i = 1;
        while (i <= y) {
            potencia = potencia * x;
            i = i + 1;
        }
        return potencia;
    }
}
