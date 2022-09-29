/*11) Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o 
saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior ou igual a zero 
escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.*/

package exercicios05;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		System.out.println("Digite o numero da conta: ");
		Scanner sc = new Scanner(System.in);
		int numeroDaConta = sc.nextInt();
		System.out.println("Informe o saldo da conta: ");
		int saldoDaConta = sc.nextInt();
		System.out.println("Informe o débito da conta: ");
		int debitoDaConta = sc.nextInt();
		System.out.println("Informe o credito da conta: ");
		int creditoDaConta = sc.nextInt();
		int saldoAtual = (saldoDaConta - debitoDaConta + creditoDaConta);
		if (saldoAtual >= 0) {
			int saldoPositivo = (saldoAtual);
			System.out.println("O Saldo da conta é R$" + saldoPositivo + ".O saldo está Positivo");
		} else if (saldoAtual < 0) {
			int saldonegativo = (saldoAtual);
			System.out.println("O Saldo da conta é R$" + saldonegativo + ". O saldo está Negativo");
			sc.close();

		}
	}

}
