package exemplos;
//importando uma nova classe
import java.util.Scanner;

public class Exemplo05 {

	public static void main(String[] args) {
		//sc e o objeto
		Scanner sc = new Scanner(System.in);
		// receber valor
		int numero=sc.nextInt();
		int numero1=sc.nextInt();
		int soma=numero+numero1;
		System.out.println("O valor da soma é: "+soma);
		sc.close();
}
}
