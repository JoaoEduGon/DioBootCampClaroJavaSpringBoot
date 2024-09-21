package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PrecessoSeletivo {

	public static void main(String[] args) {

		String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO" };
		for (String candidato : candidatos) {
			entrandoEmContato(candidato);
		}
	}
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuaTentando = true;
		boolean antendeu = false;
		do {
			antendeu = atender();
			continuaTentando = !antendeu;
			if (continuaTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");

		} while (continuaTentando && tentativasRealizadas < 3);
		
		if(antendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVAS");
	else
		System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " TENTATIVAS" );
		
	}

	static boolean atender() {
		return new Random().nextInt(3) == 1;
	}

	
	static void imprimirSelecionados() {
		String[] candidatos = { "FELIPE", "MARCIA", "PAULO", "AUGUSTO", "JULIA" };

		System.out.println("Imprimindo lista de candidatos informando o indice do elemento");
		for (int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidado Nº " + (indice + 1) + " é " + candidatos[indice]);
		}
	}

	static void selecaoCandidatos() {
		String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA",
				"DANIELA", "JORGE" };

		int candidatoSelecionados = 0;
		int candidatosAtuais = 0;
		double salarioBase = 2000.0;
		while (candidatoSelecionados < 5 && candidatosAtuais < candidatos.length) {
			String cadidato = candidatos[candidatosAtuais];
			double salarioPretendido = valorPretendido();

			System.out.println("O candidato " + cadidato + " Solicitou este valor de salário " + salarioPretendido);
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + cadidato + " foi selecionado para vaga");
				candidatoSelecionados++;
			}
			candidatosAtuais++;
		}
	}

	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

	static void analisarCandidatos(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} else if (salarioBase == salarioPretendido)
			System.out.println("LIGAR PARA CANDIDATO CONTRA PROPOSTA");
		else {
			System.out.println("AGUARDANDO O RESULTADO DOS DE MAIS");
		}
	}
}
