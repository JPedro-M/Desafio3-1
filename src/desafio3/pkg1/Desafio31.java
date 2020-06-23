package desafio3.pkg1;
import java.util.Scanner;
/**
 *
 * @author troll
 */
public class Desafio31 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x;
        
        System.out.println("Qual o valor de x?");
        x = ler.nextInt();
        
        if (x%2 == 0) {
            System.out.println("O valor é par");
        }else{
            System.out.println("O valor é impar");
        }
    }
}
