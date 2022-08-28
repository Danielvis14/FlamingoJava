/*3)Solicite dois números e exiba a soma entre os dois números.*/

/**
 * JavaDoc
 * @author Daniel De Jesus
 *
 */
package exercicios;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número:");
		int numero = sc.nextInt();
		System.out.println("Digite mais um número:");
		int numero1 = sc.nextInt();
		int soma = numero + numero1;
		System.out.println("O valor da soma é: " + soma);
		sc.close();
		}
}