import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {

		int numero;

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		numero = scan.nextInt();

		System.out.println("");
		
		if (numero % 2 == 0) {
			System.out.println("O numero e par.");

		} else {
			System.out.println("O numero e impar.");
		}

		scan.close();
	}

}
