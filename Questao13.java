import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {

		char letra;

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite uma letra: ");
		letra = scan.next().charAt(0);

		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("A letra e uma vogal");

		} else {
			System.out.println("A letra e uma consoante");
		}

		scan.close();

	}

}
