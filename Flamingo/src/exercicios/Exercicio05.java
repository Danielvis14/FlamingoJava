/*5)Solicite dois valores e exiba a multiplicação entre os dois valores.*/

/**
 * JavaDoc
 * @author Daniel De Jesus
 *
 */
package exercicios;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número:");
		float numero = sc.nextFloat();
		System.out.println("Digite mais um número:");
		float numero1 = sc.nextFloat();
		float multiplicacao = numero * numero1;
		System.out.println("O valor da multiplicação é: " + multiplicacao);
		sc.close();
		}
}