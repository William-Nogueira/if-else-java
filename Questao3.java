import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		int codigo;

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o codigo: ");
		codigo = scan.nextInt();

		System.out.println("");
		
		if (codigo == 1) {
			System.out.println("Alimento nao-perecivel");
			
		} else if (codigo >= 2 && codigo <= 4) {
			System.out.println("Alimento perecivel");
			
		} else if (codigo == 5 || codigo == 6) {
			System.out.println("Vestuario");
			
		} else if (codigo == 7) {
			System.out.println("Higiene pessoal");
			
		} else if (codigo >= 8 && codigo <= 15) {
			System.out.println("Limpeza e utenlisios domesticos");
			
		} else {
			System.out.println("Codigo invalido");
		}
		
		scan.close();
	}

}
