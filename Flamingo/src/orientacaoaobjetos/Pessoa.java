package orientacaoaobjetos;

public class Pessoa {

	String nome = "Daniel";
	int idade = 22;
	String profissao = " Analista De Ti";

	public static void main(String[] args) {
		Pessoa cadastro01 = new Pessoa();
		System.out.println("o nome da pessoa é: " + cadastro01.nome);
		System.out.println("a idade da pessoa é: " + cadastro01.idade);
		System.out.println("a profissão da pessoa é: " + cadastro01.profissao);

	}

}
