/*1) Ler quatro números inteiros e apresentar o resultado da adição e multiplicação, 
baseando-se na utilização do conceito da propriedade distributiva. Ou seja, se forem lidas 
as variáveis A, B, C, e D, devem ser somadas e multiplicadas A com B, A com C e A com D. 
Depois B com C, B com D e por fim C com D. Perceba que será necessário efetuar seis operações de adição e 
seis operações de multiplicação e apresentar doze resultados de saída.*/

package exercicios04;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Primeiro Número: ");
		float variavelA = sc.nextInt();
		System.out.println("Digite O Segundo Número: ");
		float variavelB = sc.nextInt();
		System.out.println("Digite O Terceiro Número: ");
		float variavelC = sc.nextInt();
		System.out.println("Digite O Quarto Número: ");
		float variavelD = sc.nextInt();
		float soma1 = variavelA + variavelB;
		float soma2 = variavelC + variavelA;
		float soma3 = variavelA + variavelD;
		float soma4 = variavelB + variavelC;
		float soma5 = variavelB + variavelD;
		float soma6 = variavelC + variavelD;
		System.out.println("Resultado Da Soma: \nA+B=" + soma1 + "\nC+A=" + soma2 + "\nA+D=" + soma3 + "\nB+C=" + soma4
				+ "\nB+D=" + soma5 + "\nC+D=" + soma6);
		float multiplicacao1 = variavelA * variavelB;
		float multiplicacao2 = variavelC * variavelA;
		float multiplicacao3 = variavelA * variavelD;
		float multiplicacao4 = variavelB * variavelC;
		float multiplicacao5 = variavelB * variavelD;
		float multiplicacao6 = variavelC * variavelD;
		System.out.println("Resultado Da Multiplicacao: \nA*B=" + multiplicacao1 + "\nC*A=" + multiplicacao2 + "\nA*D="
				+ multiplicacao3 + "\nB*C=" + multiplicacao4 + "\nB*D=" + multiplicacao5 + "\nC*D=" + multiplicacao6);
		sc.close();
	}

}