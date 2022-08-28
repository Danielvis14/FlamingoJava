/*3) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
Calcular e escrever o valor do novo salário.*/

package exercicios03;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite O Nome Do Funcionario: ");
		String Funcionario = sc.next();
		System.out.println("Digite o Salario: ");
		float salario = sc.nextFloat();
		System.out.println("Digite a Porcentagem: ");
		float porcentagem = sc.nextFloat();
		float NovoSalario = (salario * porcentagem) / 100 + salario;
		System.out.println("O novo salário do funcionario " + Funcionario + " é: " + NovoSalario + "R$");
		sc.close();
	}
}
