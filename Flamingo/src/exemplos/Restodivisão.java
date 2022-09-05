package exemplos;

import java.util.Scanner;

public class Restodivisão {

	// Resto Da Divisão
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor9 = sc.nextInt();
		System.out.println("Digite mais um valor: ");
		float valor10 = sc.nextFloat();
		float restoDivisao = valor9 % valor10;
		System.out.println("o resto da divisão dos valores é: " + restoDivisao);
		sc.close();

	}
}
