package tratamentoExcecoes;

import java.util.Locale;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		try { //  bloco de código conforme esperado

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite seu nome");
		String nome = scanner.next();

		System.out.println("Digite seu sobrenome");
		String sobrenome = scanner.next();

		System.out.println("Digite sua idade");
		int idade = scanner.nextInt();

		System.out.println("Digite  sua altura");
		double altura = scanner.nextDouble();

		System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
		System.out.println("Tenho " + idade + " anos ");
		System.out.println("Minha altura e " + altura + "cm ");
		scanner.close();
		
		}
		catch(java.util.InputMismatchException e) { 
			 
			 // precisamos saber qual exceção
			 // bloco de código que captura as exceções que podem acontecer
			 // em caso de um fluxo não previsto
			
			System.out.println("O campo idade e altura precisam ser numericos ");
			
			
		}

}

}