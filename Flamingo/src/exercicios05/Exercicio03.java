/*3) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se foremcompradas
pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.*/

package exercicios05;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		System.out.println("Digite O Numero De Maças Compradas:");
		Scanner sc = new Scanner(System.in);
		int numeroMacas = sc.nextInt();
		if (numeroMacas < 12) {
			double conta = numeroMacas * 1.30;
			System.out.println("Custo Total R$" + conta);
		} else {
			double conta = numeroMacas * 1.00;
			System.out.println("Custo Total R$" + conta);

		}
		sc.close();
	}
}