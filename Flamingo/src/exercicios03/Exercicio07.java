//7) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: Volume = π*Raio2*Altura
package exercicios03;
import java.util.Scanner;

public class Exercicio07 {
	static double pi = 3.14;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Valor do Raio: ");
		double Raio = sc.nextDouble();
		System.out.println("Digite O Valor da Altura");
		double Altura = sc.nextDouble();
		double Volume = (pi*Raio*Raio)*Altura;
		System.out.println("O Valor Do Volume Da Lata De Óleo É: " + Volume);
		sc.close();
	}
}
