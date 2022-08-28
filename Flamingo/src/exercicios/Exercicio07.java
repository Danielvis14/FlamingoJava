/*7)Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo. Dica a=b.h*/

/**
 * JavaDoc
 * @author Daniel De Jesus
 *
 */
package exercicios;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a base do retângulo:");
		int base = sc.nextInt();
		System.out.println("Digite a altura do retângulo:");
		int altura = sc.nextInt();
		int area = base * altura;
		System.out.println("a área do retangulo é: " + area);
		sc.close();
	}
}