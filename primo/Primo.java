package primo;
import java.util.Scanner;
/**
 *
 * @author Hyago Vieira de Souza 
 */
public class Primo {

    public static void main(String[] args) {
        int n = confereValores("Entre com o número:");
        
        if (primo(n)) {
            System.out.println("Verdadeiro para " + n + ".");
        } else {
            System.out.println("Falso para " + n + ".");
        }
    }
    
     public static int confereValores(String frase) {
        System.out.println(frase);
        Scanner ler = new Scanner(System.in);
        int resultado = ler.nextInt();
        if (resultado <= 1) {
            System.out.println("Digite um valor que seja maior que 1.");
            return confereValores(frase);
        } else {
        return resultado;
        }
    }
     
    public static boolean primo(int n) {
        int i = 2;
        int j = 0;
        while (i <= (n - 1)) {
            if (n % i == 0) {
                j++;
            }
            i++;
        }
        return j == 0;
    }
    
}
