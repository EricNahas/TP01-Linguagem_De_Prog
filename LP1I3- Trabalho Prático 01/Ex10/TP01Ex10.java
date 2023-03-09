import java.util.Scanner;
/**
 *
 * @author Eric Nahas, Armando Righi
 */
public class TP01Ex10 {
    public static void main(String[] args){
        System.out.println("Digite um valor em graus Celsius: ");
        Scanner input = new Scanner(System.in);
        double graus= input.nextDouble();
	

        double conversao = (graus * 1.8) + 32;
        
        System.out.println("A conversão de graus Celsius para fahrenheit é de: " + conversao + " fahrenheit");
        
    }
}