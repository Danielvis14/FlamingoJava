/*4) Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma 
mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). 
Escrever também a média calculada.*/
package exercicios05;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a Primeira Nota da Avaliação do Aluno:");
		float primeiraNota = sc.nextFloat();
		System.out.println("Digite a Segunda Nota da Avaliação do Aluno:");
		float segundaNota = sc.nextFloat();
		float media = (primeiraNota + segundaNota) / 2;
		if (media >= 6) {
			System.out.println("Aluno Aprovado");
		} else {
			System.out.println("Aluno Reprovado");
		}
		sc.close();
	}
}
