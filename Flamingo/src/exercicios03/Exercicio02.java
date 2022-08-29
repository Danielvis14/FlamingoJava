/*2) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, 
nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.*/

package exercicios03;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite número total de eleitores do município: ");
		float totalEleitoresMunicipio = sc.nextFloat();
		System.out.println("Digite o número de votos brancos");
		float totalVotosBrancos = sc.nextFloat();
		System.out.println("Digite o número de votos nulos");
		float totalVotosNulos = sc.nextFloat();
		System.out.println("Digite o número de votos validos");
		float totalVotosValidos = sc.nextFloat();
		float percentualVotosBrancos = (totalVotosBrancos / totalEleitoresMunicipio) * 100;
		System.out.println("A porcentagem de votos brancos é: " + percentualVotosBrancos + "%");
		float percentualVotosNulos = (totalVotosNulos / totalEleitoresMunicipio) * 100;
		System.out.println("A porcentagem de votos nulos é: " + percentualVotosNulos + "%");
		float percentualVotosValidos = (totalVotosValidos / totalEleitoresMunicipio) * 100;
		System.out.println("A porcentagem de votos validos é: " + percentualVotosValidos + "%");
		sc.close();
	}

}
