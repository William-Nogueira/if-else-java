import java.util.Scanner;

public class Questao9 {

	public static void main(String[] args) {

		String aluno;
		double nota1;
		double nota2;
		double nota3;
		double mediaExercicios;
		double mediaAproveitamento;

		Scanner scan = new Scanner(System.in);

		System.out.print("Qual o nome do aluno? ");
		aluno = scan.nextLine();
		System.out.print("Qual a nota 1? ");
		nota1 = scan.nextDouble();
		System.out.print("Qual a nota 2? ");
		nota2 = scan.nextDouble();
		System.out.print("Qual a nota 3? ");
		nota3 = scan.nextDouble();
		System.out.print("Qual a media dos exercicios? ");
		mediaExercicios = scan.nextDouble();

		System.out.println("");

		mediaAproveitamento = (nota1 + (nota2 * 2) + (nota3 * 3) + mediaExercicios) / 7;

		if (mediaAproveitamento >= 9) {
			System.out.println("O conceito do aluno " + aluno + " foi: A");
		} else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9) {
			System.out.println("O conceito do aluno " + aluno + " foi: B");
		} else if (mediaAproveitamento >= 6 && mediaAproveitamento < 7.5) {
			System.out.println("O conceito do aluno " + aluno + " foi: C");
		} else {
			System.out.println("O conceito do aluno " + aluno + " foi: D");
		}

		scan.close();
	}

}
