package simulacaoBug;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] alunos = { "Camila", "Lucas", "Bruna", "Pedro" };

		double media = calculadora(alunos, scan);

		System.out.printf("Media da turma %.1f", media);

	}

	public static double calculadora(String[] alunos, Scanner scanner) {

		double soma = 0;
		for (String aluno : alunos) {
			System.out.printf("Nota do aluno %s: ", aluno);
			double nota = scanner.nextDouble();
			//Erro int nota = scanner.nextDouble(); 
			soma += nota;
		}

		return soma / alunos.length;

	}

}
