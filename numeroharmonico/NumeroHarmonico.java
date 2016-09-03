package numeroharmonico;
import java.util.Scanner;
/**
 *
 * @author Hyago Vieira de Souza
 */
public class NumeroHarmonico {

    public static void main(String[] args) {
        int n = confereValores("Entre com o número:");
        System.out.print("O " + n + "º número harmônico é: ");
        System.out.println(numHarmonico(n));
    }
    
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
