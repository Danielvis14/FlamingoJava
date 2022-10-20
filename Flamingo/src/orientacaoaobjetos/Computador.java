package orientacaoaobjetos;

public class Computador {
	String marca = "Dell";
	String modelo = "Optiplex 3080";
	String processador = "Intel Core I5-10500 3,1Ghz";
	String memoriaRam = "16GB";
	String fonte = "200W";
	String discoRigido = "256GB";
	String sistemaOperacional = "Windows 11";

	public static void main(String[] args) {
		Computador especificacao = new Computador();
		System.out.println("Marca: " + especificacao.marca);
		System.out.println("Modelo: " + especificacao.modelo);
		System.out.println("Processador: " + especificacao.processador);
		System.out.println("Memoria Ram: " + especificacao.memoriaRam);
		System.out.println("Fonte: " + especificacao.fonte);
		System.out.println("Disco Rigido: " + especificacao.discoRigido);
		System.out.println("Sistema Operacional: " + especificacao.sistemaOperacional);
	}
}
