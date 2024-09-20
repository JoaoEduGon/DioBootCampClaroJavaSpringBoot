package SwitchCase;

import java.util.Scanner;

public class SistemaMedia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String sigla = sc.next();

		switch (sigla) {
		case "P": {
			System.out.println("PEQUENO");
			break;
		 }

		case "M": {
			System.out.println("MEDIO");
			break;
		 }
		case "G": {
			System.out.println("GRANDO");
			break;
		 }
	
		default:
			System.out.println("INDEFINIDO");
		
		}
		
		sc.close();
	}
}
