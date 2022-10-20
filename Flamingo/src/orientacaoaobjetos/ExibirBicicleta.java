package orientacaoaobjetos;

public class ExibirBicicleta {
	public static void main(String[] args) {
		Bicicleta01 informacao = new Bicicleta01();
		System.out.println("Marca: " + informacao.marca);
		System.out.println("Tamanho do Quadro: " + informacao.tamanhoQuadro);
		System.out.println("Modelo: " + informacao.modelo);
		System.out.println("Gênero: " + informacao.genero);
		System.out.println("Aro Da Roda: " + informacao.aroRoda);
		System.out.println("Marchas: " + informacao.marchas);
		System.out.println("Cor: " + informacao.cor);
	}

}
