package condicionalComposta;

import java.util.Scanner;

public class ResultadoEscolar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua media");
		int media = sc.nextInt();

		if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

		sc.close();
	}

}
