package condicionalSimples;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Saldo = ");
		double saldo = sc.nextDouble(); //= 25,00
		System.out.println("valor a ser sacado");
		double valorSolicitado = sc.nextDouble();  //=17,00

		if (valorSolicitado < saldo) {
			saldo = saldo - valorSolicitado;
		}

		System.out.println(saldo);
		
		sc.close();
	}

}
