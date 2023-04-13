import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		
		int dia;
		String nome;
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o dia da semana de 1 a 7: ");
		dia = scan.nextInt();

		switch (dia) {
		case 1:
			nome = "Domingo";
			break;
		case 2:
			nome = "Segunda-feira";
			break;
		case 3:
			nome = "Terça-feira";
			break;
		case 4:
			nome = "Quarta-feira";
			break;
		case 5:
			nome = "Quinta-feira";
			break;
		case 6:
			nome = "Sexta-feira";
			break;
		case 7:
			nome = "Sabado";
			break;
		default:
			nome = "Digite um numero de 1 a 7";
			break;
		}

		System.out.println("O dia da semana e " + nome);

		scan.close();

	}

}
