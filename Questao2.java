import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		int numero;

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		numero = scan.nextInt();

		System.out.println("");
		
		if (numero > 0) {
			System.out.println("O numero e positivo");
			
		} else if (numero < 0) {
			System.out.println("O numero e negativo");
			
		} else {
			System.out.println("O numero e neutro");
		}

		scan.close();
	}

}
