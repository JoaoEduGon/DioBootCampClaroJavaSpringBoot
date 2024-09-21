package Conta;

import java.util.Scanner;

public class ContaTerminal {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
	
		Cadastro();		

	}

	public static void Cadastro() {

		char c;
		
		System.out.println("\nPor favor, digite o número da Agência ");
		int  numero = input.nextInt();
		
		System.out.println("\nPor favor, digite número da conta");
		c = input.next().charAt(0);
		
		System.out.println("Insira nome do usuário");
		String nomeCliente = input.next();
		
		System.out.println("Digite o valor há ser depositado");
		String saldo = input.next();
		
		System.out.println("Olá " 
		+ numero +" obrigado por criar uma conta em nosso banco, sua agência é "
		+ c + " conta " 
		+ nomeCliente + " e seu saldo " 
		+ saldo + " já está disponível para saque\".");
	
	}

}
