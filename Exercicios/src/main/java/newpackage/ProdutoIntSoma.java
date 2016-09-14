package newpackage;
import java.util.Scanner;
/**
 * @author Hyago Vieira de Souza
 * @version 1.0
 * @since Relase 01 da aplicação
 */
public class ProdutoIntSoma {
    
    /**Metodo para ler valor(es) e verificar o resultado da multiplicação
     * de "a" e "b".
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param args String
     */
    public static void main(String[] args) {
        
        int a = confereValores("Entre com o primeiro número:");
        int b = confereValores("Entre com o segundo número:");
        
        System.out.println(produtoIntSomando(a, b));
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
     * @param a int
     * @param b int
     * @return int - s - resultado do produto somando
     */
    public static int produtoIntSomando(int a, int b) {
        int totalParcelas = a;
        int parcela = b;

        if (b < a) {
            totalParcelas = b;
            parcela = a;
        }
        int i = 1;
        int s = 0;  
            
        while (i <= totalParcelas) {
            s = s + parcela;
            i = i + 1;
        }
        return s;
    }  
}