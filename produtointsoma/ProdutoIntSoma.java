package produtointsoma;

import java.util.Scanner;

/**
 *
 * @author Hyago Vieira de Souza
 */
public class ProdutoIntSoma {
    
    public static void main(String[] args) {
        
        int a = confereValores("Entre com o primeiro número:");
        int b = confereValores("Entre com o segundo número:");
        
        System.out.println(produtoIntSomando(a, b));
    }
    
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
