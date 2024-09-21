package condicionalEncadeada;

import java.util.Scanner;

public class ResultadoEscolar_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua media escolar");
		int media = sc.nextInt();

		if (media >= 7) {
			System.out.println("Aprovado");
		} else if (media < 5 && media < 7) {
			System.out.println("Prova reprovaDO");
		} else {
			System.out.println("Recuperação");
		}

		sc.close();

	}

}
