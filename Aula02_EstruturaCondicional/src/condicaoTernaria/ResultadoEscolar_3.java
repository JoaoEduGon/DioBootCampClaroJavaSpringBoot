package condicaoTernaria;

import java.util.Scanner;

public class ResultadoEscolar_3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nota = sc.nextInt();
		
		String resultado = nota >=7 ? "Aprovado"  : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		
		System.out.println(resultado);
		
		sc.close();
		
	}

}
