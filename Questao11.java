import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {

		double operando1;
		double operando2;
		double resultado;
		char operador;

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o primeiro operando: ");
		operando1 = scan.nextDouble();

		System.out.print("Digite o segundo operando: ");
		operando2 = scan.nextDouble();

		System.out.print("Qual a operacao? ");
		operador = scan.next().charAt(0);

		System.out.println("");

		switch (operador) {
		case '+':
			resultado = operando1 + operando2;
			;
			System.out.println("Resultado: " + resultado);
			if (resultado > 0) {
				System.out.println("O resultado e positivo.");
			} else if (resultado < 0) {
				System.out.println("O resultado e negativo.");
			} else {
				System.out.println("O resultado e zero.");
			}
			if (resultado % 2 == 0) {
				System.out.println("O resultado e par.");
			} else {
				System.out.println("O resultado e impar.");
			}
			break;

		case '-':
			resultado = operando1 - operando2;
			;
			System.out.println("Resultado: " + resultado);
			if (resultado > 0) {
				System.out.println("O resultado e positivo.");
			} else if (resultado < 0) {
				System.out.println("O resultado e negativo.");
			} else {
				System.out.println("O resultado e neutro.");
			}
			if (resultado % 2 == 0) {
				System.out.println("O resultado e par.");
			} else {
				System.out.println("O resultado e impar.");
			}
			break;
		case '*':
			resultado = operando1 * operando2;
			;
			System.out.println("Resultado: " + resultado);
			if (resultado > 0) {
				System.out.println("O resultado e positivo.");
			} else if (resultado < 0) {
				System.out.println("O resultado e negativo.");
			} else {
				System.out.println("O resultado e neutro.");
			}
			if (resultado % 2 == 0) {
				System.out.println("O resultado e par.");
			} else {
				System.out.println("O resultado e impar.");
			}
			break;
		case '/':
			resultado = operando1 / operando2;
			;
			System.out.println("Resultado: " + resultado);
			if (resultado > 0) {
				System.out.println("O resultado e positivo.");
			} else if (resultado < 0) {
				System.out.println("O resultado e negativo.");
			} else {
				System.out.println("O resultado e zero.");
			}
			if (resultado % 2 == 0) {
				System.out.println("O resultado e par.");
			} else {
				System.out.println("O resultado e impar.");
			}
			break;
		default:
			System.out.println("Operação invalida");
		}

		scan.close();

	}

}
