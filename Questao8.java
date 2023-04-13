import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {

		double operando1;
		double operando2;
		double resultado;
		String operador;

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o primeiro operando: ");
		operando1 = scan.nextDouble();

		System.out.print("Digite o segundo operando: ");
		operando2 = scan.nextDouble();

		System.out.print("Qual a operacao? ");
		operador = scan.next();

		System.out.println("");

		if (operador.equals("+")) {
			resultado = operando1 + operando2;
			System.out.println("Resultado: " + resultado);

		} else if (operador.equals("-")) {
			resultado = operando1 - operando2;
			System.out.println("Resultado: " + resultado);

		} else if (operador.equals("*")) {
			resultado = operando1 * operando2;
			System.out.println("Resultado: " + resultado);

		} else if (operador.equals("/")) {
			resultado = operando1 / operando2;
			System.out.println("Resultado: " + resultado);

		} else {
			System.out.println("Erro");
		}

		scan.close();
	}

}
