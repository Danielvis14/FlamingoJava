package orientacaoaobjetos;

public class ExibirCadeiraGamer {
	public static void main(String[] args) {
		CadeiraGamer01 gamer = new CadeiraGamer01();
		System.out.println("Marca: " + gamer.marca);
		System.out.println("Modelo: " + gamer.modelo);
		System.out.println("Cor: " + gamer.cor);
		System.out.println("Material Do Estofado: " + gamer.materialEstofado);
		System.out.println("Material Da Estrutura: " + gamer.materialDaEstrutura);
		System.out.println("Tipo Da Cadeira: " + gamer.tipoCadeira);
	}
}
