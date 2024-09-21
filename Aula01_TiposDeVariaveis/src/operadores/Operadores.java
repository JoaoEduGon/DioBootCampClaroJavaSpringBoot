package operadores;

import java.sql.Date;

public class Operadores {

	public static void main(String[] args) {

		/*
		 * Operadores
		 * 
		 * Operador de atribuição é utiliazado para definir o valor inicial ou
		 * sobrescrever o valor de uma variável
		 * 
		 * == - IGUAL != - DIFERENTE < - MENOR > - MAIOR <= - MENOR OU IGUAL >= - MAIOR
		 * OU IGUAL
		 * 
		 */

	}

	/* Forma de atribuir um valor a uma variável */

	String nome = "JOAO";
	int idade = 27;
	double peso = 68.50;
	char sexo = 'M';
	boolean doadorOrgao = false;
	Date dataNascimento = new Date(0);

	/* Operadores aritiméticos */

	double soma = 10.5 + 15.5;
	int subtracao = 10 - 5;
	int multiplicacao = 10 * 5;
	int divisao = 18 / 3;
	int modulo = 18 % 3;
	double resulado = (10 * 7) + (20 / 4);

	/*
	 * Operadores de atribuição (+), quando utilizado em variáveis do tipo, texto,
	 * realizará a "Concatenação de texto
	 */

	String nomeCompleto = " LINGUAGEM" + "JAVA";

}
