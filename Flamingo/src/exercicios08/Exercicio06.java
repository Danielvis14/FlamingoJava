package exercicios08;

public class Exercicio06 {
	public static void main(String args[]) {
		int numero = 5;
		int expoente = 3;
		int resultado = calculatePower(numero, expoente);
		System.out.println(numero + "^" + expoente + "=" + resultado);
	}

	static int calculatePower(int num, int power) {
		int resposta = 1;
		int expoente = 0;
		int numero = 0;
		if (numero > 0 && expoente == 0) {
			return resposta;
		} else if (num == 0 && power >= 1) {
			return 0;
		} else {
			for (int i = 1; i <= power; i++) {
				resposta = resposta * num;
			}
			return resposta;

		}
	}

}
