package operadores;

public class Unarios {

	public static void main(String[] args) {

		/* Unários */

		/*
		 * Esses operadores são aplicados juntamente com um outro operador aritimétrico.
		 * Ele realizam alguns trabalhos básicos como incrementar, decrementar, inverter
		 * valores numéricos e booleanos.
		 */
		
		/*(+) Opreadoor unários de valor positivo - números são positivos sem esse operador explicitamente;
		  (-) Opreadoor unários de valor negativo - nega um valor ou uma expressão aritimética;
		  (++) Opreadoor unários de valor incremento de valor - incrementa valor 1 unidade;
		  (--) Opreadoor unários de valor decremento de valor - decrementa o valor em 1 unidade;
		  (!) Opreadoor unários lógicos de negação - nega valor de uma expressão boolena;
		*/

		int numero = 5;
		
		numero = -  numero; 
		
		System.out.println(numero * - 1);
		
		System.out.println(numero);
	}
	
	

}
