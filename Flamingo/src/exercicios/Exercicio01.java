//comentário em line

//*comentario multilinha*/
/*1)Solicite um valor do teclado e exiba o seu sucessor.*/

/**
 * JavaDoc
 * @author Daniel De Jesus
 *
 */
package exercicios;
import java.util.Scanner;

public class Exercicio01 {
	// metodo principal (procedimento sem retorno, só exibe)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor:");
		int numero=sc.nextInt();
		int sucessor=numero+1;
		System.out.println("O sucessor do numero digitado é:"+sucessor);
	sc.close();
	}
}