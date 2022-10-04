package exemplos;

import java.util.Scanner;

public class TemporizadorControle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Temporizador Flamingo");
		System.out.println("Quantas Horas?");
		int horas = sc.nextInt();
		System.out.println("Quantos Minutos");
		int minutos = sc.nextInt();
		System.out.println("Quantos Segundos");
		int segundos = sc.nextInt();
		for (int k = horas; k >= 0; k--) {
			for (int i = minutos; i >= 0; i--) {
				for (int j = segundos; j >= 0; j--) {
					System.out.println(k + ":" + i + ":" + j);
					segundos = 59;
					minutos = 59;
					sc.close();
				}
			}
		}
	}
}
