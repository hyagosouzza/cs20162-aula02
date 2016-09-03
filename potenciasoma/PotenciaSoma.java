package potenciasoma;
import java.util.Scanner;

/**
 *
 * @author Hyago Vieira de Souza
 */
public class PotenciaSoma {

    public static void main(String[] args) {
        int x = confereValores("Entre com o primeiro número:");
        int y = confereValores("Entre com o segundo número:");
        
        System.out.println(potenciaSoma(x, y));
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
