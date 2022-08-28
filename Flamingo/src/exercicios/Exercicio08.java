//8) Escreva um algoritmo para ler as dimensões de um triângulo (base e altura), calcular e escrever a área do triângulo. Dica a=b.h/2
package exercicios;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a base do triângulo:");
		int base = sc.nextInt();
		System.out.println("Digite a altura do triângulo:");
		int altura = sc.nextInt();
		int triangulo = base * altura / 2;
		System.out.println("a área do triângulo é:"+triangulo);
		sc.close();
	}

}
