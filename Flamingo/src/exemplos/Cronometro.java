package exemplos;

public class Cronometro {
	public static void main(String[] args) {
		System.out.println("Cronometro Flamingo");
		for (int k = 0; k <= 24; k++) {
			for (int i = 0; i < 60; i++) {
				for (int j = 0; j < 60; j++) {
					System.out.println(k + ":" + i + ":" + j);
				}
			}
		}
	}
}
