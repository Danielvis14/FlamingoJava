package exemplos;

import java.util.Scanner;

public class Exemplo08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
// operadores matematicos
//Adição
		int valor1 = sc.nextInt();
		System.out.println("Digite um valor: ");
		int valor2 = sc.nextInt();
		System.out.println("Digite mais um valor: ");
		int soma = valor1 + valor2;
		System.out.println("soma dos valores é: " + soma);
//Subtração
		int valor3 = sc.nextInt();
		System.out.println("Digite um valor: ");
		int valor4 = sc.nextInt();
		int subtracao = valor3 + valor4;
		System.out.println("Digite mais um valor: ");
		System.out.println("subtração dos valores é: " + subtracao);
//Multiplicação
		int valor5 = sc.nextInt();
		System.out.println("Digite um valor: ");
		int valor6 = sc.nextInt();
		System.out.println("Digite mais um valor: ");
		int multiplicacao = valor5 + valor6;
		System.out.println("multiplicacao dos valores é: " + multiplicacao);

//Divisão
		int valor7 = sc.nextInt();
		System.out.println("Digite um valor: ");
		float valor8 = sc.nextFloat();
		System.out.println("Digite mais um valor: ");
		float divisao = valor7 / valor8;
		System.out.println("divisao dos valores é: " + divisao);

// Resto Da Divisão
		int valor9 = sc.nextInt();
		System.out.println("Digite um valor: ");
		float valor10 = sc.nextFloat();
		System.out.println("Digite mais um valor: ");
		float restoDivisao = valor9 % valor10;
		System.out.println("o resto da divisão dos valores é: " + restoDivisao);

	}
}
