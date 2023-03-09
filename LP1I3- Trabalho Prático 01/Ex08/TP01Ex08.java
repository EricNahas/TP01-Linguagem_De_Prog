import java.util.Scanner;

/**
 *
 * @author Eric Nahas, Armando Righi
 */

public class TP01Ex08 {
    public static void main(String[] args){
        System.out.println("Digite um valor em milhas: ");
        Scanner input = new Scanner(System.in);
        double milhas = input.nextDouble();
	

        double conversao = milhas * 1.852;
        
        System.out.println("A conversão de milhas para km é de: " + conversao + "km");
        
    }
}