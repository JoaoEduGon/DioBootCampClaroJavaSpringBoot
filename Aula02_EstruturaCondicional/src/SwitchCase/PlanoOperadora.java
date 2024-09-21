package SwitchCase;

import java.util.Scanner;

public class PlanoOperadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String plano = sc.next();

		switch (plano) {
		case "T": {
			System.out.println("5Gb YouTube");
			break;
		 }

		case "M": {
			System.out.println("Whats e Instagrem grátis");
			break;
		 }
		case "B": {
			System.out.println("100 Minutos de ligaçõa");
			break;
		 }
	
		default:
			System.out.println("INDEFINIDO");
		
		}
		
		sc.close();
	}

}
