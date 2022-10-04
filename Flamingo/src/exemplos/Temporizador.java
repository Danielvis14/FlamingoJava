package exemplos;

public class Temporizador {
	public static void main(String[] args) {
		System.out.println("Temporizador Flamingo");
		for (int k = 24; k >= 0; k--) {
			for (int i = 59; i >= 0; i--) {
				for (int j = 59; j >= 0; j--) {
					System.out.println(k + ":" + i + ":" + j);
				}
			}
		}
	}
}

