//2) Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).
package exercicios08;

public class Exercicio02 {
	public static void main(String[] args) {
		
		int contadora = 1;
		while (contadora<=100) {
			int somadora=2;
			int conta = contadora+somadora;
			System.out.println(conta);
			contadora++;
		}
	}

}
