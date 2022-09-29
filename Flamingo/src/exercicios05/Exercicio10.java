/*10) Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que ele recebe 
uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular 
e escrever o seu salário total.*/

package exercicios05;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o salario fixo do funcionário: ");
		double salarioFixo = sc.nextInt();
		System.out.println("Digite o valor das vendas mensais do funcionário: ");
		double valorDeVendas = sc.nextDouble();
		double salarioMensal = (salarioFixo + valorDeVendas);

		if (valorDeVendas <= 1500) {
			double salarioMensalFinal = (valorDeVendas * 3) / 100 + salarioMensal;
			System.out.println("O Salario final do funcionário é de R$" + salarioMensalFinal);
		} else if (valorDeVendas > 1500) {
			double salarioMensalFinal = (valorDeVendas * 5) / 100 + salarioMensal;
			System.out.println("O Salario final do funcionário é de R$" + salarioMensalFinal);
			sc.close();

		}
	}
}