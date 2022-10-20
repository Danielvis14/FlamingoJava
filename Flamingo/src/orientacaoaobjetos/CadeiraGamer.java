package orientacaoaobjetos;

public class CadeiraGamer {
	String marca = "PC TOP";
	String modelo = "Racer 1006";
	String cor = "Preto/Vermelho";
	String materialEstofado = "Couro Sintético";
	String materialDaEstrutura = "Plástico";
	String tipoCadeira = "Gamer";

	public static void main(String[] args) {
		CadeiraGamer gamer = new CadeiraGamer();
		System.out.println("Marca: " + gamer.marca);
		System.out.println("Modelo: " + gamer.modelo);
		System.out.println("Cor: " + gamer.cor);
		System.out.println("Material Do Estofado: " + gamer.materialEstofado);
		System.out.println("Material Da Estrutura: " + gamer.materialDaEstrutura);
		System.out.println("Tipo Da Cadeira: " + gamer.tipoCadeira);
	}
}
