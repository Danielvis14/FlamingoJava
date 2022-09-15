//2) Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).
package exercicios05;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		System.out.println("Digite Um Valor: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		if (numero > 0) {
			System.out.println("O Valor É Positivo");
		} else if (numero == 0) {
			System.out.println("O Valor É Neutro");
		} else {
			System.out.println("O Valor É Negativo");
			sc.close();
		}
	}
}
