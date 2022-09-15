package exemplos;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite Um Valor: ");
		int valor = sc.nextInt();
		if (valor > 20) {
			System.out.println("Valor Digitado É Maior Que 20");
		} else {
			System.out.println("Valor Digitado É Menor Que 20");
		}
		sc.close();
	}
}
