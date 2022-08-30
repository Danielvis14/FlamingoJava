/*6) Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius.
A fórmula deconversão é C=(F-32)*(5/9),sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/

package exercicios03;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite A Temperatura em Fahrenheit: ");
		float grausFahrenheit = sc.nextFloat();
		float grausCelsius = (grausFahrenheit - 32) * 5 / 9;
		System.out.println("A Temperatura Em Graus Celsius É: " + grausCelsius + "º");
		sc.close();
	}
}
