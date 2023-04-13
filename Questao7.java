import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {

		int compra;
		int pagamento;
		int troco;
		int notasDe100Reais;
		int notasDe10Reais;
		int notasDe1Real;

		Scanner scan = new Scanner(System.in);

		System.out.print("Qual o valor da compra? ");
		compra = scan.nextInt();
		System.out.print("Qual o valor do pagamento? ");
		pagamento = scan.nextInt();

		troco = pagamento - compra;

		if (troco < 0) {
			System.out.println("Pagamento Negado");

		} else {
			System.out.println("Seu troco e: " + troco + " Reais");

			notasDe100Reais = troco / 100;
			System.out.println("Notas de 100 reais: " + notasDe100Reais);

			notasDe10Reais = (troco - notasDe100Reais * 100) / 10;
			System.out.println("Notas de 10 reais: " + notasDe10Reais);

			notasDe1Real = troco - notasDe100Reais * 100 - notasDe10Reais * 10;
			System.out.println("Notas de 1 real: " + notasDe1Real);
		}

		scan.close();

	}

}
