package propriedade153;
import java.util.Scanner;
/**
 *
 * @author Hyago Vieira de Souza
 */
public class Propriedade153 {

    public static void main(String[] args) {
        int n = confereValores("Entre com o número:");
        
        if (propriedade(n)) {
            System.out.println("Verdadeiro para " + n + ".");
        } else {
            System.out.println("Falso para " + n + ".");
        }
        
    }
    
    public static int confereValores(String frase) {
        System.out.println(frase);
        Scanner ler = new Scanner(System.in);
        int resultado = ler.nextInt();
        if (resultado < 0 || resultado > 9999) {
            System.out.println("Digite um valor que seja maior ou igual a 0 e"
                    + " menor ou igual a 9999.");
            return confereValores(frase);
        } else {
        return resultado;
        }
    }
    
    public static boolean propriedade(int n) {
        int i = n / 100;
        int j = (n - (100 * i)) / 10;
        int k = n % 10;
        return ((Math.pow(i,3)) + (Math.pow(j,3)) + (Math.pow(k,3))) == n;
    }
    
}
