package orientacaoaobjetos;

public class Pessoa1 {

	String[] nome = { "Jailson", "José", "Isaque" };
	int[] idade = { 37, 19, 30 };
	String[] profissao = { "Professor", "Administrador", "Pelezeiro" };

	public static void main(String[] args) {
		Pessoa1 cadastro01 = new Pessoa1();

		System.out.println("O nome da pessoa é :" + cadastro01.nome[0]);
		System.out.println("A idade da pessoa é :" + cadastro01.idade[0]);
		System.out.println("A profissão da pessoa é :" + cadastro01.profissao[0]);

		Pessoa1 cadastro02 = new Pessoa1();

		System.out.println("O nome da pessoa é :" + cadastro02.nome[1]);
		System.out.println("A idade da pessoa é :" + cadastro02.idade[1]);
		System.out.println("A profissão da pessoa é :" + cadastro02.profissao[1]);

		Pessoa1 cadastro03 = new Pessoa1();

		System.out.println("O nome da pessoa é :" + cadastro03.nome[2]);
		System.out.println("A idade da pessoa é :" + cadastro03.idade[2]);
		System.out.println("A profissão da pessoa é :" + cadastro03.profissao[2]);
	}
}
