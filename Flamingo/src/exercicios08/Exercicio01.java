package exercicios08;

import java.util.Scanner;

public class Exercicio01 {
	/*
	 * 1) Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um
	 * número qualquer.
	 */
	public class Exercicio01Lista08 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Digite um número :");
			int numero = sc.nextInt();
			int contadora = 1;

			while (contadora <= 10) {
				System.out.println(numero + " x " + contadora + " = " + numero * contadora);
				contadora++;
			}
			sc.close();
		}

	}
}
