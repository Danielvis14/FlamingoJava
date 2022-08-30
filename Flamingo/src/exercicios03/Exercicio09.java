/*9) Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, 
utilizando a fórmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).*/

package exercicios03;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite O Valor Da Prestação: ");
		float valorDaPrestacao = sc.nextFloat();
		System.out.println("Digite O Valor Da Taxa De Atraso em %: ");
		float valorDaTaxa = sc.nextFloat();
		System.out.println("Digite O Tempo de Atraso Em Dias: ");
		float tempoDeAtraso = sc.nextInt();
		float jurosPrestacao = (valorDaPrestacao + (valorDaPrestacao * valorDaTaxa / 100) * tempoDeAtraso);
		System.out.println("O Valor Da Prestação É: "+jurosPrestacao+ "R$");
		sc.close();

	}
}
