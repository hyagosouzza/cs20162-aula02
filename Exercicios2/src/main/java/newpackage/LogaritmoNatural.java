package newpackage;
import java.util.Scanner;
/**
 * @author Hyago Vieira de Souza
 * @version 1.0
 * @since Relase 01 da aplicação
 */
public class LogaritmoNatural {
    
    /**Metodo para retornar o fatorial de n.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param n int
     * @return float - f - fatorial
     */ 
    public static float fatorial(float n) {
        float i = 2;
        float f = 1;
        while(i <= n) {
            f = f * i;
            i = i + 1;
        }
        return f;
    }
    
    /**Metodo para retornar o resultado de "n" elevado a "m".
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param n int
     * @param m int
     * @return float - resultado
     */ 
    public static float potencia(float n, float m) {
        int contador = 0;
        float resultado = 1;
        while (contador < m) {
            resultado *= n; 
            contador++;
        }
        return resultado;
    }
    
    /**Metodo para retornar o resultado do logaritmo natural.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param a int
     * @param b int
     * @return float - e - resultado
     */ 
    public static float logNat(float a, float b) {
        int i = 2;
        float e = a + 1;
        float f;
        float p;
        while(i <= b) {
            p = potencia(a, b);
            f = fatorial(i);
            e = e + p / f;
            i = i + 1;
        }
        return e;
    }
    
    
    /**Metodo para ler valor(es) e retornar o logaritmo natural.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param args String
     */
    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com o número:");
        float a = ler.nextFloat();
        while(a < 1) {
            System.out.println("Digite um número maior que 0.");
            a = ler.nextFloat();
        }
        System.out.println("Entre com outro número:");
        float b = ler.nextFloat();
        while(b < 2) {
            System.out.println("Digite um número maior que 1.");
            b = ler.nextFloat();
        }
        System.out.println("O logaritmo natural é: " + logNat(a, b) + ".");
        
    }
}
