import java.util.Scanner;

/**
 *
 * @author Eric Nahas, Armando Righi
 */
public class Ex03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int diagonal;
        int area;
        
        System.out.println("Digite a diagonal do quadrado: ");
        diagonal = teclado.nextInt();
        
        area = (diagonal * diagonal)/2;
        System.out.println("A área é: " + area);
    }
    
}
