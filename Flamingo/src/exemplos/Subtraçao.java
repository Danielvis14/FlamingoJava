package exemplos;

import java.util.Scanner;

public class Subtraçao {
//Subtração
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor3 = sc.nextInt();
		System.out.println("Digite mais um valor: ");
		int valor4 = sc.nextInt();
		int subtracao = valor3 + valor4;
		System.out.println("subtração dos valores é: " + subtracao);
		sc.close();
	}
}
