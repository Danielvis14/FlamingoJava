package exemplos;

public class ExemploWhileComBreak {
	public static void main(String[] args) {
		int contadora = 0;
		while (contadora < 10) {
			System.out.println(contadora);
			contadora++;
			if (contadora == 4) {
				break;
			}
		}
	}
}
