package orientacaoaobjetos;

public class Bicicleta {
	String marca = "Dropp Bikes";
	String tamanhoQuadro = "21";
	String modelo = "Bicicleta 29 Dropp SX EVO 21V Câmbio";
	String genero = "Unissex";
	String aroRoda = "29";
	String marchas = "21";
	String cor = "Preto";

	public static void main(String[] args) {
		Bicicleta informacao = new Bicicleta();
		System.out.println("Marca: " + informacao.marca);
		System.out.println("Tamanho do Quadro: " + informacao.tamanhoQuadro);
		System.out.println("Modelo: " + informacao.modelo);
		System.out.println("Gênero: " + informacao.genero);
		System.out.println("Aro Da Roda: " + informacao.aroRoda);
		System.out.println("Marchas: " + informacao.marchas);
		System.out.println("Cor: " + informacao.cor);
	}

}
