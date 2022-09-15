package exemplos;

import java.util.Scanner;

public class diasSemana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 7: ");
		int Dia = sc.nextInt();
		if (Dia == 1) {
			System.out.println("Primeiro Dia Da Semana é Domingo");
		} else if (Dia == 2) {
			System.out.println("Segundo Dia Da Semana é Segunda");
		} else if (Dia == 3) {
			System.out.println("Terceiro Dia Da Semana é Terça");
		} else if (Dia == 4) {
			System.out.println("Quarto Dia Da Semana é Quarta");
		} else if (Dia == 5) {
			System.out.println("Quinto Dia Da Semana é Quinta");
		} else if (Dia == 6) {
			System.out.println("Sexto Dia Da Semana é Sexta");
		} else if (Dia == 7) {
			System.out.println("Setimo Dia Da Semana é Sabado");
		} else {
			System.out.println("Não Corresponde Aos Dias Da Semana");
		}
		sc.close();

	}
}
