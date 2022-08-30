/*4)O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do 
	distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja 
	de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever 
	o custo final ao consumidor.*/

package exercicios03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor de custo de fabrica do carro: ");
		float valorCustoDeFabrica = sc.nextFloat();
		int porcentagemDeValorDeDistribuidor = 28;
		int porcentagemDeValorDeImposto = 45;
		float valorDeDistribuidor = valorCustoDeFabrica * porcentagemDeValorDeDistribuidor / 100;
		float valorDeImposto = valorCustoDeFabrica * porcentagemDeValorDeImposto / 100;
		float valorDeCustoDoConsumidor = valorCustoDeFabrica + valorDeDistribuidor + valorDeImposto;
		System.out.println("O Custo do Consumidor é: " + valorDeCustoDoConsumidor + " R$");
		sc.close();
	}
}
