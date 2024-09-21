package operadores;

public class Relacionais {

	public static void main(String[] args) {
		
		//Relacionais 
		
		String nomeUm = "Joao";
		String nomeDois	= new String("Eduardo");
		
		System.out.println(nomeUm.equals(nomeDois));		
		
		int numero1 = 1;
		int numero2 = 2;
		
		
		boolean  SimNao = numero1 == numero2;
		
		if (numero1 < numero2) {
			System.out.println("A nossa condição e verdadeira");
		}else {
			System.out.println("A nossa condição e falsa");
		}
		
		System.out.println("NumeroUm e igual a numeroDois? " + SimNao);

        SimNao = numero1 != numero2;
		
		System.out.println("NumeroUm e diferente a numeroDois? " + SimNao);

        SimNao = numero1 >= numero2;
		
		System.out.println("NumeroUm e maior que numeroDois? " + SimNao);


	}

}
