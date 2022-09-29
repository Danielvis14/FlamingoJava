/*7. Efetuar a leitura de três valores (variáveis A, B e C) e apresentá-los dispostos em ordem crescente.*/
package exercicios06;

import java.util.Scanner;


public class Exercicio07 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o Primeiro Valor: ");
	int variavelA = sc.nextInt();
	System.out.println("Digite o Segundo Valor: ");
	int variavelB = sc.nextInt();
	System.out.println("Digite o Terceiro Valor: ");
	int variavelC = sc.nextInt();
	System.out.print("os numeros ordenados em ordem crescente são: ");
	if (variavelA<variavelB) {
	 if (variavelB<variavelC) {
			System.out.println(+variavelA);
			System.out.println(+variavelB);
			System.out.println(+variavelC);
		} else if (variavelA<variavelC) {
			System.out.println(+variavelA);
			System.out.println(+variavelC);
			System.out.println(+variavelB);
		}else {
			System.out.println(+variavelC);
			System.out.println(+variavelA);
			System.out.println(+variavelB);
		}
	 sc.close();
	}
	}
	}
