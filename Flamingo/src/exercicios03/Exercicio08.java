/*8) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel
que faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto*/

package exercicios03;

import java.util.Scanner;

public class Exercicio08 {
	public static void main (String[] Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual Tempo Gasto Na Viagem Em Horas? ");
		double TempoGastoViagem = sc.nextDouble();
		System.out.println("Qual A Velocidade Media em KM/H? ");
		double VelocidadeMedia = sc.nextDouble();
		double Distancia = TempoGastoViagem * VelocidadeMedia;
		double LitrosUsados = (Distancia/12);
		System.out.println("Distância Percorrida É: " +Distancia+"KM");
		System.out.println("Quantida De Litros Utilizados É:  " +LitrosUsados);
		sc.close();	
		
	}
}
