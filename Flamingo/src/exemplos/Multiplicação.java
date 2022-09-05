package exemplos;

import java.util.Scanner;

public class Multiplicação {
//Multiplicação
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor5 = sc.nextInt();
		System.out.println("Digite mais um valor: ");
		int valor6 = sc.nextInt();
		int multiplicacao = valor5 + valor6;
		System.out.println("multiplicacao dos valores é: " + multiplicacao);
		sc.close();
	}

}
