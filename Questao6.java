import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {

		int laranja = 60;
		int limao = 80;
		int morango = 20;
		String fruta;
		double preco;

		Scanner scan = new Scanner(System.in);

		System.out.print("Qual a fruta? ");
		fruta = scan.nextLine();
		System.out.print("Qual o preco unitario? ");
		preco = scan.nextDouble();

		System.out.println("");
		
		if (fruta.equals("laranja")) {
			System.out.println("O preco da caixa de " + fruta + " e: " + preco * laranja + " Reais");
			
		} else if (fruta.equals("limao")) {
			System.out.println("O preco da caixa de " + fruta + " e: " + preco * limao + " Reais");
			
		} else if (fruta.equals("morango")) {
			System.out.println("O preco da caixa de " + fruta + " e: " + preco * morango + " Reais");
			
		} else {
			System.out.println("Fruta nao encontrada.");
		}
		scan.close();
	}

}
