import java.util.Scanner;

/**
 *
 * @author Eric Nahas, Armando Righi
 */

public class Ex01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int baseRet;
		int alturaRet;
		int area;

		System.out.println("Digite a base do retângulo: ");
		baseRet = teclado.nextInt();

		System.out.println("Digite a altura do retângulo: ");
		alturaRet = teclado.nextInt();

		area = baseRet * alturaRet;

		System.out.println("A área é de: " + area); 
	}
}

		