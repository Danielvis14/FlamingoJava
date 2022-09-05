package exemplos;

import java.util.Scanner;

public class Divisão {
	// Divisão
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor7 = sc.nextInt();
		System.out.println("Digite mais um valor: ");
		float valor8 = sc.nextFloat();
		float divisao = valor7 / valor8;
		System.out.println("divisao dos valores é: " + divisao);
		sc.close();
	}
}