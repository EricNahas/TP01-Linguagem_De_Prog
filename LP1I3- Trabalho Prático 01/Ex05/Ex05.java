/**
 *
 * @author Eric Nahas, Armando Souza
 */
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int diametro;
        double volume;
        
        System.out.println("Digite o diâmetro da esfera: ");
        diametro = teclado.nextInt();
        
        volume = 4/3 * Math.PI * (diametro/2);
        System.out.println("O volume é: " + volume);

    }
    
}
