package crivoeratostenes;
import java.util.Scanner;
/**
 *
 * @author Hyago Vieira de Souza
 */
public class CrivoEratostenes {

    public static void main(String[] args) {
        int i, j, raiz;
        int vetor[] = new int[1000000];
        
        int n = confereValores("Digite o valor limite:");
        
        raiz = (int)Math.sqrt(n);
        
        for (i = 2; i <= n; i++) {
            vetor[i] = i;
        }
        
        for (i = 2; i <= raiz; i++) {
            if (vetor[i] == i) {
                System.out.println(i + " é primo!");
                for (j = i + i; j <= n; j+=i) {
                    vetor[j] = 0; // removendo da lista
                }
            }
        }
    }
    
    public static int confereValores(String frase) {
        System.out.println(frase);
        Scanner ler = new Scanner(System.in);
        int resultado = ler.nextInt();
        if (resultado < 2 ) {
            System.out.println("Digite um valor que seja maior que 1.");
            return confereValores(frase);
        } else {
        return resultado;
        }
    }
}
