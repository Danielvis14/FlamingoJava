package exemplos;

public class ExemploArrayFor02 {
	public static void main(String[] args) {
		String[] timesBrasileirao = { "Palmeiras", "Internacional", "Fluminense", "Corinthians", "Flamengo",
				"Ahtlético PR", "Atlético MG", "América MG", "Fortaleza", "Bragantino", "Goias", "Botafogo", "Santos",
				"São Paulo", "Ceará SC", "Coritiba", "Avai", "Cuiabá", "Atlético GO", "Juventude" };
		for (int contadora = 0; contadora < timesBrasileirao.length; contadora++) {
			System.out.println(contadora + 1 + " º " + timesBrasileirao[contadora]);
		}
	}
}