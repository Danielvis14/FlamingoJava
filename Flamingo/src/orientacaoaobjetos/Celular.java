package orientacaoaobjetos;

public class Celular {
	String marca = "Apple";
	String linha = "Iphone";
	String modelo = "Iphone11";
	String cor = "Branco";
	String memoriaInterna = "256GB";
	String memoriaRam = "4gb";
	String cameraTraseiraPrincipal = "12Mpx";
	String cameraFrontalPrincipal = "12Mpx";
	String tela = "6.1";

	public static void main(String[] args) {
	Celular descricao = new Celular();
	System.out.println("Marca: "+ descricao.marca);
	System.out.println("Linha: "+ descricao.linha);
	System.out.println("Modelo: "+descricao.modelo);
	System.out.println("Cor: "+descricao.memoriaInterna);
	System.out.println("Memoria Ram: "+descricao.memoriaRam);
	System.out.println("Camera Traseira: "+descricao.cameraTraseiraPrincipal);
	System.out.println("Camera Frontal: "+descricao.cameraFrontalPrincipal);
	System.out.println("Tela: "+descricao.tela);
	} 
}
