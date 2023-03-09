import java.util.Scanner;

/**
 *
 * @author Eric Nahas, Armando Righi
 */

public class Ex17 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1;
		int n2;
		double R;

		System.out.println("Digite o primeiro número: ");
		n1 = teclado.nextInt();

		System.out.println("Digite o segundo número: ");
		n2 = teclado.nextInt();

		R = Math.pow(n1, n2);

		System.out.println("O primeiro número elevado ao segundo é: " + R); 
	}
}

		