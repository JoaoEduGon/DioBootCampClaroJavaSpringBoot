
package ControleTv;

public class Usuario {
	
	
	public static void main(String[] args) {
		
		SmartTV smartTV = new SmartTV(); 
		
		smartTV.diminuirVolume();
		smartTV.diminuirVolume();
		smartTV.diminuirVolume();
		smartTV.diminuirVolume();
		smartTV.aumentarVolume();
		
		System.out.println("Volume : " + smartTV.Volume);
		
		smartTV.mudarCanal(13);
		System.out.println("Canal atual : " + smartTV.Canal);
		
		
		System.out.println("TV ligada ? " + smartTV.ligada);
				
		
		smartTV.ligar();		
		System.out.println("Novo status -> TV ligada ? " + smartTV.ligada);
		
		smartTV.desligar();		
		System.out.println("Novo status -> TV ligada ? " + smartTV.ligada);
		
	}

}
