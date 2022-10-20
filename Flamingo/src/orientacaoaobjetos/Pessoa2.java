package orientacaoaobjetos;

public class Pessoa2 {

	String[] nome = { "Jailson", "José", "Isaque" };
	int[] idade = { 37, 19, 30 };
	String[] profissao = { "Professor", "Administrador", "Pelezeiro" };

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			Pessoa2 cadastro = new Pessoa2();

			System.out.println("O nome da pessoa é :" + cadastro.nome[i]);
			System.out.println("A idade da pessoa é :" + cadastro.idade[i]);
			System.out.println("A profissão da pessoa é :" + cadastro.profissao[i]);
		}

	}
}
