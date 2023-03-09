import java.util.Scanner;
/**
 *
 * @author Eric Nahas, Armando Righi
 */
public class TP01Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da aresta do cubo (em cm): ");
        double aresta = input.nextDouble();

        System.out.print("Digite o valor do raio da esfera (em cm): ");
        double raio = input.nextDouble();

        double volumeCubo = Math.pow(aresta, 3);
        double volumeEsfera = (4 / 3) * Math.PI * Math.pow(raio, 3);
        double volumeLivre = volumeCubo - volumeEsfera;

        System.out.println("O volume livre do ambiente é: " + volumeLivre + " cm³");
    }
}
