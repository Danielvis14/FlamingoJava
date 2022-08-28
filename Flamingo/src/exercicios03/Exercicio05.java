/*5) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
A fórmula de conversão é F = (9*C + 160)/5,sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/

package exercicios03;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a Temperatura em graus Celsius: ");
		int celsius = sc.nextInt();
		int Fahrenheit = (9 * celsius + 160) / 5;
		System.out.println("a temperatura em Fahrenheit é: " + Fahrenheit + "º");
		sc.close();
	}
}
 