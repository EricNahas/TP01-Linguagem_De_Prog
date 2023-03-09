import java.util.Scanner;

/**
 *
 * @author Eric Nahas, Armando Righi
 */

public class Ex18 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double p1;
		double p2;
		double p3;
		double p4;
		double p5;
		double total;
		double pagar;
		double troco;

		System.out.println("Digite os valores dos produtos: ");
		p1 = teclado.nextDouble();
		p2 = teclado.nextDouble();
		p3 = teclado.nextDouble();
		p4 = teclado.nextDouble();
		p5 = teclado.nextDouble();

		total = p1 + p2 + p3 + p4 + p5;

		do {

			System.out.println("Digite a quantia do pagamento: ");		
			pagar = teclado.nextDouble();

			if (pagar < total)
			{

				System.out.println("O valor digitado é insuficiente para o pagamento ");

			}	

		}

		while (pagar < total);

		troco = pagar - total;

		System.out.println("Seu troco é de: " + troco);	
	}
}

		