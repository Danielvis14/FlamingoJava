/*1) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a 
 * idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
 */
package exercicios03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os anos");
		int anos = sc.nextInt();	
		System.out.println("Digite os meses");
		int meses = sc.nextInt();
		System.out.println("Digite os dias");
		int dias = sc.nextInt();
		int IdadeTotalDias = (anos * 365) + (meses * 30) + dias;
		System.out.println("O Total Da Idade Em Dias É: " + IdadeTotalDias);
		sc.close();
	}
}
