/*10) Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, e efetuar a troca dos valores de forma que a variável A passe a possuir 
o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.*/

package exercicios03;

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main (String[] Args) {
		int variavelTroca;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite O Primeiro Valor: ");
		int variavelA = sc.nextInt();
		System.out.println("Digite O Segundo Valor: ");
		int variavelB = sc.nextInt();
		variavelTroca = variavelA;
		variavelA = variavelB;
		variavelB = variavelTroca;
		System.out.println("O Valor de A É: "+variavelA);
		System.out.println("O Valor de B É "+variavelB);
		sc.close();
	}
}
