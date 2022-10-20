package orientacaoaobjetos;

public class ExibirCelular {

	public static void main(String[] args) {
		Celular01 descricao = new Celular01();
		System.out.println("Marca: "+ descricao.marca);
		System.out.println("\nLinha: "+ descricao.linha);
		System.out.println("Modelo: "+descricao.modelo);
		System.out.println("Cor: "+descricao.memoriaInterna);
		System.out.println("Memoria Ram: "+descricao.memoriaRam);
		System.out.println("Camera Traseira: "+descricao.cameraTraseiraPrincipal);
		System.out.println("Camera Frontal: "+descricao.cameraFrontalPrincipal);
		System.out.println("Tela: "+descricao.tela);
		} 
}
