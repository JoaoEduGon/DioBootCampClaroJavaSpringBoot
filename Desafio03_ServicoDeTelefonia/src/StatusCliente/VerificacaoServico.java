package StatusCliente;
import java.util.Arrays;
import java.util.Scanner;

public class VerificacaoServico {
    @SuppressWarnings("unused")
	public static void main(String[] args) {
    	
    	/*
    	Entrada	               Saída
    	movel
    	Alice,movel,fixa	    Sim

    	fixa
    	Bob,movel,tv	        Nao

    	tv
    	Carol,movel,fixa,tv	    Sim
    	*/
        
    	Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim(); // .trim(); O método trim() remove os espaços em branco
        
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim(); // .trim(); O método trim() remove os espaços em branco
        
        // Separando o nome do cliente e os serviços contratados
       
        String[] partes = entradaCliente.split(","); 
        
        /*O método split()divide uma Stringem uma lista ordenada de 
        substrings, coloca essas substrings em um array e retorna o array. A divisão é feita buscando um padrão,
         onde o padrão é fornecido como o primeiro parâmetro na chamada do método.*/
        
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        System.out.println(entradaCliente);
        
        // TODO: Verifique se o serviço está na lista de serviços contratados
        contratado = Arrays.stream(partes).anyMatch(servico::equals);

        System.out.println(contratado ? "Sim" : "Nao");
        
        scanner.close();
    }
}

