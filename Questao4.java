import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {

		int valorCompra;
		String formaPagamento;

		Scanner scan = new Scanner(System.in);
		System.out.print("Qual a forma de pagamento? ");
		formaPagamento = scan.nextLine();
		
		System.out.print("Qual o valor da compra? ");
		valorCompra = scan.nextInt();

		System.out.println("");
		
		if (valorCompra >= 100 && formaPagamento.equals("dinheiro") || formaPagamento.equals("Dinheiro")) {
			System.out.println("Desconto de 10%");
			System.out.println("Valor a pagar: " + (valorCompra * 0.9 + " Reais."));
			
		} else {
			System.out.println("Sem desconto");
			System.out.println("Valor a pagar: " + valorCompra + " Reais.");
		}
		scan.close();
	}

}
