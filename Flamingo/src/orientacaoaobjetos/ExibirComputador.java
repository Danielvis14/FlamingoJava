package orientacaoaobjetos;

public class ExibirComputador {

	public static void main(String[] args) {
		Computador01 especificacao = new Computador01();
		System.out.println("Marca: " + especificacao.marca);
		System.out.println("Modelo: " + especificacao.modelo);
		System.out.println("Processador: " + especificacao.processador);
		System.out.println("Memoria Ram: " + especificacao.memoriaRam);
		System.out.println("Fonte: " + especificacao.fonte);
		System.out.println("Disco Rigido: " + especificacao.discoRigido);
		System.out.println("Sistema Operacional: " + especificacao.sistemaOperacional);
	}
}