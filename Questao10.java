import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {

		int saldoMedio;

		Scanner scan = new Scanner(System.in);

		System.out.print("Qual o saldo medio do cliente? ");
		saldoMedio = scan.nextInt();

		System.out.println("");

		if (saldoMedio >= 0 && saldoMedio <= 200) {
			System.out.println("Saldo medio: " + saldoMedio);
			System.out.println("Nenhum credito");

		} else if (saldoMedio >= 201 && saldoMedio <= 400) {
			System.out.println("Saldo medio: " + saldoMedio);
			System.out.println("Valor do credito: " + (saldoMedio * 0.2) + " Reais");

		} else if (saldoMedio >= 401 && saldoMedio <= 600) {
			System.out.println("Saldo medio: " + saldoMedio);
			System.out.println("Valor do credito: " + (saldoMedio * 0.3 + " Reais"));

		} else {
			System.out.println("Saldo medio: " + saldoMedio + " Reais");
			System.out.println("Valor do credito: " + (saldoMedio * 0.4 + " Reais"));
		}

		scan.close();
	}

}
