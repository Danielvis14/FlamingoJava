/*2)Solicite um valor do teclado e exiba o seu antecessor.*/

/**
 * JavaDoc
 * @author Daniel De Jesus
 *
 */
package exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número:");
		int numero = sc.nextInt();
		int antecessor = numero - 1;
		System.out.println("o antessesor do número digitado é: " + antecessor);
		sc.close();
	}

}
