package exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a Base Maior");
		float basemaior = sc.nextFloat();
		System.out.println("Digite a Base Menor");
		float basemenor = sc.nextFloat();
		System.out.println("Digite a Altura: ");
		float altura = sc.nextFloat();
		float trapezio = ((basemaior + basemenor) * altura) / 2;
		System.out.println("O área do trapézio corresponde a: " + trapezio);
		sc.close();
	}
}