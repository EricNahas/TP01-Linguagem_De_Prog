/**
 *
 * @author Eric Nahas, Armando Souza
 */
import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int diametro;
        double area;
        
        System.out.println("Digite o diâmetro do círculo: ");
        diametro = teclado.nextInt();
        
        area = Math.PI * (diametro/2) * (diametro/2);
        System.out.println("A área é: " + area);

    }
    
}
