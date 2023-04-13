import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		
		double gasolina = 2.53;
		double etanol = 2.09;
		double diesel = 1.92;
		String combustivel;
		double litros;

		Scanner scan = new Scanner(System.in);

		System.out.print("Qual o combustivel? ");
		combustivel = scan.nextLine();
		System.out.print("Quantos litros? ");
		litros = scan.nextDouble();

		System.out.println("");
		
		if (litros >= 30 && combustivel.equals("etanol")) {
			System.out.println("Total a pagar: " + etanol * litros + " Reais.");
			System.out.println("Voce ganhou uma troca de oleo gratis!");
			
		} else if (litros < 30 && combustivel.equals("etanol")) {
			System.out.println("Total a pagar: " + etanol * litros + " Reais.");
			
		} else if (combustivel.equals("gasolina")) {
			System.out.println("Total a pagar: " + gasolina * litros + " Reais.");
			
		} else if (combustivel.equals("diesel")) {
			System.out.println("Total a pagar: " + diesel * litros + " Reais.");
			
		} else {
			System.out.println("Escolha entre gasolina, etanol ou diesel.");
		}
		
		scan.close();
	}

}
