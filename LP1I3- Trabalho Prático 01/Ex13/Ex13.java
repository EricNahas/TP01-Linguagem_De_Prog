/**
 *
 * @author Eric Nahas, Armando Souza
 */
import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int v0;
        int a;
        int t;
        double vf;
        
        System.out.println("Digite a velocidade inicial: ");
        v0 = teclado.nextInt();
        
        System.out.println("Digite a aceleração: ");
        a = teclado.nextInt();
        
        System.out.println("Digite o tempo de viagem: ");
        t = teclado.nextInt();
        
        vf = ((v0 + (a*t))* 3.6);
        
        System.out.println("A Velocidade final é: " + vf);      
    }
    
}