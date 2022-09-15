/*1) Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
contrário escrever NÃO É MAIOR QUE 10!*/

package exercicios05;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite Um Valor: ");
		int numero = sc.nextInt();
		if (numero > 10) {
			System.out.println("É Maior Que 10!");
		} else if (numero == 10) {
			System.out.println("É Igual A 10!");
		} else {
			System.out.println("É Menor Que 10!");
			sc.close();
		}
	}
}