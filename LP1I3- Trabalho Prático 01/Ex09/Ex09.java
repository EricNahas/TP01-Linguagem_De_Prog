import java.util.Scanner;

/**
 *
 * @author Eric Nahas, Armando Righi
 */

public class Ex09 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int r;
		int i;
		int V;

		System.out.println("Digite a resistência: ");
		r = teclado.nextInt();

		System.out.println("Digite a corrente elétrica: ");
		i = teclado.nextInt();

		V = r * i;

		System.out.println("A tesão é de: " + V); 
	}
}

		