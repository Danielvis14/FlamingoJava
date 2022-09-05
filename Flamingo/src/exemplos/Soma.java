package exemplos;

import java.util.Scanner;

//Adição
public class Soma {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor1 = sc.nextInt();
		System.out.println("Digite um valor: ");
		int valor2 = sc.nextInt();
		System.out.println("Digite mais um valor: ");
		int soma = valor1 + valor2;
		System.out.println("soma dos valores é: " + soma);
		sc.close();
	}
}
