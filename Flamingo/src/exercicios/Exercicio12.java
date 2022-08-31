package exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da área do circulo");
		double area = sc.nextFloat();
		double circulo = (Math.PI * (area * area));
		System.out.println("O área do circulo corresponde a: " + circulo);
		sc.close();
	}
}