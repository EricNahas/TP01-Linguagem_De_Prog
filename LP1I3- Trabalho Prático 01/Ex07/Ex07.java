/**
 *
 * @author Eric Nahas, Armando Souza
 */
import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1;
        int n2;
        double media;
        
        System.out.println("Digite o primeiro número: ");
        n1 = teclado.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = teclado.nextInt();
     
       media = Math.sqrt(n1 * n2);
       
       System.out.println("A média geométrica é: " + media);

    }
    
}